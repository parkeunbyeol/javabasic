package mysql.bprepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmpInsert1 {

		// 0. 필요한 변수 선언
	static String driver 	= "com.mysql.cj.jdbc.Driver";
	static String url 		= "jdbc:mysql://192.168.0.21:3306/basic";
	static String user 		= "scott";
	static String pass 		= "tiger";

	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("사번을 입력하세요:");
		int sabun = input.nextInt();
		
		System.out.println("이름 입력하세요:");
		String irum = input.next();
		
		System.out.println("업무를 입력하세요");
		String upmu = input.next();
		
		System.out.println("급여를 입력하세요");
		int sal = input.nextInt();
		
//		// 사용자 입력값을 받기
//		int sabun = 0;
//		String irum = "";
//		String upmu = "";
//		int sal = 0;
//		
		try {
			//[1] 드라이버를 메모리 로딩
			Class.forName(driver);
			

			String sql = "Insert Into emp(empno,ename, sal, job)  "
					+  " VALUES(?,?,?,?) ";
			
			System.out.println("[SQL]"+sql);
						
			//[3] 연결객체 얻어오기
			Connection con = DriverManager.getConnection(url, user, pass);
			
			//[4] 전송객체 얻어오기
			/*
			 * 		- Statement  		: 완벽한 SQL 문장
			 * 		- PreparedStatement : 미완성한 SQL 문장
			 * 		- CallableStatemetn : PL-SQL 함수 (function/proceudre) 호출			 * 
			 */
			//Statement stmt = con.createStatement();
			PreparedStatement ps = con.prepareStatement(sql);
				// 미완성부분을 채우기
				ps.setInt(1, sabun);
				ps.setString(2, irum);
				ps.setInt(3, sal);
				ps.setString(4, upmu);
			
			
			//[5] 전송
			//stmt.executeUpdate(sql);			
			int result = ps.executeUpdate();
			System.out.println(result + "행을 입력");		
			
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
