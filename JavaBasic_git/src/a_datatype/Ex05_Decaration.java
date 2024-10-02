package a_datatype;

public class Ex05_Decaration {

	public static void main(String[] args) {
		
		    /*
		    int kor;  // 숫자를 지정하는 변수 kor선언 - 변수 선언(메모리 확보)
                 kor = 30;  // 선언한 변수에 30 대입 (오른쪽이 왼쪽에 저장된다 라는 뜻) - 값 대입
           
                 
                  // 초기 화 = 변수 선언 + 값 대입 (즉 선언하며 값을 한번에 대입하는 방법)
                    int eng = 30;
                    */ 
		
		
		      int kor = 30, eng=50;
		
		       	 // 두 점수 맞바꾸기 => 두 변수의 값을 바꾸기
	          // kor = 30, eng = 50
	         // [바꾼 후] kor =50, eng=30
		      
		      int temp = kor;   // 값을 맞바꾸려면 임시변수를 꼭 선정해줘야 한다
		         kor = eng;
		         eng = temp;
		         
		      
		      System.out.println("국어:" + kor + " , 영어=" + eng);
		      System.out.printf("국어: %d,  영어= %d\n\n\n", kor, eng);
		      // System.out.println();		
		      
		    		  /* 
		    		   * 만약에 국어점수와 영어점수가 동일하니
		    		   * 그렇다면 "두 점수가 동일" 이라고 출력
		    		   * 그렇지않다면 "두 점수는 다름" 이라고 출력
		    		   */
		         if(kor == eng) {
		        	 System.out.println("두 점수가 동일");	         
	            } else {
		        	 System.out.println("두 점수가 다름");	        	 
		         }
		        	 
		 
	}
		  
		         
}
