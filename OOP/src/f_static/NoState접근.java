package f_static;

public class NoState접근 {

	String name = "홍길동";
	
	  public static void main(String[] args) {
		
		  NoState접근 obj = new NoState접근();
		  
		  System.out.println("고객명:"+ obj.name);
	}
}
