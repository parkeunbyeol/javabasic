package model;

import java.util.ArrayList;

import model.vo.VideoVO;

public interface VideoDao {
	// 영화정보 입력
	void insertVideo(VideoVO vo, int count) throws Exception ;
	
	// 비디오(영화) 검색	
	ArrayList selectVideos(int idx, String word) throws Exception; 
	
	// 영화 번호에 의한 전체 정보 검색	
	VideoVO selectByPk (int vnum) throws Exception ;
	
	// 영화정보 수정
	void modifyVideo(VideoVO vo ) throws Exception;
}
