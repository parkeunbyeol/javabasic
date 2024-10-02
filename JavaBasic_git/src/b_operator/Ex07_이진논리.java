package b_operator;

public class Ex07_이진논리 {

	public static void main (String[] arg) {
		
		int a= 15;         //  00000000    000000000   000000000  00001111
		int b = 10;       //   00000000    000000000   000000000  00001010
		
		int and = a&b;   //   00000000    000000000   000000000  00001010
		System.out.println("and =" + and );
		
		
		int or = a|b;  //    00000000    000000000   000000000  00001111
		System.out.println("or = " + or);
		
		
	    int ex = a^b;  //     00000000    000000000   000000000  00000101
	    System.out.println("ex=" + ex);
		
	} 
	
}


/*
              논리연산자(이진=비트)
             
             A  B       A  &  B     A  |  B      A   ^   B                                         직렬& / 병렬 |
           ---------------------------------------------------------------------------
             0   0             0               0                0
             0   1             0               1                1
             1   0             0               1                1
             1   1             1               1                0



*/