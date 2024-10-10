package model.dao_extra.sql;

// 객체 생성못하게 abstract 지정
public abstract class CustomerSqlMap {

	// 고객정보 입력
	public static String getCustomerInsertQuery() {
		StringBuffer sb = new StringBuffer();
		sb.append("	INSERT INTO  			");
		sb.append("		customer			");
		sb.append("		(					");
		sb.append("			custname		");
		sb.append("			, custtel		");
		sb.append("			, custtelaid	");
		sb.append("			, custaddr		");
		sb.append("			, custemail		");
		sb.append("		)					");
		sb.append("	VALUES					");
		sb.append("		(					");
		sb.append("			?				");
		sb.append("			,?				");
		sb.append("			,?				");
		sb.append("			,?				");
		sb.append("			,?				");
		sb.append("		)					");
		
		return sb.toString();
	}
}
