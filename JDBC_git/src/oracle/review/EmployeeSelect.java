package oracle.review;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/*
 * 		부서번호를 입력 받아서 해당 부서의 사원들의 full name과 연봉(salary와 보너스를 합친 금액)
 * 		그리고 해당 부서의 부서명을 출력
 */
public class EmployeeSelect {

	// 0. 필요한 변수 선언
	static String driver 	= "oracle.jdbc.driver.OracleDriver";
	static String url 		= "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	static String user 		= "hr";
	static String pass 		= "hr";

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("부서번호를 입력하세요:");
		int dno = input.nextInt();
		
		
		try {
			//[1] 드라이버를 메모리 로딩
			Class.forName(driver);
			
			//[2] SQL 문자 (*****)

			String sql = "SELECT FIRST_NAME || ' ' || LAST_NAME full_name "
					+ "	,e.SALARY*(1+nvl(e.COMMISSION_PCT,0)) gupyeo"
					+ " ,d.DEPARTMENT_NAME dname"
					+ " FROM EMPLOYEES e INNER JOIN DEPARTMENTS d  "
					+ " ON e.DEPARTMENT_ID = d.DEPARTMENT_ID  "
					+ " WHERE e.DEPARTMENT_ID =?";
			
			System.out.println("[SQL]: " + sql);
			

			//[3] 연결객체 얻어오기
			Connection con = DriverManager.getConnection(url, user, pass);
			
			//[4] 전송객체 얻어오기
			//Statement ps = con.createStatement();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, dno);
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
				System.out.print(rs.getString("full_name")	+"\t");
				System.out.print(rs.getInt("gupyeo")	+"\t");
				System.out.print(rs.getString("dname") + "\n");
			}
			
			//[6] 닫기
			ps.close();
			con.close();
		} catch (Exception e) {
			System.out.println("예외:" + e.getMessage());
			//e.printStackTrace();
		}
						
	}
}
