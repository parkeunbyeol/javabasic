package l_abstract;

public class Test {

	public static void main(String[] args) {
		
		//Book b = new Book("0001", "자바책", "출판사", "자바쌤");
        //b.output();
        
        
        //Book b2 = new Book();
        //b2.output();
        
        //부모변수에 자식객체 생성
        Item b = new Book("0001", "자바책", "ICT", "자바쌤");        
        b.output();
	}
}
