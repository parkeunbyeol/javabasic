package e_method;

import java.util.Scanner;

public class Ex05_개념연습 {

	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);		
		System.out.println("영문자를 입력하세요 ->");
		 String csr = input.nextLine();
		 char eng = csr.charAt(0);       // char은 스캐너로 바로 입력 받는 게 안되므로, String형으로 받은 뒤,
		                                 // 입력 받은 string형 문자열을 형변화를통해 char으로 만든다. 여기서 At(0)은
		                                 // 0번째 문자를 뜻함.
		 		 
		 checkLower(eng);
	}
	
	/*
	 * (문제 1) 영문자를 입력하여 이 문자를 넘겨 받아 이 문자가 소문자이면 true를 반환, 그렇지 않으면 false를 반화하는 메소드를 작성하시오.
	 * 함수명 : checkLower
	 * 인자 : char
	 * 리턴(반환) : boolean
	 */
	
	static boolean checkLower(char eng) {
		// boolean flag = true;
		if ( eng >='a' &  eng <='z' ) return true;
		else return false;
	}
	
	/*(문제 2) 영문자를 입력하여 이 문자를 넘겨 받아 이 문자가 소문자이면 대문자로 변환하여 반환하고 대문자라면 그대로 반환하는 메소드를 작성하시오.
	 * 함수명 : checkUpper
	 * 인자 : char
	 * 리던(반환) : char
	 */
	
	static char checkUpper(char temp) {         // (char temp)는 리턴 값 받을 준비
		// char ch = '\u0000';
		char ch = '0';
		
		return ch;
	}
}
