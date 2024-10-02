package d_array;

public class Ex00_배열문법 {

	public static void main(String[] args) {
		  
/*		// 배열변수 선언
		int [ ] kor = null;      // 참조형의 초기화 = null , 변수 kor에 아직 변수 설정을 안한 상태. null(값 없음)이 들어가 있음
		// 배열객체 생성
		kor = new int[3];    // 새로운 int 변수에 3개의 메모리를 잡도록 설정
		// 값 지정
		kor[0] = 100;
		kor[1] = 200;
		kor[2] = 300;
		
		// 총점구하기
		int total = 0;
		for(int i =0 ; i < kor.length ; i++) {       // kor.length는 값을 지정한(배열 객체의 개수) kor이
			                                                                //  몇 개인지 확인 할 수 없을 때 사용하면 자동으로 마지막 값까지 인식해줘서 실수를 줄일 수 있다.
			           // i <2 일때는 kor = [0], kor = [1]까지만 더해짐
			total += kor [i];
		} System.out.println("총점:" + total);
*/
		
//		// 배열변수 선언 + 객체 생성
//		int [ ] kor = new int [3];
//		// 값지정
//		kor[0] = 100;
//		kor[1] = 200;
//		kor[2] = 300;
//		
	    // 초기화
		// 배열변수 선언 + 객체 생성 + 값 지정
		//int [ ]kor = new int[ ] {100,200,300};
		int [ ]kor = {100,200,300};
		
		// 총점구하기
		int  total = 0;
		for (int i = 0; i< kor.length ; i++) {
			total += kor[i];
		      System.out.println("총점 :" + total);
		}
				

	}

}
