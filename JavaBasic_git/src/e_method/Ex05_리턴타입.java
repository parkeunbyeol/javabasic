package e_method;

public class Ex05_리턴타입 {

	public static void main(String[] args) {
		
		int [] result = add();
		int sum = result[0] + result[1];
		System.out.println("합:"+sum);
		                 
	}
	
	static int[] add() {           // 값 맞추기(int [])
		int a=10, b=20;
		
		// a,b의 값을 호출한 곳으로 넘겨야 한다면??
		int [] data = {a,b};     // return은 값을 오직 하나만 보낼 수 있으므로 a와 b 둘 다는 불가
		                         // 대신 a,b를 하나의 배열로 묶어서 새로운 배열 변수(=int [] data)를 설정해주면 하나의 값이 
		return data;           // 되므로 return data;로 값을 넘겨줄 수 있다. 
		            
		
	}
}
