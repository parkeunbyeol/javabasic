package d_array;

public class Ex03_2차원배열 {

	public static void main(String[] args) {


		 char [][] alpha = new char[3][4];     
		  // []=1차원 즉 [][]=2차원                // 2차원 배열은 for문 2개씩, 3차원 배열은 for문 3개씩
		 // 값 입력
//		 for(int i=0; i<alpha.length; i++) {
//			for(int j=0; j<4; j++) {
//			 alpha [i][j]= '*';           // 알파 i를 이용하여 0 1 2 3 번째 자리에 *을 입력
//			}
//		 }
		 char ch = 'A';
		 for(int i=0; i<alpha.length; i++) {
			 for(int j=0; j<4; j++, ch++) {
				 alpha[i][j]=ch;
			 }
		 }
		 
		 // 값 출력
		 for(int i=0; i<alpha.length; i++) {
			 for(int j=0; j<4; j++) {
			 System.out.print(alpha[i][j] + " "); // 변수 alpha의 i번째까지 공백을 포함하여 출력 
		     }
			 System.out.println();
		 }	 

	}

}
