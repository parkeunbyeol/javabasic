package c_control;

public class Ex06_for중첩_알파벳 {

	public static void main(String[] args) {
	
           
//		for( int i = 0; i <26 ; i++) { //26줄 출력하는 반복문
//			
//		for( char ch ='A' ; ch<='A'+i ; ch++) {         // 대문자 A~Z출력하는 반복문
//            	 System.out.print(ch);
//             }
//        	    System.out.println();
//		} 

//		for( int i = 0; i <26 ; i++) { //26줄 출력하는 반복문
//			
//		for( char ch ='A' ; ch<='Z'-i; ch++) {         // 대문자 A~Z를 하나씩 줄여서 나오게 하는 반복문
//            	 System.out.print(ch);
//             }
//        	    System.out.println();
//		} 
		
//		for( int i = 0; i <26 ; i++) { //26줄 출력하는 반복문
//			
//		for( char ch ='Z' ; ch>='Z'-i ; ch--) {         // 대문자 A~Z출력하는 반복문
//            	 System.out.print(ch);
//             }
//        	    System.out.println();
//		} 
		
		// [문제 4]
		
		  for(int i = 0 ; i<26 ; i++) {         //26줄 출력하는 반복문
			  
			  for (char ch =(char)('A'+i); ch<='Z' ; ch++) { 
				                        // char res = (char)    
				  //char = 2바이트, i = 4바이트 , char는 단항 연산자이므로 (char)'A'+i는 'A'만 관여하게 됨
			   System.out.print(ch); 
			  }   
			   System.out.println();
			  
}
}
}