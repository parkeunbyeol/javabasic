package c_control;

import java.util.Scanner;

public class Ex07_369 {

	public static void main(String[] args) {

		/*
		 * for( int i =1 ; i <=50 ; i++) { // 정수형 변수 i가 1이고, i가 50이하, i의 증가치 (반복문) int
		 * su = i; // 정수형 변수 su는 i로 설정 boolean su369 = false; // 논리형 변수 su369를
		 * false(부정)이라 입력
		 * 
		 * while(su!=0) { // su가 0이 아닐 때 반복= su가 0이면 중단 int na = su%10; // 정수형 변수 na는
		 * su를 10으로 나눴을 때의 나머지
		 * 
		 * if(na == 3 | na == 6 | na == 9) { // 만약 나머지가 3 또는 6 또는 9 일 때
		 * System.out.print("짝"); // "짝"을 출력한다. su369 = true; // su369는 트루다.= 반복한다. } su
		 * = su / 10; } if(!su369) System.out.println(i); else System.out.println(); }
		 */
		// ----------------------------------------방탈출 문제
//         1부터 10,000까지 8이라는 1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가?
//
//          8이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 8이라는 숫자를 모두 카운팅 해야 한다.
//
//           (※ 예를들어 8808은 3, 8888은 4로 카운팅 해야 합니다)
//
//           결과 : 4000
	
/*		int b = 0;  // 정수형 b를 0값으로 초기화 for문 안에 넣으면 값이 계속 0으로 초기화 되므로 밖으로 뺀다) 

		for (int i = 1; i <= 10000; i++) {   // 정수형 변수 i는 1부터  10000이하일때가지 반복한다
			int su = i;        // 정수형 변수 su를 i로 지정

			while (su != 0) {        // su가 0이 아닐 때까지 반복하여 실행
				int na = su % 10; // 정수형 변수 na를 설정함. su%10은 1의 자리수 먼저 확인하기 위한 과정

				if (na == 8) { // 만약 na(나머지)가 8이라면 if문을 실행한다.
					b++;           // if문에 해당된다면, b++진행 (정수형 변수 b는 for문 밖에서 미리 0으로 초기화 해줬으므로 0부터 시작
				} // end of if
				su = su / 10;  // if문이 끝났다면, 맨처음 int su = i였던 정수형 변수 su 를 10으로 나눈 몫 즉, su/10으로 재설정 해준다. 재설정 해준 뒤 다시 while문 반복 (조건인 su!=0를 충족한다면 if문도 다시 반복하다가 
				                        //  su = 0이 될때 while문의 조건에서 위배 되므로 while문에서 아웃
			} // end of while su 

		} // end of for

		System.out.println("결과 :" + b);  // while문에서 아웃됐다면 마지막으로 값 출력
*/
		
		//-----------------------------------선택문제 

           Scanner input = new Scanner(System.in);
             System.out.println(" 숫자를 입력하시오->");
             int a = input.nextInt();
             
              
             for( int i=0; i< a; i++) {
            	for(int j=1 ; j<=3 ; j++) {
            		System.out.print(j+" "+ "\n");
            		
            		
            	}
             } System.out.println();
		
		
		
	}

}
