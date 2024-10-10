package model.dao_extra.sql;

public abstract class VideoSqlMap {

	//  영화정보입력
	public static String getMoivensertQuery() {
		StringBuffer sb = new StringBuffer();
		sb.append("	INSERT INTO  				");
		sb.append("		movie					");
		sb.append("		(						");
		sb.append("			movieno				");
		sb.append("			, movietitle		");
		sb.append("			, moviegenre		");
		sb.append("			, movieactor		");
		sb.append("			, moviedirector		");
		sb.append("			, moviedetail		");
		sb.append("		)						");
		sb.append("	VALUES								");
		sb.append("		(								");
		sb.append("			seq_movie_moiveno.nextval	");
		sb.append("			,?							");
		sb.append("			,?							");
		sb.append("			,?							");
		sb.append("			,?							");
		sb.append("			,?							");
		sb.append("		)								");
		return sb.toString();
	}
	
	// 비디오정보입력
	public static String getVideoInsertQuery() {
		StringBuffer sb = new StringBuffer();
		sb.append("	INSERT INTO  							");
		sb.append("		video								");
		sb.append("		(									");
		sb.append("			videono							");
		sb.append("			, movieno						");
		sb.append("		)									");
		sb.append("	VALUES									");
		sb.append("		(									");
		sb.append("			seq_video_videono.nextval		");
		sb.append("			, seq_movie_moiveno.currval		");
		sb.append("		)									");
		return sb.toString();
	}
}
