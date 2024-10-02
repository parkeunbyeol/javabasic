package e_method;

import java.util.*;

public class Ex99_복습3 {
 
	public static void main(String[] args) {
		
		

		input();
		output();
		
	}
	/* 문자 배열에 저장된 문자들을 화면에 출력한다.
	 * 
	 */
	
	static void output() {
		
	
	}
	/* 두 정수와 알파벳 문자 하나를 입력 받는다.
	 * [예] 3 4 F
	 */
		
	static void input() {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("정수1 ->");
         int a = scan1.nextInt();
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("정수2 ->");
         int b = scan2.nextInt();
		
		Scanner scan3 = new Scanner(System.in);
		System.out.println("알파벳 ->");
		 String c = scan3.nextLine();
		 
			
		makeSquare(a, b, c);           // 데이터 넘기기
		
		
	}
	
	// 입력 받은 첫 번째 정수만큼의 행과 두번째 정수만큼의 문자 배열을 만들어
	// 입력 받은 문자를 시작으로 저장한다.
	/*
	 *     F  G  H  I
	 *     J  K  L  M
	 *     N  O  P  Q
	 */
	
	static void makeSquare(int a, int b, String c) {      // 데이터 받기 (자료형 맞춰주기)
		char [][] ch = null;
		ch = new char [a][b];
	
		for(int i=0; i<ch.length; i++) {
			for(int j=0; j<ch[a][b] ; j++) {			
				System.out.print(c);
			}   System.out.println();
		}
		
	}
}

