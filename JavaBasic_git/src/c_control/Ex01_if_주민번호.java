package c_control;

/* 
 *    1 : int 
 *    '1' : char
 *    " 1 " : String
 * 
 */

public class Ex01_if_주민번호 {

	public static void main (String[] args) {
		
		  String id = "980509-1234567";  //주민번호는 정수 아님
		   char sung = id.charAt(7);    // charAt(7)는 문자형 변수 id에서 7번째 문자를 뜻함
		   
		   String gender = "";   // java에서는 결과가 아무것도 안 걸릴시 error가 뜬다. 여기선 남자, 여자 둘 다 안걸릴 경우를 뜻하며 
		                                      // 이를 해결하기 위해 "" 이라는 공백 변수 값을 지정해줘야 한다.
		   // 그 문자가 1이거나 3이거나 9라면 '남자' 출력
		   // 그 문자가 2이거나 4이거나 0이라면 '여자; 출력
		   
		   if (sung == '1' || sung == '3' || sung =='9') {
			 // System.out.println("남자");
			    gender = "남자";
		   } else if (sung == '2' || sung=='4' || sung =='0') {
			  // System.out.println("여자");
			    gender = "여자";
		   }
		    System.out.println("당신은"+ gender + "입니다.");
		   
	}
	
}
