package c_control;


import java.util.*;

/*
 *   콘솔로 전화번호 입력 받아서
 *   지역번호를 추출하여
 *   switch 문장을 이용하여 지역 이름을 출력
 *   ex) 02 : 서울
 *         032 : 인천
 *         031 : 경기
 *         064 : 제주
 *         나머지 : 한국
 *          
 */

public class Ex04_switch_전화번호 {

	public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
	   String  number="";
	   System.out.println("전화번호->" + number);
	   number = input.next();
	   
	   int idx = number.indexOf('-');
	   System.out.println("지역번호->" + idx);
	 String localNum = number.substring(0, idx);
	 
	   
	 String area = number .substring(0,idx);	 
	  
	  String local ="";
	  
	  switch(area) {
	  case "02" : local = "서울";   break;
	  case "032" : local = "인천"; break;
	  case "031" : local = "경기"; break;
	  case "064" : local = "제주"; break;
	  default : local = "한국";
			  
	  }
	    System.out.println("지역이름 ->" + local);
	   
		
	}

}
