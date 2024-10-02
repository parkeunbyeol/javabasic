package e_method;

import java.util.Scanner;

public class Ex07_연습 {
 
	public static void main(String[] args) {
  //" return에서 받은 값을 저장하는 곳" = "____" ();
		int [] score = input();           // 29행에서 넘어온 score 값을 받아서 저장해야 하므로 int [] score
		double avg = calculate(score);    // 29행에서 9행->10행(이때, score 변수를 9행에서 그대로 받아온다)->34행으로 진행
		output(avg);
		
	}
	
	// 국, 영, 수 점수를 입력 받기	
    static int [] input() {
    	
    	int [] score = new int[3];
    	
    	
    	Scanner input = new Scanner(System.in);
    	System.out.println("국어 점수 ->");
    	score[0] = input.nextInt();
    	System.out.println("영어 점수 ->");
    	score[1] = input.nextInt();
    	System.out.println("수학 점수 ->");
    	score[2] = input.nextInt();
    	
    	return score;                 //return은 하나의 값만 반환 할 수 있으므로, 입력 받은 국 영 수의 점수를 배열 변수 score로
    	                              //지정하여 반환시킨다. 이때 9행으로 다시 돌아감.
    }
    
    // 입력 받은 점수들로 총점과 평균을 구해서 출력
    static double calculate(int [] score) {    // 44행에서 리턴이 double형인 avg를 반환하므로 void->double형으로 
    	int total = 0;
    	double avg = 0.0;
    	
    	for(int i=0 ; i<score.length ; i++) {         // 29행에서 입력된 값을 갖고 9행>10행>33행>34>35>37행
            total += score[i];   	
    	}    	
    	
    	avg = total /(double)3;
    	System.out.println("총점:"+ total + ", 평균:"+ avg );   	
  	
    	return avg;
    }
    
    // 평균값을 받아서 학점을 구하여 출력
    static void output(double avg) {
    	switch((int)avg/10) {            // switch에는 정수형(int) 이나 문자형(char)만 올 수 있으므로 형변환 
    	case 10:
    	case 9: System.out.println("A학점"); break;
    	case 8: System.out.println("B학점"); break;
    	default : System.out.println("F학점");
    	
    	}
    }
}
