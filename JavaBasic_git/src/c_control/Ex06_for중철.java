package c_control;

public class Ex06_for중철 {

	public static void main(String[] args) {
		
		
//		for (int  j=0;  j<5; j++) {            // 5줄			
//			for(int i=0 ; i<5 ;i++ ){             //  5칸
//		       System.out.print("*");
//		}
//		System.out.println();
//		}
		
		
//		for (int  j=0;  j<5; j++) {            // 5줄			
//			for(int i=0 ; i<j+1 ;i++ ){             //  5칸
//		       System.out.print("*");
//		}
//		System.out.println();
//		}
		
		for(int j=0; j<5; j++) {   // 5줄
			// 공백출력
			for( int i=0; i<j; i++ ) {
				System.out.print("  ");
			 }
	
			// '*'찍기
		for(int i=0 ; i<5-j ;  i++) {     // 5칸
	       System.out.print("*");        
	    } // end of for- i
	System.out.println();
	
	     }  // end of for-j
	
		
		
	}  // end of main

} // end of class
