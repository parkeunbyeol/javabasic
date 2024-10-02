package j_inherit2;

public class Item{

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
	 public void output() {
		 
	 }
}
