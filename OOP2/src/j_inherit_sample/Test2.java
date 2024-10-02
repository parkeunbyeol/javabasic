package j_inherit_sample;

import java.awt.*;

//상속
public class Test2 extends Frame {

	
	Test2(){
		super("나의 두번째 창");
		setBounds(100, 100, 500, 400);
		setVisible(true);           // 상속 관계를 맺은 부모가 갖고 있다 생각해서 setVisible 사용
	}
	
	
	
	public static void main(String[] args) {
		
		Test2 t = new Test2();
		
		
	}
}
