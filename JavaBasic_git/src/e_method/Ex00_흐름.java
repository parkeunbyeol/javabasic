package e_method;

public class Ex00_흐름 {

	static void method(){
		System.out.println("method 실행");
	     
    }
	
	public static void main(String[] args) {             // JVM(자바버추얼머신)은 main을 찾은 뒤 먼저 실행
		                                                 // 실행 후 순차적으로 실행 
		System.out.println("main 시작");
		method();                                        // 이때 mathod();를 만나면 method를 찾아가 먼저 실행
		method();                                        // 실행 후 괄호를 벗어나고 건너 뛴 다음 행(순서대로)을 실행
		method();
		System.out.println("main 끝");		                 
	}
	

	
}

