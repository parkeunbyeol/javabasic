package h_innerclass;

/*
 *    inner class : 클래스 안에 클래스 (멤버 취급)
 */


class Outer{
	static class Inner{
		static void najabara() {
			System.out.println("잡아봅시다");
		}
	}
	
}

public class MainTest {
	
	public static void main(String[] args) {
	  /*Outer o = new Outer();
		Outer.Inner in = o.new Inner();  // Outer앞에 있는 Inner class를 새로운 Outer 안에 있는 Inner로 설정한다.
		in.najabara();*/
	  /*Outer.Inner in = new Outer.Inner(); // Static은 멤버 변수에 붙이는 데 이때 객체 생성하지 않아도 클래스명으로 언급 가능.
		in.najabara();*/
		Outer.Inner.najabara();   // 23행과 마찬가지로 Static은 멤버 변수에 붙이는 데 이때 객체 생성하지 않아도 클래스명으로 언급 가능.
	}

}
