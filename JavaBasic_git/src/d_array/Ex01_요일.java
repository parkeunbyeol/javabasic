package d_array;

import java.util.*;

public class Ex01_요일 {

	public static void main(String[] args) {
        
		
		Calendar cal = Calendar.getInstance();
		System.out.println("현재 날짜 확인:");
		System.out.println(cal.get(Calendar.YEAR) + "년");
		System.out.println( cal.get(Calendar.MONTH) + 1  + "월");       // 중요 )컴퓨터는 0부터 세기 때문에 +1을 안하게 되면 11월까지만 카운팅 된다
		System.out.println(  cal.get(Calendar.DATE) +"일");
		
		System.out.println("현재 시간 확인");
        System.out.println( cal.get (Calendar.HOUR )+ "시");
		System.out.println( cal.get (Calendar.MINUTE )+ "분");
		System.out.println( cal.get(Calendar.SECOND)+ "초" );

		String [ ] yoil = {"일", "월","화","수","목","금","토"};
		
		System.out.println( yoil[ cal.get(Calendar.DAY_OF_WEEK ) -1] + "요일");
	          // SUNDAY : 1, . . . . FRIDAY : 6
	
		int yoilnum = cal.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println(yoil[yoilnum] + "요일");
	}

}
