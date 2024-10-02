package b_operator;

public class Ex09_삼항복습 {

	public static void main (String[] args) {
		
		//  두 수 중에서 큰수를 출력
		
/*	       int a = 15, b=40;

	       int max;
	       if ( a > b ) {
	    	   max = a;
	       }else {
	    	   max = b;
	       }
	       System.out.println("두 수 중 큰수는" + max);

*/	
	
		//  두 수를 입력 받고 그 두 수 중에서 큰 값 출력 (삼항연산자 이용)
		int a = 15,  b=40;
				
		String result = (a>b)?  "a" : "b" ;
		System.out.println("큰 값은" + result);
		
	}
	         
}
