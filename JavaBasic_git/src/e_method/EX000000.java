package e_method;

public class EX000000 {


/*		static void method( int i, int j) {
		     i += j;
		     System.out.println("i = " + i +  ", j =" + j );
		}
		public static void main ( String  [] args ) {
		     int i = 4, j = 2;
		     method( i, j );
		     System.out.println("i = " + i + " , j =" + j );
		}
		
}             // 출력 -> i = 6, j =2
  */            //       i = 4 , j =2

	static int method( int i, int j) {             
	     int sum = i + j;                                // 27행에서 받은 갑으로 계산 시 int sum =6;
	     System.out.println("sum = " +  sum );           // 출력하면 * sum = 6
	     return sum;                                     // 다시 28행으로
	}
	public static void main ( String  [] args ) {        // 24행부터 시작
	     int i = 4,  j = 2;                        
	     int sum = 0;
	     method( i, j );                                  // i = 4 , j= 2의 값을 19행으로 넘김
	     System.out.println("sum = " +  sum );            // 22행 다음 실행되는데, 22행의 sum=6인 값은 여기서 영향을 끼치지 않는다
	                                                      // 왜냐면 여기서 sum값을 받는 변수가 없기 때문에 22행의 값은 28행에서 무의미
	                                                      // 그러므로 그대로 * sum = 0으로 출력
	}
	
}