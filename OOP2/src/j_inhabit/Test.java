package j_inhabit;

public class Test {

	public static void main(String[] args) {
		
		
//		Umma u = new Umma();
//		u.gene();
//		u.job();
		
//		Ddal d = new Ddal();
//		d.gene();
//		d.study();
//		d.job();          // 부모꺼(job=Umma) 호출 가능
		
		//@@@@@@@@@@@@@@@@@@
		//변수는 부모 클래스이고 객체는 자식 클래스
//		Umma dal = new Ddal();
//		dal.job();
//		//dal.study();      // 변수가Umma이므로 Ddal꺼 못 사용
//		dal.gene();    // * 자식의 오버라이딩함수 호출
		
		
		//@@@@@@@@@@@ casitng
		//        참조형에서 부모자식간에 캐스팅
		/*
		 * [아래 경우는 아님]
		 * String a = new String();
		 * StrignBuffer b = (StringBuffer)a;
		 * 
		 */
		
//		Umma a = new Umma();
//		Ddal d = (Ddal)a;          // 없는 Ddal을 참조하려 해서 오류
		
		
//		Ddal d = new Ddal();
//		Umma a = (Umma)d;        // up casting 
//	    Ddal d2 = (Ddal)a;       // down casting 
		
		
		   // 연산자 : instanceof // 무엇의 객체인지 아닌지 판별해줌
		Ddal d = new Ddal();
		if(d instanceof Ddal) {
			System.out.println("Ddal 클래스 객체");
		}
		
		if(d instanceof Umma) {
			System.out.println("Umma 클래스 객체");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
