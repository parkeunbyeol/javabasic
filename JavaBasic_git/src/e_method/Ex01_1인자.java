package e_method;

/*
 *   인자 - argument
 *   매개변수 - parameter
 *   
 *   인자 := 매개변수  
 */
public class Ex01_1인자 {

	public static void main(String[] args) {
		// 데이타 
		int a=10, b=20;
		
		add(a, b); // 인자: argument    // 인자=데이터 넘기는 역할
	}              // 인자는 값을 보내주는 일, 여기서는 a와 b의 변수를 17행에 보내줌

	static void add(int a,  int b) {       // 매개변수 : parameter
		// 데이타에 대한 처리
		int sum = a + b;
		System.out.println("합:" + sum);

	}
}

