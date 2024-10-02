package f_static;

public class Main {

	public static void main(String[] args) {
		
		  Book b1 = new Book();  // 객체생성
		  Book b2 = new Book();
		  Book b3 = new Book();
	
	      System.out.println("책 갯수:"+ Book.getCount());  // "static"이 붙으면 객체 생성하지 않아도 "Class"명 접근이 가능하여 Book.count에서 Book.을 사용
	}
	
}
