package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.RentDao;

public class RentDaoImpl implements RentDao{
	
	static String driver 	= "oracle.jdbc.driver.OracleDriver";
	static String url 		= "jdbc:oracle:thin:@192.168.0.31:1521:xe";
	static String user 		= "minji";
	static String pass 		= "lee";

	public RentDaoImpl() throws Exception {
		// 1. 드라이버 로딩
		Class.forName(driver);

	}
	
	@Override
	public int rentVideo(String tel, int vnum) throws Exception {
	   
		Connection con = null;  
		PreparedStatement ps = null;
		int result = 0 ;

		String sql = " INSERT INTO "
				+ 	 " rent(rno, vno, m_tel, rent_date, return ) 	"
				+	 " VALUES(seq_rent_rno.NEXTVAL,?,?,sysdate, 'N')	";
		System.out.println(">> [SQL] " + sql);
		try{
			// 3. 연결 객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);

			// 4. 전송 객체 얻어오기
			ps = con.prepareStatement(sql);
			ps.setInt(1, vnum);
			ps.setString(2, tel);
		
			System.out.println("전송객체");

			// 5. sql 전송
			result = ps.executeUpdate(); 
				
		} finally {
			// 닫기
			ps.close();
			con.close();	
		}

		return result;
	}

	@Override
	public int returnVideo(int vnum) throws Exception {
		// 반납할 비디오 번호를 넘겨받고 반납처리하기

		Connection con = null;  
		PreparedStatement ps = null;
		int result = 0;
		
		try {
		String sql = " UPDATE rent						   "
				+	 " SET return_date=sysdate, return = 'Y'    	   "
				+	 " WHERE vno=? and return = 'N' "; // 넘겨받은 비디오 번호를 찾아 반납일을 오늘날짜로 지정한다.
							// 반납일이 NULL인 조건은 과거의 반납된 기록까지 바뀌지 않게 조건으 한 번 더 걸어준다
		
		// 3. 연결 객체 얻어오기
		con = DriverManager.getConnection(url, user, pass);

		// 4. 전송 객체 얻어오기
		ps = con.prepareStatement(sql);
		ps.setInt(1, vnum);
		
		// 5. sql 전송
		result = ps.executeUpdate(); 
		
		} finally {
		ps.close();
		con.close();
		
		}
		return result;
	}
	
	

	@Override
	public ArrayList selectNoReturnList() throws Exception {
		
		Connection con = null;  
		PreparedStatement ps = null;
		
		ArrayList list = new ArrayList();
		
		String sql = " SELECT v.vno			vno									"
				+ 	 "	, m.MV_TITLE		mv_title							"
				+ 	 "	, c.M_NAME 			m_name								"
				+ 	 "	, c.M_TEL 			m_tel								"
				+ 	 "	, r.rent_date+3 	duedate								"
				+ 	 "	, r.RETURN			noreturn							"
				+ 	 " FROM rent r Inner JOIN MEMBER c ON  r.M_TEL = c.M_TEL	"
				+ 	 "			   INNER JOIN video v  ON r.vno = v.VNO			"
				+ 	 "			   INNER JOIN movie m  ON v.mvno = m.mvno		"
				+ 	 " WHERE r.RETURN = 'N'										";
		
		try {
		// 3. 연결 객체 얻어오기
		con = DriverManager.getConnection(url, user, pass);

		// 4. 전송 객체 얻어오기
		ps = con.prepareStatement(sql);
		
		// 5.sql 전송
		ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {		// 미반납자가 몇명인지 모르기 때문에 while을 사용한다
				ArrayList temp = new ArrayList();
				temp.add(rs.getInt("vno"));
				temp.add(rs.getString("mv_title"));
				temp.add(rs.getString("m_name"));
				temp.add(rs.getString("m_tel"));  // int일수도
				temp.add(rs.getDate("duedate"));
				temp.add(rs.getString("noreturn"));
				
				list.add(temp); // 위에 하나씩 temp에 저장한 vno, mv_title... 등의 데이터 덩어리를 98행에 선언한 변수 list에 넣어준다
			}
		 
		} finally{
			//닫기
			ps.close();
			con.close();						
		 }
		
		return list;
	}

	
	
	
}
