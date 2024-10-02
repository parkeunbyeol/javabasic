package oracle.review;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/*
 * 		사번/ 사원이름과 성 / 월급 / 보너스 / 이메일 입력받아서
 * 		
 * 		입사일 : 오늘날짜
 * 		업무 번호 : IT_PROG
 * 		HR 계정에 employees 테이블에 입력
 * 
 */
public class EmployeesInsert {

	// 0. 필요한 변수 선언
	static String driver 	= "oracle.jdbc.driver.OracleDriver";
	static String url 		= "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	static String user 		= "hr";
	static String pass 		= "hr";

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("사번을 입력하세요 :");
		int sabun = input.nextInt();

		System.out.println("사원이름을 입력하세요:");
		String irum = input.next();

		System.out.println("사원의 성을 입력하세요:");
		String sung = input.next();

		System.out.println("월급을 입력하세요:");
		int sal = input.nextInt();

		System.out.println("보너스를 입력하세요:");
		double comm = input.nextDouble();

		System.out.println("이메일을 입력하세요:");
		String mail = input.next();

		try {
			//[1] 드라이버를 메모리 로딩
			Class.forName(driver);


			String sql = "Insert Into employees(employee_id"
					+ ", first_name, last_name, salary, commission_pct, email"
					+ ", hire_date, job_id)  "
					+  " VALUES( ?,?,?,?,?,?, sysdate, 'IT_PROG') ";
			

			System.out.println("[SQL]"+sql);

			//[3] 연결객체 얻어오기
			Connection con = DriverManager.getConnection(url, user, pass);

			//[4] 전송객체 얻어오기
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, sabun);
			ps.setString(2, irum);
			ps.setString(3, sung);
			ps.setInt(4, sal);
			ps.setDouble(5, comm);
			ps.setString(6, mail);

			//[5] 전송
			//stmt.executeUpdate(sql);			
			int result = ps.executeUpdate();
			System.out.println(result + "행을 입력");		

			//[6] 닫기
			ps.close();
			con.close();

		} catch (Exception e) {
			System.out.println("연결실패" + e.getMessage());
			//e.printStackTrace();
		}

	}
}
