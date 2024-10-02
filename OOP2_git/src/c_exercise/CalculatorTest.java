package c_exercise;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		//카페 클래스 기초 문제
		CalculatorExpr cal = new CalculatorExpr();    // CalculatorExpr객체를 cal이라는 변수명으로 생성
		
		Scanner input = new Scanner (System.in);
		System.out.println("첫번째 숫자 ->");
		// cal.num1=input.nextInt(); num1=private 걸려 있어서 사용 안됨
		cal.setNum1(input.nextInt());
		System.out.println("두번째 숫자 ->");
		cal.setNum2(input.nextInt());
		
		System.out.println("덧셈:"+cal.getAdditon());
		System.out.println("뺄셈:"+cal.getSubtaction());
		System.out.println("곱셈:"+cal.getMultiplication());
		System.out.println("나눗셈:"+cal.getDivision());
	}
}
