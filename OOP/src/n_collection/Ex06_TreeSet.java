package n_collection;

import java.util.TreeSet;

public class Ex06_TreeSet {

	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		set.add("zebra");
		set.add("lion");
		set.add("dog");
		set.add("elephant");
		set.add("rabbit");
		set.add("bee");
		set.add("snake");
		// set.add("dog");  // 중복안됨
		
	    System.out.println(set);
	    System.out.println(set.subSet("d", "t"));   // d부터 t전까지 사이에 있는 알파벳으로 시작하는 단어만 출력
	    System.out.println(set.headSet("e"));   // e전까지의 알파벳으로 시작하는 단어만 출력
        System.out.println(set.tailSet("e"));  //
	}   
	
}
