package a_datatype;

/*
 *          자바에서 콘솔 입력 받는 방법
 *          
 *                    -Java.util.Scanner 클래스 이용
 *                    
 *                    - 정수형 입력시 : nextInt()
 *                    - 실수형 입력시 : nextdouble()
 *                    - 문자열 입력시 : next() / nextline()  ***[숙제] 차이점??
 * 
 * 
 */

import java.util.*;

public class Ex09_Scanner {

	public static void main(String[] args) {
		
		   int kor, eng, math; // 정수형 변수 kor, eng, mate 설정 
		   
		   Scanner input = new Scanner(System.in);
		   System.out.println("국어입력->");
		   kor = input.nextInt();
		
		                   // 영어점수입력받기, 수학점수입력받기, 출력
		   		   
		   System.out.println("국어" + kor);
	
		    System.out.println("영어입력->");
			eng = input.nextInt();
			System.out.println("영어" + eng);
		   
		  
		   System.out.println("수학입력->");
		  math = input.nextInt();
		  System.out.println("수학" + math);
		    
		  
		    // 총점 구해서 출력
		   // 평균 구해서 출력

		  double total;
		 total = kor + eng + math;
		 System.out.println("총점" + total);
		  
		  double aver;
		  aver = total / 3;
	      System.out.println("평균" + aver);
		  
		  
	}

}
