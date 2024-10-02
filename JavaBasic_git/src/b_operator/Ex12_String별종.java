package b_operator;


/*
 *    문자열 처리하는 클래스
 * 
 *             -String
 *             -StringBuffer / StringBuilder
 * 
 * 	
 */
public class Ex12_String별종 {

	public static void main(String[] args){
		
          StringBuffer sb = new StringBuffer("홍길동");
          sb.append("바보");
          // sb = sb + "바보";
          System.out.println(sb);
                    
          StringBuilder sb2 = new StringBuilder("홍길국");
          sb2.append("바보");
          System.out.println(sb2);
          
           // Buffer는 작업 진행 중 완료가 될 때까지 락 -> 좀 더 무거운
           // Builder Buffer 보다 가볍다.
          
          
         //----------------------------------------------------------------------------- 
          
          // String str = new String("홍길자");
          // [특권] new 생략 가능
          //             + 연산자 가능
          String str = "홍길자";   
		  str = str + "바보";   //str = str + "바보";
		  System.out.println(str);
	}
}
