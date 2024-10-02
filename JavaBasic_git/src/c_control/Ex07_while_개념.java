package c_control;

import java.util.Scanner;

/*
 *     반복문
 *          - for 문
 *          - while 문
 *          - do~ while 문
 * 
 *              for(초기치 ; 조건문 ; 증가치){
 *                        반복문장;
 *              }
 *                   
 *                    초기치;
 *               while(조건문){
 *                        반복문장;
 *                        증가치;
 *                 }       
 */
public class Ex07_while_개념 {

	public static void main(String[] args) {

//		int sum = 0;	
//         
//        for( int i=1; i<=10  ; 	i++) {		
//        	sum += i;     	
//        }
//        System.out.println("합"+ sum);	
//         }	      
		
//		         int sum = 0;	
//		         int i=1;
//		        while( i<=10) {
//		        	sum += i;
//		        	i++;
//		        }// end of for
//		        System.out.println("합"+ sum);	
//		        
		
		// 단 수를 입력 받아 구구단 출력
		Scanner input = new Scanner(System.in);
		System.out.println( "단 입력->" );
		        int dan = input.nextInt();
		        // [ex] 2 * 1 =2
		       // 
		      //           2 * 9 =18
		        int i=1; // 초기치;
		        while( i<=9 ) { // 조건문
		        	System.out.printf(" %d * %d = %d \n" , dan, i, dan*i);
		        	i++; // 증가치;
		        }               //printf, println = 개행이 안됨    \n= 다음줄로 넘어감
		
		
		
	} // end of main	
}//  end of class
