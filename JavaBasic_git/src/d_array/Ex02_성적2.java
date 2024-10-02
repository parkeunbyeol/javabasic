package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.ProgressMonitorInputStream;

/* 
 * 5명의 국어점수를 입력하세요 (입력예시 : 10/10/10/10/10 )-> 55/66/75/69/72
 * 총점은 xxxx이고, 평균은 0000입니다.
 * 
 */
public class Ex02_성적2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("5명의 국어점수를 입력하세요 ->" );
		  String score_str = input.nextLine();
		  
		  StringTokenizer st = new StringTokenizer(score_str, "/"); // 구분자"/" 꼭 넣어주기
		  
		  int [] score = new int [st.countTokens()];
		  System.out.println(score.length);
		  
 		  for( int i = 0; i <score.length ;  i++) {
 			  score[i] = Integer.parseInt(st.nextToken());
 			                          // String을 int형으로 변환 = Integer.parseInt , 형변환은 기본형만 가능 string은 참조형이라 불가
 		  }
			  // 총점구하기
 		   int total = 0;
 		   for (int i=0; i < score.length; i++) {
 			   total += score[i];
 		   }
 		  
 		   System.out.print("총점은" +  total + "이고,");
 		    System.out.println("평균은" + total / score.length + "입니다.");
		  }
				  
		
		
	}

