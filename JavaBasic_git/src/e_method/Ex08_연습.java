package e_method;

public class Ex08_연습 {

	public static void main(String[] args) {
		multiple (2, 3);    // 10행으로 감
		multiple (4,'ㅋ');   // 13행으로 감
		multiple (2, 3, 'ㅋ');  // 16행으로 감
	}
	static void multiple(int a, int b) {
	    System.out.println( a * b );
	}
	static void multiple(int a, char ch) {
		for(int i =0 ; i<a; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	static void multiple(int n, int m, char c) {
		for(int i =0 ; i<n ; i++) {
			System.out.println("");
		for (int j=0 ; j<m ; j++) {
			System.out.print('ㅋ');						
		}
	}
		
		
	}
}

