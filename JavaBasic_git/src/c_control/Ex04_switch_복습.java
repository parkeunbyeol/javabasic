package c_control;

public class Ex04_switch_복습 {

	 public static void main(String[] args) {
		
		        int kor = 100, eng = 100, math = 100;
		        int total  = kor + eng + math;
		        int avg = total / 3;
		       System.out.println("평균" + avg);
		        
		        char score = '\u0000'; // 유니코드 \u0000 으로 초기화 시키는 과정
		        switch (avg/10) {          // 평균 값을 10으로 나눴을 때의 몫을 case에 변수를 설정하여 등급을 출력한다.
		        case 10:
		        case 9: score='A' ;   break;
		        case 8: score='B'   ;   break;
		        case 7: score = 'C'   ;   break;
		        default  :  score = 'F'   ;
		        }
		  
	}
	
}
/*
    평균을 구해서 90이상이면 'A'학점
    90미만 80이상이면 'B' 학점
    80미만 70 이상이면 'C'학점
    그외는 'F'
    



*/