package oracle.cexercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class TempInsert {

	// 0. 필요한 변수 선언
	static String driver 	= "oracle.jdbc.driver.OracleDriver";
	static String url 		= "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	static String user 		= "scott"; // 계정 
	static String pass 		= "tiger";

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("당신의 이름은?");
		String userName = input.nextLine();
		

		try {
			//[1] 드라이버를 메모리 로딩
			Class.forName(driver);

			//[2] SQL
			String sql = " INSERT INTO TMEP ( NO, NAME, INDATE )  "
					+	" VALUES( seq_temp_no.nextval, ?, sysdate )";

			//[3] 연결객체 얻어오기
			Connection con = DriverManager.getConnection(url, user, pass);

			//[4] 전송객체 얻어오기
			//Statement ps = con.createStatement();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userName);
			//[5] 전송
			// ps.executeUpdate(sql);			
			int result = ps.executeUpdate();
			System.out.println( result + "행을 입력");

			//[6] 닫기			
			ps.close();
			con.close();
			
		 } catch(Exception ex) {
			System.out.println("예외" + ex.getMessage());
		 }	

		}// end of try
	} // end of main
