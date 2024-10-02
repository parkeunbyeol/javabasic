package d_array;

public class Ex00_반복문연습 {

	public static void main(String[] args) {
		
		  
		// for문
		
//		for( int i =0 ; i <6; i++) {
//			
//		int temp = (int)(Math.random( ) * 45) + 1;           //input.lang 안에 포함됨  / 0.0 을 포함하면서 <= 랜덤 값 < 1.0
//		                // 4byte     // 8byte             //1~45까지출력, ex) 10이 라면 0~10까지 출력 
//		  System.out.print(temp + " / " );
//		}	  	
//	 
		// while문 변경
		
//           int i = 0;
//        		   while(i<=6) {
//        			   int temp = (int)(Math.random() *56) + 1;
//        			   System.out.println(temp + "/");
//        			   i++;
//        		   } 
//		             System.out.println( );
//		
		
		// do~while문 변경  do{} 먼저 하고 while{} 출력
		 
		     int i =0;
		     do {
		    	  int temp = (int)(Math.random() * 45) + 1;
		    	  System.out.print(temp+"/");
		    	  i++;
		     } while(i<6);
		     System.out.println( );
	
	}
	
}
