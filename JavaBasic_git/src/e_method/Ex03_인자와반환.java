package e_method;

public class Ex03_인자와반환 {
 
	public static void main(String[] args) {
		// 데이타 
		int a= 10, b= 20;
		int sum = add(a, b);
		// 결과
		System.out.println("합:" + sum);
	}
	
	static int add(int a, int b) {            // 8행의 add(a,b)의 값을 받을 때 int z, int y로 받아도 되지만
		// 데이타 처리                            // 사용자가 보기 편하게 보통은 12행과 같이
		int sum = a+b;                        //같은 변수 이름(int a, int b)으로 받는다.
	    return sum;
		
	}

	
	
}
