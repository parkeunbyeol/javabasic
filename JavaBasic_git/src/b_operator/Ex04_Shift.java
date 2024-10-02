package b_operator;
 /*
  * 
  *  shift : 모든 비트의 값을 이동하는 연산자
  *                >>
  *                <<
  *                >>>
  *                
  *                숫자 2를 1Byte  적용한다면?
  *                
  *                2                          00000010           * 맨 앞 숫자는 부호 0= + , 1= -
  *                2<<1                   00000100
  *                2>>1                   00000001
  *                
  *                2>>>1                 00000001
  *                                             음수인 경우
  *                                             10000010     --->   01000001
  *                
  */
public class Ex04_Shift {

	          public static void main(String[] args) {
	        	  
	        	    int a = 4;                           //  00000000   00000000  00000000  00000100
	        	    int result = a >> 2;         //   00000000   00000000  00000000  00000001
	        	    System.out.println("a>>2 한 결과 : " + result);
	        	    
	        	    int result2;
	        	    result2 = a << 2;
	        	    System.out.println("a<<2 한 결과: " + result2);
	        	    
	        	    int b = -4;
	        	    int re1 = b >> 2;
	        	    System.out.println("b>>2 한 결과:"+ re1);
	        	    
	        	    int re2 = b >>> 2;
	        	    System.out.println("b>>>2 한 결과: " + re2);
	        	   
	        	   
	        	    
	          }
}
