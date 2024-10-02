package b_encapsulation;

/*
 * 캡슐화
 *    - 멤버변수 private
 *    - 멤버메소드 public
 */
public class Student {
    // 다른곳에서 접근 못하도록 "private" 붙이기
	// member fields : 멤버변수들 (서로 다른 자료형 )
	private String name;                            //6~9행처럼 서로 다른 자료형을 한덩어리로 묶은 것이 "Class"
	private int kor, eng, math;
	private int total;
	private double avg;

	// member methods : 멤버함수들        // 12~18행처럼 값을 구하는 여러가지 코딩이 "Class"
	public int calTotal() {
		total = kor + eng + math;
		return total;              // "total"을 구해서 "return"을 이용해 반환하는 것
	}
	
	// setter / getter
	public double calAvg() {
		avg = (double)total / 3;
		return avg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	
}

/*
   클래스이름과 java 파일명이 동일
   ` 대소문자 구별

    [권장] 클래스 이름은 대문자로 시작
 */