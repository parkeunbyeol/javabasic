package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public interface RentDao {  // 인터페이스 안에는 자동으로 public이 처리되어 적어주지 않아도 되지만 헷갈리수 있으므로 적어주는 습관
	
	// 대여 버튼이 눌렸을 때
	public int rentVideo(String tel, int vnum) throws Exception;
	

	// 반납 버튼이 눌렸을 때
	public int returnVideo(int vnum) throws Exception;
	
	// 미납목록 검색하기
	public ArrayList selectNoReturnList() throws Exception;

}
