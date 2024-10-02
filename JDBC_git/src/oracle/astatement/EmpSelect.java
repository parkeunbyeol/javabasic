package oracle.astatement;

import java.sql.*;

import java.sql.DriverManager;

public class EmpSelect {

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
			String sql = "SELECT * FROM emp ";
			System.out.println("[SQL]"+sql);
						
			//[3] 연결객체 얻어오기
			Connection con = DriverManager.getConnection(url, user, pass);
			
			//[4] 전송객체 얻어오기
			Statement ps = con.createStatement();
			
			//[5] 전송
			/*		int 		executeUpdate() : INSERT, UPDATE, DELETE, DDL
			 * 		ResultSEt	executeQuery()  : SELECT
			 * 
			 * 
			 */
			ResultSet rs = ps.executeQuery(sql);		 //ResultSet은 int, double 과 같은 자료 형이고 rs는 변수명이다
			while(rs.next()) {                           //다음 레코드(데이터 값)가 있으면 출력 후 다음 열로 내려오고, 다음 데이터가 없다면 끝내는 함수
				System.out.print(rs.getInt("EMPNO")		+"\t"); // "/"는 다음열로 넘어가줌 "\t"는 예쁘게 출력해줌
				System.out.print(rs.getString("ENAME")	+"\t");
				System.out.println(rs.getString("JOB"));
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
