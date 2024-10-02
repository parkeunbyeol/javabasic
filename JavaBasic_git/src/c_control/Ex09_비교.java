package c_control;

import java.util.Scanner;

public class Ex09_비교 {

	 public static void main(String[] args) {
		
		 
		   Scanner input = new Scanner(System.in);
		   
		   //  ----------------------------------[1] for문 이용 / 정해진 횟수가 있을 경우 ex) 구구단 3번 출력
		   
/*			System.out.println( "구구단 출력 몇 번 반복할까요?" );
			        int su = input.nextInt();
			        
			        for(int a = 0; a <su; a++) {
			        	
			        	System.out.println("단 입력->");   
			            int dan = input.nextInt();
			            for(int i =1; i<=9; i++) {
			        	          System.out.printf(" %d * %d = %d \n" , dan, i, dan*i);
			        } //end of for int i
			   }// end of for int a
*/
		   
		   
		   //  ---------------------------------[2] while 이용  / 실행 횟수가 안정했을 경우 ex) 사용자 마음대로 구구단 n번  출력
		   
//		     while( true ) {
//		      System.out.println("단 입력->");   
//              int dan = input.nextInt();
//              for(int i =1; i<=9; i++) {
//       	            System.out.printf(" %d * %d = %d \n" , dan, i, dan*i);
//               }
//	           System.out.println("종료할까요?(Y/N)");                // while은 종료할까요? 의미가 있으므로 "끝낼까요(종료할까요?)?" 입력
//	           String answer = input.next( );
//	           if ( answer.equals ("Y")  | answer.equals("y"))   break;           //  while은 여기서 끝낼까요?라는 뜻 answer가 "Y"가 나오면 끝낸다
//		     }        // "Y"가 문자열이므로 '=='는 안되고, equals 

	          //  ---------------------------[3] do ~ while 이용
		   String answer = "";  
		   do  {
		      System.out.println("단 입력->");   
           int dan = input.nextInt();
           for(int i =1; i<=9; i++) {
    	            System.out.printf(" %d * %d = %d \n" , dan, i, dan*i);
            }
	           System.out.println("다시할까요?(Y/N)");                // do ~ while은 반복의 의미가 있으므로 "다시할까요?"입력
	           answer = input.next( );     // 값 지정 (변수 지정아님)
		   }  while ( answer.equals ("Y")  | answer.equals("y"));           // do~while은 반복을할까요? 라는 뜻
		             // "Y"가 문자열이므로 '=='는 안되고, equals 

	 
	 }
}
