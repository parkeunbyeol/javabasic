package c_control;

import java.util.*;

public class Ex05_for_연습 {

	public static void main(String[] args) {
		
		/* 
		 * 문제 1) 1~N 까지의 숫자를 다음처럼 출력하라
		 *     1   2   3   4    5 
		 *     6   7   8   9   10
		 *    11 12  13  14  15
		 */
		
		/*
		for(int a = 1; a<=15; a++) {
			System.out.println(a + " " );
		    if( a%5 == 0) {
		    	System.out.println();
		    }
		}
          */
		
		  /*
		   * 문제2)  문자열처리하기 

​

                문자 N(a~z, A~Z)를 입력받아 N이 소문자면 a부터 N까지 인쇄하고 
                 N이 대문자이면 문자 N부터  Z까지 출력하라 
                 그 밖의 문자가 입력되면 Error 를 출력하라 

​
                  입력  출력

                 f       abcdef
                 X       XYZ
                 6       Error 
          		   */
	/*      Scanner input = new Scanner(System.in);  // 컨솔창에 입력 받을 준비를 함
		   System.out.println("문자 하나를 입력하세요 ->"); //console 칸에 "문자 하나를 입력하세요->" 를 띄워 입력 받을 준비
		   // char ch = (char)input.nextInt();
		    char ch = input.next().charAt(0);  // 문자형 변수 ch는 입력 받은 값 까지의 값을 가지도록 설정한다.
		    
		    // 소문자인지 여부
		    if(ch>'a' & ch<'z'  ) {                  // 만약 문자형 변수인 ch가 소문자 a보다 크고 z 보다 작을 때 즉, 소문자일 때
		    	for( char i= 'a'; i<=ch ; i++) {  // 문자형  변수 i가 소문자 a일 때 i는 입력 받은 값(ch)보다 작거나 같으므로
		    		System.out.println(i); }        // 출력 받고 난 뒤, 다시 a++이 되면 b가 된다. 다시 이 b는 i<=ch라는 조건문으로
		    	                                                 // 들어가게 되고 이를 만족시에 다시 값이 출력된다. 만약 조건문에 부합될 경우
		    	                                                 // 출력은 끝이 난다.
		    // 만약 대문자인지 여부	
		        }else if(ch >'A' & ch<'Z') {              
		    		for (char i = ch ; i<='Z'; i++) {
		    			System.out.println(i);}	    				   		
		    	}     		    		                            
		    	   System.out.println("Error");    // 그 외의 문자를 입력하면 "Error"가 나오게 한다.
	*/
		
	   Scanner scan = new Scanner(System.in);
	   System.out.println("문자열을 입력하세요->");
             
             
             
             
	    
	   
		
		
		
		
		    }
		    
	}


