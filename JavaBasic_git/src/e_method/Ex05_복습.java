package e_method;

public class Ex05_복습 {

	public static void main(String[] args) {

		int data1= 1000;
		double data2 = 1.99;

		String result = method(data1, data2);
		// msg의 값을 출력

		System.out.println(result);
	}

	static String method(int data1, double data2) {      // method로 받는 자료형의 순서는 맞춰야하고, 변수명은 내맘대로
		// data1과 data2의 값을 여기서 출력
		System.out.println(data1);
		System.out.println(data2);

		String msg = "안녕하세요";

		return msg;
	}
}
