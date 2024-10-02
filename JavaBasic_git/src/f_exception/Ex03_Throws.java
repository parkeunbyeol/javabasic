package f_exception;

import java.io.FileInputStream;

public class Ex03_Throws {
 
	public static void main(String[] args) {
		try {
			readfile();
			System.out.println("파일처리성공");		
		}catch(Exception ex) {
			System.out.println("예외발생:" + ex.getMessage());
			// ex.printStackTrace; 
		}
		
	}
	
	static void readfile() throws Exception {   // "throws Exception"은 예외(오류)를 인지하고 일단 회피함 그 뒤, 9행으로 다시 돌아가면
		FileInputStream fis = null;            // 이때의 예외를 다시 처리해준다.
		try {
	      fis = new FileInputStream("happy.txt");
		}finally {              // "catch"가 없고 "finally"만 있을 때는 예외처리 한 게 아님
			
		}
	}
	
}
