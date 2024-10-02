package c_control;

import java.util.Scanner;
import java.util.StringTokenizer;

/*
 *    for문 : 반복 횟수를  정해져 (알고) 있는 경우 주로 사용
 *    while문 : 반복 횟수를 모를 경우 주로 사용
 */
public class Ex07_while_응용 {

	public static void main(String[] args) {
		
		// 예 : 국어/영어/수학 -> 90/88/70

	        Scanner input = new Scanner(System.in);           // 입력 받을 준비
	        System.out.println("예 : 국어/영어/수학(90/88/70) ->"); // 콘솔창에 " "예 : 국어/영어/수학(90/88/70) ->" 띄움
	        String str = input.nextLine();      // 문자열 변수를 입력 받은 줄로 설정
	       //  System.out.println(str);
	        StringTokenizer st = new StringTokenizer( str,"/");      // 구분자 기본값 : 공백, 문자열 str을 스트링토큰나이저 ex) 입력 값 90이면 90/로 출력
 
	        while( st. hasMoreTokens()) {
	        	String token = st.nextToken( );
	        	System.out.println("점수:" + token);
        
	        // 반복횟수를 알 수 있다면
//	         int cnt = st.countTokens();
//	        for(int i =0 ; i<st.countTokens(); i++) {
//	        	                              // 토큰의 개수
//	        	 String token = st.nextToken();
//	        	                                // 읽은 거의 다음 토큰
//	        	 System.out.println("점수:" + token);
        }

 	}

}
