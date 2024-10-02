package e_constructor;

import java.util.Scanner;

public class MainArray {

	public static void main(String[] args) {
		

	
		Scanner input = new Scanner(System.in);
		System.out.println("정보를 입력할 학생수를 입력 ->");
		int count = input.nextInt();
		Student s [] = new Student[count];  // 사용자가 입력한 학생수를 "count"라는 정수형 변수에 저장하여 이걸 배열에 대입
		
		for(int i=0; i<count; i++) {

			System.out.println("학생이름->");
			String name = input.next();
			System.out.println("국어점수->");
			int kor = input.nextInt();
			System.out.println("영어점수->");
			int eng = input.nextInt();
			System.out.println("수학점수->");
			int math = input.nextInt();
			
			
			s[i] = new Student(name, kor, eng, math);		
			System.out.println(s[i].getName()+"님의 총점:"+s[i].calTotal());
			System.out.println(s[i].getName()+"님의 평균:"+s[i].calAvg());		
			
		}
		
		/*
		 * 카페 1-2/ 2-4/3-5/
		 */
	}
}
