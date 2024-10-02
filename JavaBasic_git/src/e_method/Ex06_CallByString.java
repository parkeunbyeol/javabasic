package e_method;

public class Ex06_CallByString {

	public static void main(String[] args) {
		String a = "안녕";
		String b = "하이";           // String은 new String(""); 안해도 됨
	
		add(a, b);
		System.out.println("2. A="+a+",B="+b);
	}

    static void add(String a, String b) {
    	a += b;           // 원래는 기본형만 += 가능하지만 참조형인 String은 예외로 가능함.
    	                  // String class는 내용이 변경되면, 새로운 영역을 만든다.따라서 10행의 결과를 출력하면 5,6행의 값으로 출력
    	System.out.println("1. A="+a+",B="+b);
    }
}

