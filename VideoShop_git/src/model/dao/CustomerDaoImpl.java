package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.CustomerDao;

import model.vo.CustomerVO;

public class CustomerDaoImpl implements CustomerDao{
	// 0. 필요한 변수 선언
	static String driver 	= "oracle.jdbc.driver.OracleDriver";
	static String url 		= "jdbc:oracle:thin:@192.168.0.31:1521:xe";
	static String user 		= "minji";
	static String pass 		= "lee";
	

	public CustomerDaoImpl() throws Exception{
		// 1. 드라이버로딩
		Class.forName(driver);	
	}

	/**
	 *   역할 : 입력받은 고객 정보를 넘겨받아 customer 테이블에 입력
	 */
	public void insertCustomer(CustomerVO vo) throws Exception{
		
		Connection con = null;  
		PreparedStatement ps = null;
		
		// 2. sql 문장 만들기
		String sql = "INSERT INTO MEMBER(M_TEL, M_NAME, M_TEL2, M_ADDR, M_MAIL)"
				+	" VALUES(?,?,?,?,?)";
		// 3. Connection 연결객체 얻어오기		
		try {
		con = DriverManager.getConnection(url, user, pass);
		// 4. sql 전송객체 (PreparedStatement)	
		ps = con.prepareStatement(sql);
		
		ps.setString(1, vo.getCustTel1());
		ps.setString(2, vo.getCustName());
		ps.setString(3, vo.getCustTel2());
		ps.setString(4, vo.getCustAddr());
		ps.setString(5, vo.getCustEmail());
		// 5. sql 전송
		
		int result = ps.executeUpdate(); 
		System.out.println(result + "형 입력");
 
		} finally { 
			
		// 6. 닫기 
		ps.close();
		con.close();
		
		} // end of finally
		
	}
	
	// 전화번호를 입력 받아 해당 번호의 고객 정보를 검색
	public CustomerVO selectByTel(String tel) throws Exception{
		
		Connection con = null;
		PreparedStatement ps = null;
				
		System.out.println(tel);			
		CustomerVO vo = new CustomerVO();
		
		//2. SQL 문장
		String sql = "SELECT * FROM MEMBER WHERE M_TEL =? ";
		
		try {
			// 3. 연결객체
			con = DriverManager.getConnection(url, user, pass);
			
			// 4.전송객체
			ps = con.prepareStatement(sql);
			ps.setString(1, tel);

			//[5] 전송
			ResultSet rs = ps.executeQuery();
			
			
			if(rs.next()) {
				vo.setCustName(rs.getString("M_NAME"));      // vo.setNAME vo꺼 , (rs.)이건 데이터베이스꺼// 비어있는 vo에(27행에 new infovo()를 만들어줌) setNAME을 (rs.) 처럼 괄호안에 있는 거로 설정해준다.
				vo.setCustTel1(rs.getString("M_TEL"));
				vo.setCustAddr(rs.getString("M_ADDR"));											
				vo.setCustTel2(rs.getString("M_TEL2"));
				vo.setCustEmail(rs.getString("M_MAIL"));
			}
			
		}finally {
			ps.close();
			con.close();
		}// end of finally
		
		return vo;

	}

	public int updateCustomer(CustomerVO vo) throws Exception{
		
		Connection con = null;  
		PreparedStatement ps = null;
		
		// 2. sql 문장
		String sql = "UPDATE MEMBER	"
				+	" SET M_NAME=?, M_TEL2=?, M_ADDR=?, M_MAIL=?	"
				+	" WHERE M_TEL=? ";
		
		int result = 0; // try 구문 안에 넣어버리면 return시에 사용할 수 없다.
		
		try {
		// 3. 연결 객체 얻어오기
		//Connection con = DriverManager.getConnection(url, user, pass);
//			->62행에 com.close를 하려면 Connection가 인식될 수 있게 같은 괄호안에 있어야 한다. 때문에 여기다 적지않고 23행에 빼주어서 오류를 해결
		con = DriverManager.getConnection(url, user, pass);
		
		//[4] 전송객체 얻어오기
		/*
		 * 		- Statement  		: 완벽한 SQL 문장
		 * 		- PreparedStatement : 미완성한 SQL 문장
		 * 		- CallableStatemetn : PL-SQL 함수 (function/proceudre) 호출			 * 
		 */
		//Statement ps = con.createStatement();
		ps = con.prepareStatement(sql);
		// 미완성부분 채우기
		ps.setString(1, vo.getCustName());
		ps.setString(2, vo.getCustTel2());
		ps.setString(3, vo.getCustAddr());
		ps.setString(4, vo.getCustEmail());
		ps.setString(5, vo.getCustTel1());
		
		// 5. 전송
//		 int executeUpdate() : INSERT, UPDATE, DELETE, DDL
//		 ResultSet executeQuery() : SELECT

		result = ps.executeUpdate(); //40행에 con.prepareStatement(sql)에 sql이 들어갔으므로 여기에는 적지 않는다.
		System.out.println(result + "형 입력");

		} finally {
			
			// 6. 닫기       // finally는 무조건 수행함. 
			ps.close();
			con.close();
		
			} // end of finally

		return result; 
	}
	
	
	
	
}
