package n_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex05_Lotto {

	public static void main(String[] args) {
		
		Set<Integer>lotto = new HashSet<Integer>();
		
		while (lotto.size() < 6 ) {  // lotto의 사이즈가 6개보다 작을때까지 = 총 lotto는 6개 나옴 (0,1,2,3,4,5 =총6개) 
//			int num = (int)(Math.random()*45) + 1;
//			lotto.add(num);
			
			lotto.add((int)(Math.random()*45) + 1);
		}
		List list = new ArrayList(lotto);
	    Collections.sort(list);   
		System.out.println(list);
	
	}
	
	
}
