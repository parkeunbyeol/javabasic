package oracle.bprepared;

import java.sql.*;

import java.sql.DriverManager;

public class EmpInsert2 {

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
					// 사용자 입력값을 받는다고 가정
					int sabun = 9999;
					String irum = "바보";
					String upmu = "IT";
					int sal = 77777;
					
			String sql = "Insert Into emp(empno,ename, sal, job)  "
					+  " VALUES(?,?,?,?)";
			
			System.out.println("[SQL]"+sql);
						
			//[3] 연결객체 얻어오기
			Connection con = DriverManager.getConnection(url, user, pass);
			
			//[4] 전송객체 얻어오기
			/*
			 * 		- Statement  		: 완벽한 SQL 문장
			 * 		- PreparedStatement : 미완성한 SQL 문장
			 * 		- CallableStatemetn : PL-SQL 함수 (function/proceudre) 호출			 * 
			 */
			//Statement ps = con.createStatement();
			PreparedStatement ps = con.prepareStatement(sql);
				// 미완성부분을 채우기
				ps.setInt(1, sabun);
				ps.setString(2, irum);
				ps.setInt(3, sal);
				ps.setString(4, upmu);
			
			//[5] 전송
			ps.executeUpdate();			
			
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
