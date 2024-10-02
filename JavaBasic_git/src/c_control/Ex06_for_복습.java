package c_control;

import java.util.Scanner;   // 컨트롤 + 시프트 + O

public class Ex06_for_복습 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		      System.out.println("숫자입력->");
		      int su = input.nextInt();    // 숫자 입력을 nextInt로 받는다
                    
		      
		      for( int i=0 ; i< su ; i++) {        // 행(row)
		    	         // 공백을 추가
		    	  for(int j=0 ; j< su-i-1 ; j++) { 
		    		  System.out.print("  ");  // 공백(' ')수
		    	  }  
		    	  for( int j=0; j <=i+1 ; j++) {  // 숫자 출력 (열:column)
		    		  System.out.print(j);
		    	  }		      
		    	  System.out.println();
		      }      	      
	}
}
