package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.StampDao;
import model.vo.VideoVO;

public class StampDaoImpl implements StampDao { //Impl이라는 클래스명은 인터페이스를 구현한 클래스라는 느낌을 준다.

	static String driver 	= "oracle.jdbc.driver.OracleDriver";
	static String url 		= "jdbc:oracle:thin:@192.168.0.31:1521:xe";
	static String user 		= "minji";
	static String pass 		= "lee";
	


	
	public StampDaoImpl() throws Exception {
		// 1. 드라이버로딩
		Class.forName(driver);	
}
	
	@Override
	public VideoVO selectByPk(int vnum) throws Exception{
		
		VideoVO result = new VideoVO();
	
		Connection con = null;
		PreparedStatement ps = null;
		
		
		// sql
		String sql = " SELECT * FROM movie	"
				+	 " WHERE mvno= ?		";
		
		System.out.println(sql);
		
		try {
		// 3. 연결객체
			con = DriverManager.getConnection(url, user, pass);
		
		
		// 4.전송객체
			ps = con.prepareStatement(sql);
			ps.setInt(1, vnum);
		
			System.out.println("전송객체");
		
		//[5] 전송
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {				
				result.setMv_genre(rs.getString("mv_genre"));
				result.setMv_title(rs.getString("mv_title"));
				result.setMv_direc(rs.getString("mv_direc"));
				result.setMv_actor(rs.getString("mv_actor"));
				result.setMv_exp(rs.getString("mv_exp")); // vo.setMv_exp("mv_exp");로 하게 되면, mv_exp라는 문자열을 저장하는 코딩이 되어버림.  
				result.setMvno(rs.getInt("mvno")); 										// 나는 Resultset에 rs라는 변수명에 저장되어있는 한 행의 데이터 열에서 컬럼명이 "mx_exp"인 컬럼의 데이터 값을 원하기 때문에 (rs.getString("mv_exp"))를 사용해야한다.  
				 										// 그리고 그 값을 vo 클래스의 setMv_exp에 저장해 준다.
			}
		} finally {
		// 닫기
			ps.close();
			con.close();
		}
		
		return result;
		
	}

	public ArrayList selectVideos(int idx, String word) throws Exception {
		ArrayList list = new ArrayList();
		
		String [] cate = {"mv_title", "mv_direc", "mv_actor"}; // 순서대로 0,1,2
		
		String sql = " SELECT mvno, mv_title, mv_direc, mv_actor		"
				+	 " FROM movie										"
				+	 " WHERE  " + cate[idx] + " LIKE '%" + word + "%'	"	; // word는 변수이므로 + word +
		System.out.println(sql);
	
		Connection con = null;
		PreparedStatement ps = null;
		
		// 연결 객체 얻어오기
		con = DriverManager.getConnection(url, user, pass);
		
		// 전송 객체 얻어오기
		ps = con.prepareStatement(sql);
		
		// 전송
		ResultSet rs  = ps.executeQuery();
		while(rs.next()) {
			ArrayList temp = new ArrayList();
			temp.add(rs.getInt("mvno"));
			// 나머지도
			temp.add(rs.getString("mv_title"));
			temp.add(rs.getString("mv_direc"));
			temp.add(rs.getString("mv_actor"));
			
			list.add(temp);
			
			}
		
		return list;
	}
	/*
	 * 메소드명 :
	 * 인자	:
	 * 리턴값	:
	 * 역할	:
	 */
	public void insertVideo(VideoVO vo, int count) throws Exception {

		// 2.sql문장
		String movieSql =" INSERT INTO MOVIE(mvno, mv_genre, mv_title, mv_direc, mv_actor, mv_exp, mv_inven )	"
					+	 " VALUES(seq_movie_mvno.NEXTVAL,?,?,?,?,?,?)									";
		String videoSql =" INSERT INTO VIDEO (vno, mvno)											"
					+	 " VALUES(seq_video_vno.NEXTVAL, seq_movie_mvno.CURRVAL)					";
		
		Connection con = null;  
	    PreparedStatement ps1 = null;
	    PreparedStatement ps2 = null;
		
		
		try {
			///3. 연결객체
			con = DriverManager.getConnection(url, user, pass);
			
			// 4-1 전송객체
			ps1 = con.prepareStatement(movieSql);
				// ? 지정하기
				ps1.setString(1, vo.getMv_genre());
				ps1.setString(2, vo.getMv_title());
				ps1.setString(3, vo.getMv_direc());
				ps1.setString(4, vo.getMv_actor());
				ps1.setString(5, vo.getMv_exp());
				ps1.setInt(6, vo.getMv_inven());
			//5-1. 전송 민지가 말한거 
				ps1.executeUpdate();
		
			
			
			// 4-2 전송객체
			ps2 = con.prepareStatement(videoSql);
			// 5-2. 전송
			for( int i = 0 ; i < count ; i ++) {
				ps2.executeUpdate();
			}				
			
		} finally {
			//6.닫기
		     ps1.close();
		     ps2.close();
		     con.close();
		}
	}

	public void modifyVideo( VideoVO vo ) throws Exception {
		
		Connection con = null;
	    PreparedStatement ps = null;
	    

	    // 2. sql 문장
	    String sql 	= " UPDATE movie		"
		    		+ " SET mv_genre=?, mv_title=?, mv_direc=?, mv_actor=?, mv_exp=?	"
		    		+ " WHERE mvno = ?	";
	    
//	    String videoSql 		= " UPDATE INTO video (vno, mvno)											"
//					+	 		  " SET (vno=?, mvno)					";
	    
	    
	    try {
	    // 3. 연결 객체 얻어오기
	    con = DriverManager.getConnection(url, user, pass);
	   
	    // 4. 전송 객체 얻어오기
	    ps = con.prepareStatement(sql);
	    // 미완성 부분 채우기
	    ps.setString(1, vo.getMv_genre());
	    ps.setString(2, vo.getMv_title());
	    ps.setString(3, vo.getMv_direc());
	    ps.setString(4, vo.getMv_actor());
	    ps.setString(5, vo.getMv_exp());
//	    ps.setInt(6, vo.getMv_inven());
	    ps.setInt(6, vo.getMvno());
	 
	    // 5. 전송
	    int result = ps.executeUpdate();
	    System.out.println( result + "형 입력");
	    
	    } finally {
	    	// 6. 닫기
	    	ps.close();
	    	con.close();
	    	
	    }
	}

	@Override
	public int rentVideo(String tel, int vnum) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int returnVideo(int vnum) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList selectNoReturnList() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	


}
