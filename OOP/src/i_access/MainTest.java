package i_access;

public class MainTest {

	public static void main(String[] args) {
		
		Access acc = new Access();
		//acc.a = "프라이빗 변경";
		acc.b = "퍼블릭 변경";
		acc.c = "프로텍티드 변경";
		acc.d = "디폴트 변경";
		
		acc.output();
	}
}
