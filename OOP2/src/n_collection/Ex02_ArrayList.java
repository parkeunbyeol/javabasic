package n_collection;

import java.util.ArrayList;
import java.util.Collections;

public class Ex02_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();       //제너렉스
		list.add("rabbit");
		list.add("cat");
		list.add("dog");
		list.add("fox");
		list.add("ant");
		
		System.out.println(list);
		
		list.set(3, "lion");
		System.out.println(list);
		
		list.add("tiger");
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);
		
		Collections.sort(list);         // Collections.sort();= 자동으로 순서대로 배열해줌
		System.out.println(list);
	
//		for(String temp : list ) {     // 향상 된 "for"문  = 집합이고, 자료형이 딱 고정됐을 경우에만 사용 / 세미콜론";" 말고, ":" 콜론을 사용, for(집합명:자료형)
//			
//		}
//		
//		for(int i =0; i<list.size(); i++) {
//			Object obj = list.get(i);
//			System.out.println(obj);
//		}
	
	
	}
}
