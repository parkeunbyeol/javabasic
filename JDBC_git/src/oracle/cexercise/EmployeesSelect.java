package oracle.cexercise;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeesSelect {
	// 0. 필요한 변수 선언
	static String driver 	= "oracle.jdbc.driver.OracleDriver";
	static String url 		= "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	static String user 		= "hr"; // 계정 
	static String pass 		= "hr"; // 비번

	public static void main(String[] args) {

		Connection con			= null;       // 지역변수는 무조건 
		PreparedStatement ps	= null;

		try {
			//[1] 드라이버를 메모리 로딩
			Class.forName(driver);

			//[2] SQL
			//월급이 10000 이상 받는 사원의 정보에서 사원명, 월급, 부서번호, 전화번호를 추출
			String sql = " SELECT FIRST_NAME || ' ' || LAST_NAME FULL_NAME	"
					+	 ", salary, department_id, phone_number	"
					+    " FROM  EMPLOYEES "  										
					+ 	 " WHERE SALARY >= 10000 ";							 

			//[3] 연결객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);

			//[4] 전송객체 얻어오기
			//Statement ps = con.createStatement();
			ps = con.prepareStatement(sql);
			//*******? 지정하기 , *** sql문에서 ?가 없을 시 그냥 안쓰면 됨.. 

			//[5] 전송
			// ps.executeUpdate(sql);			
			ResultSet rs = ps.executeQuery();		   // *** sql을 미리 위에서 저장했기 때문에 여기서는 저장 ㄴㄴ
			// 출력 하고자 하는 table의 row 수를 모르기 때문에 for문이 아닌 while문을 사용
			while(rs.next()) {  
				
				System.out.print(	rs.getString("FULL_NAME")		+"\t"); 
				System.out.print(	rs.getInt("SALARY")				+"\t");
				System.out.print(	rs.getInt("DEPARTMENT_ID")		+"\t");
				System.out.print( rs.getString("PHONE_NUMBER")	+"\n" );
				
			} // end of while	
			
		}catch(Exception ex) {
			
			System.out.println("예외:" + ex.getMessage());
			
		}finally {
			
			//[6] 닫기
			try {
				ps.close();
				con.close();
				
			} catch(Exception ex) {}

		} //end of finally	


	} //end of main

}// end of class
