package oracle.cexercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 *  부서번호 : 90
 *  부서명 : IT
 *  위치 : 신촌
 */
public class DeptInsert {

			// 0. 필요한 변수 선언
			static String driver 	= "oracle.jdbc.driver.OracleDriver";
			static String url 		= "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			static String user 		= "scott";
			static String pass 		= "tiger";

	public static void main(String[] args) {
		try {
			//[1] 드라이버를 메모리 로딩
			Class.forName(driver);
			
			// [2]	
			int dno = 90;
			String dname = "IT";
			String addr = "신촌";

			String sql = "Insert Into dept(deptno, dname, LOC)"
					+	"VALUES(?,?,?)";
			
			System.out.println("[SQL]" + sql);
			
			//[3] 연결객체 얻어오기
			Connection con = DriverManager.getConnection(url, user, pass);

			//[4] 전송객체 얻어오기
			PreparedStatement ps = con.prepareStatement(sql);
			// 미완성부분을 채우기
			ps.setInt(1, dno);          // 3행의 dept 테이블의 detno, dname, loc 컬럼에 들어갈 변수명들(dno, dname, addr)이고 컬럼의 순서에 맞게 변수명과 자료형을 맞춰준다
			ps.setString(2, dname);
			ps.setString(3, addr);
		
			

			//[5] 전송
			// ps.executeUpdate(sql);			
			//ResultSet rs = ps.executeQuery(); //select의 경우에 사용
			int result = ps.executeUpdate();
			
			//[6] 닫기
			ps.close();
			con.close();

		} catch(Exception ex) {
			System.out.println("[예외}" + ex.getMessage());
			ex.printStackTrace();
		}

	}
}
