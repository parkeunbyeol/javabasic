package d_array;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Student[] s = new Student[3]; // 배열에 대한 객체 생성
		Scanner input = new Scanner(System.in);
		
		for(int i =0; i<s.length; i++) {
			            //s.length =[3] = 0,1,2
			
	        s[i] = new Student();  //  "Student"에 대한 객체 생성해야함 
			System.out.println("학생명 입력 ->");
			s[i].setName( input.next());
			System.out.println("국어점수 입력 ->");
			s[i].setKor(input.nextInt());
			System.out.println("영어점수 입력 ->");
			s[i].setEng(input.nextInt());
			System.out.println("수학점수 입력 ->");
			s[i].setMath(input.nextInt());
			
			System.out.println("총점"+s[i].calTotal());
			System.out.println("평균"+s[i].calAvg());
			
			
		}
		
	}
}
