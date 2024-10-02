package e_constructor;

/*
 *   [참고] 초기화
 *   
 *      int a;     //변수선언
 *      a = 10;   // 값지정
 *      
 *      int b = 20; // 변수 선언 + 값지정 => 초기화 (변수선언과 동시에 값을 지정하면 초기화)
 *      
 *      int[] array = new int[3];
 *      array[0] = 100;
 *      array[1] = 200;
 *      array[2] = 300;
 *      
 *      int [] array2 = {100,200,300};  => 초기화  (11~14행과 같다)
 *      
 *     [참고] 클래스 초기화하려면??? 생성자함수(Constructor)
 *     
 *       - 클래스가 인스턴스화 될 때 실행하는 함수 ( 클래스가 메모리에 올라올 때 실행하는 함수)
 *       - 생성자함수이름은 반드시 클래스명과 동일(대소문자 가림)
 *       - 리턴형이 없음("void"도 없음) // 일반 함수는 "return"이 있다면 자료형을 넣어줘야하고, 없다면 "void"를 넣어 줘야 하는데 생성자함수는 아무것도 없다 * 25~28 참고)
 *       - overloading 가능, * "void" 나 자료형이 있다면 일반 함수 * 둘 다 없다면 생성자 함수
 *          -> 메소드명이 동일하고 매개변수(인자)의 타입과 갯수가 다른 여러 개의 함수
 *      
 *       - default constructor :
 *         ` 생성자함수를 한 개도 지정 않으면 자동 생성
 *         ` 한 개라도 지정하면 안 만들어 줌
 *     
 *     
 *     [참고] 자바 특성
 *        class Test{                 // 클래스명
 *            String Test;            // 변수명
 *            public void Test(){}    // 함수명
 *            public Test() {}        //생성자
 *            
 *     [참고] this 와 this()함수
 *         this : 자기 객체를 지칭하는 레퍼런스
 *                멤버변수나 멤버메소드를 정확하게 지칭할 때 사용
 *            
 *         this() : 다른 생성자 함수를 호출할 때    
 *                [주의] 무조건 첫 라인에 기술해야 함
 */
public class Student {
    // 다른곳에서 접근 못하도록 "private" 붙이기
	// member fields : 멤버변수들 (서로 다른 자료형 )
	private String name;                            //6~9행처럼 서로 다른 자료형을 한덩어리로 묶은 것이 "Class"
	private int kor, eng, math;
	private int total;
	private double avg;

	
	//------------------------------
	// 생성자함수 constructor
	public Student() {               // void와 자료형도 없음 = 생성자함수 , Main 함수에 있는 "new Student();"의 class를 불러와서 초기화 시킴
//		     name = "박길동";          // 여기서 this는 멤버변수에 있는 name을 가르킨다는 뜻
//	         kor = 50;
//	         eng = 50;
//	         math = 50;
		    this("홍길동",50,50,50);    // "this()"디스 함수는 다른 생성자 함수(63행)를 부를 때 사용하므로 63행으로 넘어간다.
		    System.out.println("기본생성자 호출");
	}
	public Student(String name, int kor, int eng, int math) {             // Math 함수에 있는 인자를 받기 위해 생성자를 한번 더 만들고, 
		this.name = name;                                                 // 파라미터(String name, int kor, int eng, int math)를 입력해준다.
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		System.out.println("인자있는 생성자 호출");
	}	
	
	
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