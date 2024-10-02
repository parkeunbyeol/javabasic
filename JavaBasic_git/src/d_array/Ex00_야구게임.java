package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex00_야구게임 {

	public static void main(String[] args) {

              int [] baseball = new int [3];
              
              for (int i = 0; i< baseball.length; i++) {
            	  baseball[i] = (int)(Math.random()*10);
            	   for(int j=0; j <i; j++) {
            		   if(baseball[ j ] == baseball[ i ]) {
            			   i--;
            		   }
            	   }
            	  System.out.println(baseball[i]+ "/");
            			  
              }

               for (int i =0; i< baseball.length;  i++) {
            	   System.out.print(baseball[i] + " ");
               }
               
               //-------------------------------------------
               // 2. 사용자 입력 값 answer 에 각각의 숫자로 저장
               //      [ex] 3 4 5
               int []answer = new int[3];
               
               //구문작성
               
               Scanner input = new Scanner(System.in);
                System.out.println("숫자를 입력하시오->");
                String str = input.nextLine();
               
                StringTokenizer st = new StringTokenizer(str);
               
                for(int i=0; i <answer.length; i++) {
                 answer[i] = Integer.parseInt( st.nextToken() );
                }
                 
//               // answer 값 출력
//               for (int i = 0; i<answer.length; i++) {
//            	   System.out.print(answer[i] + " ");
//               }
                
                //-----------------------------------------------
                // 3. 값 비교 
                
                int strike = 0, ball = 0;               // 초기값 설정
                for (int i = 0; i< baseball.length; i++) {        // i가 0 1 2
                	for(int j=0; j<answer.length; j++) {
                		if(baseball[i] == answer[j]) {
                			if(i==j) strike++;
                			else ball++;
                		} // end of if
                	} // end of for j
                } // end of for i
	
	            // 4. 출력
                System.out.println("스트라이크:"+ strike + "/볼" + ball);
	}

}
