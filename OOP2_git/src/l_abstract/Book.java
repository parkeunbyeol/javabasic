package l_abstract;

/*
 *   @ this / super
 *   
 *        this : 자기 객체를 지정
 *        super : 부모 객체를 지정
 */
public class Book extends Item {

	private String publisher;
	private String writer;
	
	public Book() {
	         num = "0000";
	         title = "제목없음";
	         publisher = "미정";
	         writer = "무명";
	         System.out.println("자식 기본생성장");
	}        
	
	public Book(String num, String title, String publisher, String wirter) {
		//super.num = num;                    // super. 은 부모꺼 호출하는 것
		//super.title = title;
		super(num,title);
		this.publisher = publisher;           // this.내 객체
		this.writer = wirter;
		System.out.println("자식 인자 생성자");
	}
	
	
	// overriding
	public void output() {
		System.out.println("책번호:"+num);
		System.out.println("책제목:"+title);
		System.out.println("출판사:"+ publisher);
		System.out.println("작가:"+writer);
	}
}
