package c_control;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex07_while_연습 {

	public static void main(String[] args) {
		
		
/*		Scanner input = new Scanner(System.in);
		  System.out.println("숫자 입력 (1 2 3 4 )->");
		  String str = input.nextLine(); // " 1 2 3 4 "  사용자가 입력한 문장을 문자열(문장)으로 받아라. " 1 2 3 4 "는 문장
		  
		  StringTokenizer st = new StringTokenizer(str);
		  
		   int max = 0; // while 안에 입력하면 괄호를 벗어나면 출력 값이 없어져서 먼저 입력)
		   while(st.hasMoreTokens()) {  // st. hasMoreElement = 1.5버전 이전 키			 
			  String token = st.nextToken();  
			  int su = Integer.parseInt(token); 	  // String은 참조형이므로 (int)적용이 안된다.  String을 -> int로 변환 캐스팅은 기본형끼리만 되므로 참조형인 String은 안된다.
		      if( max < su) max = su;
		    	
		   }
		    System.out.println("큰 수: " + max);
*/
		
		//---------------------------------------카페 while 문제 [2]
		// 정수를 입력 받아 입력 받은 수들 중 짝수의 개수와 홀수의 개수를 각각 구하여 출력하는 프로그램을 작성하시오.
		
		Scanner input = new Scanner(System.in);
		   System.out.println("숫자 입력->");
		   String str = input.nextLine();
		  
		   StringTokenizer st = new StringTokenizer(str);
		   
		   int odd =0, even=0;
		   while(st.hasMoreTokens()) {
                         String token = st.nextToken();
                           int su = Integer.parseInt(token);
                           if (su % 2 ==0) even++;
                           else odd++; 
             	   
                           }  
                           System.out.println("짝수 : "+ even + "개");
                           System.out.println("홀수 : "+ odd + "개");
                           
		  
	}

}
