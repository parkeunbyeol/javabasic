package oracle.astatement;

import java.sql.*;

import java.sql.DriverManager;

public class EmpDelete {

		// 0. 필요한 변수 선언
	static String driver 	= "oracle.jdbc.driver.OracleDriver";
	static String url 		= "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	static String user 		= "scott";
	static String pass 		= "tiger";

	public static void main (String [] args) {
		
		try {
			//[1] 드라이버를 메모리 로딩
			Class.forName(driver);
			
			//[2] SQL 문자 (*****)
			// 업무가 IT인 직원을 삭제하기
			String sql = "DELETE FROM emp  "
					 + " WHERE job = 'IT' "; //자바 문자열은  '' 
			
			System.out.println("[SQL]"+sql);
						
			//[3] 연결객체 얻어오기
			Connection con = DriverManager.getConnection(url, user, pass);
			
			//[4] 전송객체 얻어오기
			Statement ps = con.createStatement();
			
			//[5] 전송
			ps.executeUpdate(sql);			
			
			//[6] 닫기
			ps.close();
			con.close();
			
						
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버로딩실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("연결실패" + e.getMessage());
			//e.printStackTrace();
		}
		
	
	}

}
