package e_method;

/*
 * call by value
 *       : 메소드의 인자(파라메터)가 기본형인 경우 // 인자는 값을 보내는 역할
 *       
 *       => 값만 복사
 */
public class Ex06_CallByValue {

	public static void main(String[] args) {    // 메소드는 main부터 실행
		
		int a = 10, b = 20;                       // 정수형(기본형) 변수 a, b에 각각 10, 20을 설정 
		add(a,b);                                 // a,b의 값을 가지고 18행으로 점프
		System.out.println("2. A="+a+",B="+b);
	}
	
	static void add(int a, int b) {   // add () 괄호에 형 기입 해야함 (ex int double)     // return이 없으므로 void 그대로 유지
		 a += b; // a=a+b;                          // 14행에서 가져온 a=10 ,b=20의 값을 가지고 a += b (a = a+b)실행
		 System.out.println("1. A="+a+",B="+b);
		
	}
}
