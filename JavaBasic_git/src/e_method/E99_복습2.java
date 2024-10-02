package e_method;

import java.util.Scanner;

public class E99_복습2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("점수 입력 ->");
		int jumsu = input.nextInt();

		String result = pass(jumsu);  // 인자 jumsu를 pass함수를 통해 넘겨줌 -> 22행 수행
		//합력 여부 출력				
		System.out.println("결과: " + result);
	}

	/*
	 * 역할 : 입력 받은 점수를 넘겨 받아서 
	 *       80점 이상이면 '합격' 출력, 그렇지 않으면 '불합격'  확인만
	 */
	static String pass(int jumsu) {
		String result = "";                       // 문자열 변수 result를 초기화 해준다
		if(jumsu >= 80) result = "합격"; // 만약 사용자의 입력 값인 정수현 변수 jumsu(점수)가 80이상이면 
		                                //문자열 변수 result에 "합격" 이라는 문자열을 저장하고
		else result = "불합격";           // 80미만이라면 "불합격"이라는 문자열을 저장한다.

		//System.out.println("result");

		return result;         // 값만 확인하고 22행 문자열 result가 13행으로 다시 돌아간다.
	}

}
