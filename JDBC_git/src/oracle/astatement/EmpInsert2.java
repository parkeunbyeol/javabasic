package oracle.astatement;

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
					int sabun = 3333;
					String irum = "신길동";
					String upmu = "IT";
					int sal = 10000;
					
			String sql = "Insert Into emp(empno,ename, sal, job)  "
					+  " VALUES("  + sabun + ","
					+  " '" + irum + "',"        // 세미콜론(')를 넣으려면 문자열 취급을 해야함. 문자열은 " " 를 사용하여 넣어주므로 " ' "가 된다.
					+		  sal  + ","		 // + 컬럼이름 + ", ' " 이렇게 하면 출력 했을 때 (컬럼이름, ')과 같이 나옴
					+  " '" + upmu + "') ";		 // " ' ) " 를 출력하게 되면 ' ) 만 나오게 된다
			
			System.out.println("[SQL]"+sql);
						
			//[3] 연결객체 얻어오기
			Connection con = DriverManager.getConnection(url, user, pass);
			
			//[4] 전송객체 얻어오기
			Statement ps = con.createStatement();
			
			//[5] 전송
//			ps.executeUpdate(sql);			
			
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
