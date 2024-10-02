package n_collection;


import java.util.*;

public class Ex04_set {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		set.add("zebra");
		set.add("cat");
		set.add("dog");
		set.add("ant");
		set.add("dog");
		set.add("zebra");
		
		System.out.println(set);         // 결과를 출력하면 중복 된 값은 제외돼서 출력됨. ex) 로또에서 많이 사용
		
	}
}
