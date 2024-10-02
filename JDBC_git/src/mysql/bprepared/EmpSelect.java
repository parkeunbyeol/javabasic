package mysql.bprepared;

import java.sql.*;

public class EmpSelect {

	// 0. 필요한 변수 선언
	static String driver 	= "oracle.jdbc.driver.OracleDriver";
	static String url 		= "jdbc:oracle:thin:@192.168.0.47:1521:xe";
	static String user 		= "scott"; // 계정 
	static String pass 		= "tiger"; // 비번

	public static void main (String [] args) {
		
		try {
			//[1] 드라이버를 메모리 로딩
			Class.forName(driver);
			
			//[2] SQL 문자 (*****)

			String sql = "SELECT * FROM emp";
			System.out.println("[SQL]: " + sql);
			

			//[3] 연결객체 얻어오기
			Connection con = DriverManager.getConnection(url, user, pass);
			
			//[4] 전송객체 얻어오기
			//Statement ps = con.createStatement();
			PreparedStatement ps = con.prepareStatement(sql);
				//*******? 지정하기 , *** sql문에서 ?가 없을 시 그냥 안쓰면 됨.. 

			//[5] 전송
			/*		int 		executeUpdate() : INSERT, UPDATE, DELETE, DDL
			 * 		ResultSEt	executeQuery()  : SELECT
			 * 
			 * 
			 */
			// ps.executeUpdate(sql);			
			ResultSet rs = ps.executeQuery();		   // *** sql을 미리 위에서 저장했기 때문에 여기서는 저장 ㄴㄴ
			// 출력 하고자 하는 table의 row 수를 모르기 때문에 for문이 아닌 while문을 사용
			while(rs.next()) {                          
				System.out.print(rs.getInt("EMPNO")		+"\t"); 
				System.out.print(rs.getString("ENAME")	+"\t");
				System.out.println(rs.getString("JOB")	+"\n");
			}
			
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
