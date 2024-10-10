package model.vo;

// VO := DTO (Data Transfer Object)

public class VideoVO {

	// 멤버변수
	int mvno;
	String mv_genre;
	String mv_title;
	String mv_direc;
	String mv_actor;
	String mv_exp;	
	int mv_inven;
	
	//default 생성자
	public VideoVO () {
		
	}

	public VideoVO (int mvno, String mv_genre, String mv_direc, String mv_actor, String mv_exp, int mv_inven) {
		this.mv_genre = mv_genre;
		this.mvno	  = mvno;
		this.mv_direc = mv_direc;
		this.mv_actor = mv_actor;
		this.mv_exp   = mv_exp;
		this.mv_inven = mv_inven;
		
		
	}
	
	// getter, setter
	
	public int getMvno() {
		return mvno;
	}
	public void setMvno(int mvno) {
		this.mvno = mvno;
	}
	public String getMv_genre() {
		return mv_genre;
	}
	public void setMv_genre(String mv_genre) {
		this.mv_genre = mv_genre;
	}
	public String getMv_title() {
		return mv_title;
	}
	public void setMv_title(String mv_title) {
		this.mv_title = mv_title;
	}
	public String getMv_direc() {
		return mv_direc;
	}
	public void setMv_direc(String mv_direc) {
		this.mv_direc = mv_direc;
	}
	public String getMv_actor() {
		return mv_actor;
	}
	public void setMv_actor(String mv_actor) {
		this.mv_actor = mv_actor;
	}
	public String getMv_exp() {
		return mv_exp;
	}
	public void setMv_exp(String mv_exp) {
		this.mv_exp = mv_exp;
	}
	public int getMv_inven() {
		return mv_inven;
	}
	public void setMv_inven(int mv_inven) {
		this.mv_inven = mv_inven;
	}


	

	
	
}
