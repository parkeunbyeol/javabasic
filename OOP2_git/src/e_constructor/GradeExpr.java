package e_constructor;

public class GradeExpr { // 카페 클래스 기초2

	//-----------멤버 변수
	int [] jumsu;
	
	GradeExpr(int[] jumsu){
		this.jumsu = jumsu;
	}
	//-----------생성자 함수
	double getAverage() {
		double avg = (double)getTotal() / jumsu.length;
		return avg;
	}
	 
	int getTotal() {
		int total = 0;
		for(int i=0; i<jumsu.length; i++) {
			total += jumsu[i];
		}
		
		return total;
		
	}
}
