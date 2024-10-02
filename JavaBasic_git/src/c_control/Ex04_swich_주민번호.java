package c_control;

/*
 *   분기문 switch
 *   
 *   [주의] break 문장 확인
 *   [주의] 문자형 (char)/정수형(int/long)/ 문자열(String)
 * 
 */

public class Ex04_swich_주민번호 {

	 public static void main (String[] args) {
		 
		 String id = "801212-1134567";
		  char chul = id.charAt(8);
		 
		  String local = "";             // 에러 발생 대비 초기화 과정
		  
		  switch(chul) {
		  case '0' : local = "서울";          break;    // break; 는 위에부터 순차적으로 실해하다가
		  case '1' :  local = "인천/부산"; break;    //값이 하나가 먼저 출력된다면, 다음 행을 실행하지 않고 바로 끝낸다.
		  case '2' : local = "경기";          break;
		  case '9' : local = "제주";          break;
		  default : local = "한국";
		  }
		  System.out.println("당신은" + local +"출산입니다.");
	 }
	
}


/*  주민번호에서 출신지번호가
 *           0  : 서울
 *           1  : 인천/부산
 *           2  : 경기
 *           9  : 제주
 *           나머지  : 한국  
 *           
 *           if ( chul == '0'){
 *                  서울
 *           }else if(chul == '2'){
 *                   경기
 *           }else if( chul == '9'){
 *                   제주
 *           }else {
 *                    한국      
 *           }
 *           
 *            
 */

