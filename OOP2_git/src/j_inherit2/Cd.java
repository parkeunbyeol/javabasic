package j_inherit2;

public class Cd extends Item{

	private String singer;
	
	
	public Cd( ) {
		num = "0";
		title = "제목있음";
		singer = "가수";
		System.out.println("자식 기본생성장");
	}
	
	
	public Cd(String num, String title, String singer) {
		super.num = num;
		super.title = title;
		this.singer = singer;
		System.out.println("자식 기본생성장");
	}
	
	public void output() {
	System.out.println("책번호:"+num);
	System.out.println("책제목:"+title);
	System.out.println("가수:"+ singer);

	
	}
	
}