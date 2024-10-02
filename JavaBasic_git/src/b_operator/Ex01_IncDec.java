package b_operator;

public class Ex01_IncDec {

	public static void main(String[] args) {
		
		   int a = 5;  // 정수 변수에 5를 선언
		   int b = 7; // 정수 변수 7를 선언
		
		   System.out.println("A=" + a + ", B=" + b);
		   System.out.println("A=" + a+1 + ", B=" + b+1);    // [주의] 1을 문자 취급
		                                         //  A=51       B =71
		   System.out.println("A=" + (a+1) + ", B=" + (b+1)); // 괄호 먼저 계산
                                                 // A = 6        B = 8
	
	         a = a+1;          // 깔끔한 코딩 , 연산 먼저 후 대입됨 
             b = b -1;	          
             System.out.println("A=" + a + ", B=" + b);
             
             // 증가감소연산자
             a++; // a = a+1;
             b --;	 // b = b - 1;          
             System.out.println("A=" + a + ", B=" + b);
             
             ++a; // a = a+1;
             --b;	 // b = b - 1;          
             System.out.println("A=" + a + ", B=" + b);
             
            // --------------------------
             
              int z =10,  y=10;
              int result = ++z; // z=z+1; int result = z;
              System.out.println(result); //11
             
              int result2 = y++;  // int result2 = y; y=y+1;
              System.out.println(result2); // 10
           
             System.out.println("Z=" + z + ",Y=" + y); // Z=11, Y=11
             
             System.out.println("Z=" + ++z + ",Y=" + --y); //  Z= 12,  Y=10
             System.out.println("Z=" + z++ + ",Y=" + y--); //  Z = 12 , Y=10
             
             System.out.println("Z=" + z + ",Y=" + y);
             
             
             
             
             
	}

}
