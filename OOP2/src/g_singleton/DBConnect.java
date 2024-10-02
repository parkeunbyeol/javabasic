package g_singleton;

public class DBConnect {

	private DBConnect(){
		System.out.println("실제 디비에 연결함");
	}
	
	
	private static DBConnect dbconn = null; // 멤버 변수이므로 "private"입력
	
	
	static public DBConnect getInstance() {
		if(dbconn == null) dbconn = new DBConnect();
		return dbconn;
	}
}

// Calander.getInstance()