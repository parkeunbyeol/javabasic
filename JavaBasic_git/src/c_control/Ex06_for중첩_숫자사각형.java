package c_control;

import java.util.Scanner;

public class Ex06_for중첩_숫자사각형 {

	public static void main (String[] args) {
		
		     Scanner input = new Scanner(System.in);
		     System.out.println("숫자 2개 입력 ->");
		       int row = input.nextInt();
		       int col = input.nextInt();
		       
//		       int su = 1;	       
//		       for(int i = 0; i<row ; i++) {
//		    	   for(int j=0; j<col ;j++) {
//		    		   System.out.print(su + "  ");
//		    		   su++;                                           // 이 단계는 아래 예제처럼 j++ 옆에 이동해도 됨
//		    	   }
//		    	    System.out.println();
//		       }
		     
		      //  int su = 1;	       
		       
//		       ----------------------------------예제
//		       for(int i = 0, su = 1; i<row ; i++) {
//		    	   for(int j=0; j<col ;j++, su++) {
//		    		   System.out.print(su + "  ");
//		    		   
//		    	   }
//		    	    System.out.println();
//		       }  --------------------------------------
		       
		       for(int i =1 ; i <=row ; i++) {
		    	   for(int j=1 ; j<=col ; j++) {
		    		    System.out.print("  ");	    		    
		    	   }
		    	    System.out.println();
		       }		      
		     
	}
	
}
/*
 문제) 행과 열의 수를 입력 받아 다음과 같이 출력하는 프로그램을 작성하시오.abstract


                            입력
                           3    4

                             출력
                           1 2 3 4 
                           2 4 6 8
                           3 6 9 12
*/