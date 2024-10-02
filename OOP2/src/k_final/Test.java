package k_final;

/*
 *    final : 변경불가
 *    
 *           -class  : 부모 클래스 될 수 없음
 *           -field  : 값 변경
 *           -method : overriding (기존에 부모가 가진 함수를 자식이 내가 다시 지정할께 하는 것)
 * 
 */
class Parent{
	final String field = "부모님꺼";
	final void jib() {
		System.out.println("부모님이 만드신 집");
		
	}
}

class Child extends Parent{
	Child(){
//		field = "내꺼";
	}
//    void jib() {
//    	System.out.println("자식이 탕진");
//    }
}
public class Test {

	public static void main(String[] args) {		
		Parent p = new Child();
		System.out.println(p.field);
		p.jib();   // "p"arent 안에 있는 jib 호출
	}
}
