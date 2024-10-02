package a_datatype;

public class Ex03_연습 {

	public static void main(String[] args) {
	
	int korean;   // 국어점수 변수 korean 선언
	int english;	        // 영어점수 변수 english 선언
		       
		
	korean = 91;        // 국어점수 변수에 91점 지정
	english = 100;	        // 영어점수 변수에 100점 지정
		
    int total;                   // 총점 변수 total 선언
    total = korean + english;      // 총점 계산하기
		
		
	System.out.println("총점:" + total);	       // 총점 출력
		
		                    /// --------------------------------------------------------
                           // 평균 구해서 출력
	
	double average;   
	average = total / 2;     
	                                 // 191/2 = 95.5
	                                 // 정수형끼리 연산한 결과는 정수형임 (*************)
	System.out.println("평균:" + average);
		

	}

}
