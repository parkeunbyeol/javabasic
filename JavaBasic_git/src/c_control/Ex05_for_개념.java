package c_control;

public class Ex05_for_개념 {

	public static void main(String[] args) {
		
		/*  
		int result = 0;
		   for(int a = 1 ;  a<=10000 ; a++ ) {    //10까지 나오게 하는 코딩
			     result = result + a;                // result =
		   }
		    System.out.println("결과"+result);
		  */
		
		
		// 1부터 10까지의 홀수의 합과 짝수의 합을 구하기
		    int odd = 0, even=0;
		 /*   for (int a =1;  a<=10; a++){
		    	 if( a%2==0) {
		    		 odd += a;
		    	 }else {
		    		  even += a;
		    	 }
		    }
		   */
		       for(int a =1; a<=10; a+=2) {
		    	   odd += a;
		    	   even += (a+1);
		       }
		    
		        System.out.println("홀수의 합"+odd);
		        System.out.println("짝수의 합"+ even);
		
		
		
//		   for(int a = 10; a>0 ; a=a-2) { // a값 출력 후 조건문으로 넘어간 뒤 결과 출력 후 증가치(a=a-2) 값으로 입력  -> 
//			                                                 // 다시 조건문 -> 다시 출력 -> 다시 증가치 -> 다시 조건문 ~~ 증가치 값이 끝나면 출력 종료
//			   System.out.println(a);
//		   }  
//		   
//		   for(char ch = 'Z';  ch >= 'A'; ch--) {
//			   System.out.println(ch);
//		   }
		   
		   // a가 10부터 들어가면 
		
//		    for( char ch = 'A'; ch <='Z' ; ch++ ) {   //ch가 ++증하는 이유, 아스키값에 따라 bcdf로 갈 때마다 하나씩 커짐
//		      System.out.println(ch);
//		    }
//		    
//		    for(char ch = '가' ; ch<='힣'; ch++) {
//		    	System.out.println(ch);
//          }
		    
	}  
}
