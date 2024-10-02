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
 *                     초기치;
 *               while(조건문){
 *                        반복문장;
 *                        증가치;
 *                 }       
 *                 
 *                 초기치;
 *                  do    {
 *                        반복문장;
 *                        증가치;
 *                         syso
 *                 } while(조건문);
 */
public class Ex09_do_while_개념 {

	public static void main(String[] args) {
		
//		int sum = 0;	
//		int j=1;
//        do  {		
//     	sum += j;             // for -> while -> do while 만들어 보기
//    	j++;
//     } while( j<=10 );
//     System.out.println("합"+ sum);	
//     
             // 단수를 입력받아 구구단 출력 ( do ~while 구문)
     
     Scanner input = new Scanner(System.in);
		System.out.println( "단 입력->" );
		        int dan = input.nextInt();
		        // [ex] 2 * 1 =2
		       // 
		      //           2 * 9 =18
		        int i=1; // 초기치;
		        do { // 조건문
		        	System.out.printf(" %d * %d = %d \n" , dan, i, dan*i);
		        	i++; // 증가치;
		        }while( i<=9 );          //printf, println = 개행이 안됨    \n= 다음줄로 넘어감
		
        
		
	}
	
}
