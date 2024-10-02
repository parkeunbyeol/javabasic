package f_exception;

public class Ex04_Throw {

	public static void main(String[] args) {
		try {
		   readMessage();
		}catch (Exception ex) {
		    System.out.println("실패:" + ex.getMessage());  //"ex.getMessage()" 는 자바로부터 예외의 부분이 어딘지 메세지를 받는 것
		} 
		System.out.println("프로그램 종료");
	}
	
	
	static void readMessage() throws Exception{             //메소드 뒤에서 예외를 던질 때는 "throws" 
		String [] str = {"안녕하세요", "올라", "하이"};           //22행처럼 어떤 목적을 위해 일부러 예외를 만들고자 할 때는 "throw" 
		try {
		     for(int i = 0; i <= str.length ; i++) {
			    System.out.println(str[i]);
		    }
		}catch(Exception ex) {
			throw new MyException();
			
		}
	}
	
}// 2-1 (
