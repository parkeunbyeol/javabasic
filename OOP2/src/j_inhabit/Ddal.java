package j_inhabit;

//****************상속
public class Ddal extends Umma {             // "extends Umma"를 사용해야 Umma를 사용할 수 있다.
	public Ddal () {
		System.out.println("딸 생성");
		
	}
	
	public void study() {
		System.out.println("딸은 학생");
	}
}
