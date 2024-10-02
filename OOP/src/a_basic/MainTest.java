package a_basic;

public class MainTest {

	public static void main (String[] args) {
		// 클래스 변수 선언하기
		Student s = null;
		// 객체 생성
		s = new Student();  // class명은 "new" 붙여주기
		
		// 값지정 및 처리
		s.name = "홍길순";
		s.kor = 88;
		s.eng = 77;
		s.math = 60;
		
		System.out.println(s.name+"님 총점:"+s.calTotal()); //s안에 들어있는 함수("calTotal()"=함수 total)를 호출
		System.out.println(s.name+"님 총점:"+s.calAvg());   // s안에 들어있는 함수("calAvg()"= 함수 avg)를 호출
		
		s.total = 300;
		System.out.println(s.name+"님 평균: "+s.calAvg());
	}
}
