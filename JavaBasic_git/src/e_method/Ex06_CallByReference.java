package e_method;

/*
 *  call by reference
 *        : 메소드의 인자(파라메터)의 자료형이 참조형인 경우     ** String형은 안됨
 *        
 *        => 주소만 복사
 */
public class Ex06_CallByReference {

	public static void main(String[] args) {
		
		StringBuffer a = new StringBuffer("안녕");
		StringBuffer b = new StringBuffer("하이");
		
		add(a,b);
        System.out.println("2. A="+a+", B="+b);
	}
	
	static void add (StringBuffer a, StringBuffer b) {
		a.append(b);  // a에 b를 더한다.
		System.out.println("1. A="+a+", B="+b);
	}
}
