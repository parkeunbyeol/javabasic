package e_method;

public class Ex04_멤버변수범위 {

	static int a = 10, b=20;
	static int sum =0;                  // 멤버변수는 자동초기화가 되지만, 습관적으로 java에서는 해주는 걸 권장
	
	public static void main(String[] args) {
		
		
		add();
		System.out.println("합:" + sum);
	}

	static void add() {
	   sum = a + b;	
	}
}
