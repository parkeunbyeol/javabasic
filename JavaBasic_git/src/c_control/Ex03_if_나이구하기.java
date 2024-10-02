package c_control;

import java.util.Calendar;

public class Ex03_if_나이구하기 {

	public static void main(String[] args) {
		
		 String id = "020202-4234556";
		  // String id = "801212-1234567;
		 String nai = id.substring(0, 2);       // nai = "80"  0번째 자리부터 2번째 앞까지
		  int sunai = Integer.parseInt(nai); // 문자열 "80"  - > int 80       문자열"80"을 계산 하기 위해 정수80으로 변경
		                         //[중요]Integer.parseInt(변수) = String을 int로 형 변환

		  
		  //------------------------------------------------------------- 자동으로 년도 바꿔지는 코드
		  		// 올해년도 구하기  
		  Calendar cal = Calendar.getInstance();        // 컨트롤 + 시프트 + 영어 O -> java.util.Calendar;
		    int year = cal.get(Calendar.YEAR);              // get 은 데이터를 얻어오는, 가져오는
		    
		    int age = 0;   // 오류 발생 예방 초기화
		    

		 char jender = id.charAt(7);
				 if(jender == '1' ||  jender== '2') {
					  // 성별 문자가 '1' 이거나 '2'라면
					 age = 2024 - (1900+sunai)+1;
				 } else if(jender =='3' || jender=='4') {
					 // 성별 문자가 '3' 이거나 '4'라면		
					 age = 2024 - (2000+sunai)+1;
				 }
		 
		  System.out.println("한국나이"+age);
		
	}
	
}

/*
      Wrapper class : 자료형 클래스

        int  :  Integer              // 앞글자가 대문자면 클래스
        long : Long
        double :  Double

*/