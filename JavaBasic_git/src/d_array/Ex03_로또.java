package d_array;

public class Ex03_로또 {

	public static void main(String[]args) {
		
		int [][]lotto = new int[6][5];
		
		// 값지정: 임의의 값
		for(int i=0; i<lotto.length; i++) {            // 로또는 6개의 숫자를 고르므로, i<6이 된다.    
			int temp = (int)(Math.random()*45)+1;
		}
		
		// 출력
	}
}
