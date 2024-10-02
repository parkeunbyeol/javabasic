package l_abstract;

/*
 * abstract (추상) : 미완성
 *         -method : 오버라이딩 강제성
 *         -class : 객체생성못함(부모클래스 역할)
 */ 
 abstract public class Item{

	 protected String num;     // 자식들만 사용할 수 있도록
	 protected String title;

	 
	 public Item() {          //기본 생성자
		 num = "0";
		 title = "";
		 System.out.println("부모 기본 생성자");
	 }
	 
	 public Item(String num, String title) {
		 this.num = num;
		 this.title = title;
		 System.out.println("부모 인자 생성자");
	 }
	 
	 //overriding
	 abstract public void ouput(); //abstract는 public 앞 이나 뒤 아무곳이나 가능
}
