package c_control;

public class Ex01_if_전화번호 {

	public static void main(String[] srgs) {
		
		 String tel = "032-222-2222";
		    int idx = tel.indexOf('-');
		         // System. out. println(idx);
		    
		     String localNum = tel.substring(0,idx);  // 0번째부터 idx(2)앞 까지의 문자열
		    //  System.out.println(localNum);
	/*
	 *      지역번호가 02라면 "서울" 출력
             그렇지 않고 지역 변수가 032라면 "인천" 출력
             나머지는 "한국"출력
	 * 	     
	 */
		     
		  String local ="";
				  if (localNum.equals("02")) {
					   local = "서울";   
					   System.out.println(local+"입니다.");
				  }
				  else if(localNum.equals("032")) {
					  local = "인천";
					  System.out.println(local+"입니다.");
				  }else if(localNum.equals("")) {
					  local = "한국";
					  System.out.println(local+"입니다.");
				  }
				
		     
	}
	
}
/*
             
               n번째 문자 하나 = 변수이름.charAt(n번째)
                tel.substring(0,2);  // 0번째부터 idx(2)앞 까지의 문자열
*/