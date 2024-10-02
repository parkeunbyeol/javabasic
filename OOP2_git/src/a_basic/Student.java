package a_basic;

public class Student {

	 // member fields : 멤버변수들 (서로 다른 자료형 )
	String name;                            //6~9행처럼 서로 다른 자료형을 한덩어리로 묶은 것이 "Class"
	int kor, eng, math;
	int total;
	double avg;
	
	// member methods : 멤버함수들        // 12~18행처럼 값을 구하는 여러가지 코딩이 "Class"
	int calTotal() {
		total = kor + eng + math;
		return total;              // "total"을 구해서 "return"을 이용해 반환하는 것
	}
	double calAvg() {
		avg = (double)total / 3;
		return avg;
	}
}

/*
   클래스이름과 java 파일명이 동일
   ` 대소문자 구별

    [권장] 클래스 이름은 대문자로 시작
*/