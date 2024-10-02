package b_operator;

public class Ex13_복습 {

	public static void main (String[] args) {
		
		      int kor = 45;
		      int eng = 67;
		      int math = 77;
		      
		      int total = kor + eng + math;
		      System.out.println("총점" + total);
		      
		      // 총점이 150보다 크고 250 작으면  '보통반입니다' 출력
		      
		      if (total >=151 && total <= 249) {            // if ( 150 < total < 250) 이와 같은 조건은 컴퓨터가 인식 못함
		    	  System.out.println("보통반입니다.");
		      }
	}
}
