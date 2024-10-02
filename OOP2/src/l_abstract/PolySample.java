package l_abstract;

public class PolySample {

	public static void main(String[] args) {
		
		Item[] result = method();
		// 처리(출력)
		for(int i =0; i <result.length; i++) {			
			result[i].output(); // 다형성
		}
	}
	
	static Item[] method() {       // return 사용시 void 대신 자료형(Object[]) 기입 
		// 데이타
		Book b = new Book("001","파이썬", "ICtT", "누군가");
		Dvd d = new Dvd("002", "탈주", "한국인", "한국감독");
		Cd c = new Cd();
		
		Item[] obj = new Item[3];
		obj[0] = b;
		obj[1] = d;
		obj[2] = c;
		
		return obj;
	}
}
