package oracle.cexercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmpCount {
		// 0. 필요한 변수 선언
		static String driver 	= "oracle.jdbc.driver.OracleDriver";
		static String url 		= "jdbc:oracle:thin:@192.168.0.47:1521:xe";
		static String user 		= "scott"; // 계정 
		static String pass 		= "tiger"; // 비번
		
	public static void main(String[] args) {
		
		try {
			//[1] 드라이버를 메모리 로딩
			Class.forName(driver);
				
			// [2]
			String sql = "SELECT count (*) As cnt	"
					+ "	  FROM emp					";
	
			//[3] 연결객체 얻어오기
				Connection con = DriverManager.getConnection(url, user, pass);
			
			//[4] 전송객체 얻어오기
			PreparedStatement ps = con.prepareStatement(sql);
				
			//[5] 전송
			// ps.executeUpdate(sql);			
			ResultSet rs = ps.executeQuery();
			rs.next(); // ***** 값 얻어올때 한칸 내려줘야 얻어올수있다
			int count = rs.getInt("CNT");
			System.out.println("도훈님 사원수:" + count);
				
			//[6] 닫기
			ps.close();
			con.close();
				
			} catch(Exception ex) {
				System.out.println("[예외}" + ex.getMessage());
				ex.printStackTrace();}

			
	}
}
