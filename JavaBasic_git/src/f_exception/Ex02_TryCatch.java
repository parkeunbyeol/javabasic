package f_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex02_TryCatch {

	public static void main (String[]args) {
		FileInputStream fis = null;
		
		try {	
			fis = new FileInputStream("abc.txt");  // JavaBasic에 "abc.txt"파일 생성하면 "catch"구문들 실행 안함
            fis.read();
            
			System.out.println("파일처리");
		}catch (FileNotFoundException ex) {
			System.out.println("파일이 존재하지 않는 예외발생:" + ex.getMessage());
		}catch (Exception ex) {                              // 구체적인 예외 -> 포괄적인 예외 순으로 입력 해야 한다.
				System.out.println("예외발생:" + ex.getMessage());
	    }finally {
	    	try{
	    	fis.close();	    		    
	    	}catch(Exception ex) {}
	    }	
	}
	
}
