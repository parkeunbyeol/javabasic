package n_collection;

import java.util.ArrayList;
import java.util.List;

public class Ex01_ArrayList {

	public static void main(String[] args) {
		
		List result = method();
		// 처리
		for(int i = 0; i<result.size(); i++) {
			Object obj = result.get(i);
		    System.out.println(obj);
		}
	}
	
	static List method() {
		// 데이타
		String name = "홍길자";
		Integer age = 100;    // Integer = int (호환되면 사용 가능)
		Double height = 190.99;
		
		ArrayList list = new ArrayList();
		//Object [] obj = new Object();
		list.add(name);
		list.add(age);
		list.add(height);

		return list;
	}
}
// 값을 지정 = setter, 값을 뽑아오는 것 = getter