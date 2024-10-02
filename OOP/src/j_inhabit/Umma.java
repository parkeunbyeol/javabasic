package j_inhabit;

public class Umma extends Object {        //extends Object 이건 엄마의 부모다. 딸의 부모는 엄마이기 때문에 딸도 오브젝트에 포함된다.

	public Umma() {
		System.out.println("엄마 생성");
	}
	
	// overriding method  = 부모랑 똑같은 함수가 들어있다
	public void gene() {
		System.out.println("부모는 부모다");
		
	}
	
	public void job() {
		System.out.println("엄마는 대장");
	}
}
