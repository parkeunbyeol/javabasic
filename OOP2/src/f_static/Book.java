package f_static;

/*
 *   static : 공유
 *   
 *      ` 메모리에 단 1번 설정(지정)
 *      ` 클래스명 접근 (******)
 */
public class Book {

	private static int count;           // "static"을 붙이면 영역을 따로 하나 만들어 값을 저장한다.
	                            // 이렇게 되면 생성자 함수인 "Book"에는 "static"에 의해 개체가 저장 되는 것이 아닌, "static"을 가르키는 주소가 저장된다.
	
	static {
		System.out.println("딱한번");
	}
	
	public Book(){                        
		count++;
		System.out.println("책객체생성");
	}
	
	public static int getCount() {                //11행이 "private"가 돼서 "Main"에서 언급이 안되므로 사용 할 수 있도록 "public" 붙여 사용
		return count;
	}
}
