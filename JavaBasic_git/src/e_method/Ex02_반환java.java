package e_method;

/*
 * 함수가 끝나기 전에 끝내려고 할 때 : return
 * 
 * return 할 때 딱 하나의 값만 반환 가능!
 */
public class Ex02_반환java {

	public static void main(String[] args) {

		int sum = add();                 // int sum이 붙은 이유 = 20행에서 반환(return)된 sum 값을 받기 위해 (저장하기 위해) 
		                                 // 붙여줘야 함    
		System.out.println("합:" + sum);    
	}

	static int add() {             // void의 뜻 = 반환하는 값이 없다. return(반환)이 있게 되면 void 사용 못함
		// 데이타
		int a =10, b =20;
		int sum = a + b;
		return sum;              // return은 프로그램 흐름을 끝까지 가지 못하게 하는 역할
	}
}
