package f_exception;

/*
 *  오류
 *    - 에러 : 심각한 오류
 *    - 예외 : 심각하지 않은 오류
 *    
 *  예외처리 : 최종적인 목적은 프로그램이 정상으로 종료 되기 바람.
 *     [1] try ~ catch
 *     
 *          try{
 *                   예외가 발생할 여지가 있는 구문
 *              }catch(Exception ex){
 *                   예외가 발생한 후에 구문
 *              }finally{
 *                   예외 관련 없이 무조건 실행 구문
 *              }
 *              
 *     [2] 함수 뒤에 throws  
 */
public class Ex01_TryCatch {

	public static void main(String[] args) {

		//String [] str = new String [] {"안녕하세요", "올라", "하이"};      // "new String []" 대부분 생략
		String [] str = {"안녕하세요", "올라", "하이"};          // 참조형(문자열) 배열 변수 str, "안녕하세요", "올라", "하이"은 따로 다른 
		                                                  // 메모리로 저장되고, 주소를 찾아가 출력된다.

		try {			           // try 안에 있는 구문이 자바 구문
			for(int i = 0; i < str.length ; i++) {
				System.out.println(str[i]);
			} 
			//return;                // "return"이 실행되기 위한 조건은 자바 구문에 오류가 없어야 한다.
		}catch(Exception ex) {     // "catch"는 문제가 있을 경우에 실행. 만약, 문제가 없다면 "catch"를 건너뛰고 finally 실행
			System.out.println("예외 발생 :" + ex.getMessage());
		}finally {                  // "finally"는 오류의 여부 상관 없이 무조건 실행됨. 심지어 JVM에 의해 제어권을 반환시키는 return;이
			                        // 있더라도 "finally"는 실행된다.
			System.out.println("무조건 실행 구문");
		}

		System.out.println("프로그램 종료");
	}
}
