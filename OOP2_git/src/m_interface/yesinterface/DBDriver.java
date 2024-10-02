package m_interface.yesinterface;

public interface DBDriver {
           void connect();         // 여기서 public은 없어도 자동으로 기재 돼서 없애도 되지만, public을 지워버리면 자녀에서 메소드는 똑같이 
	public void insert();         // 안써도 오류가 뜬다. 왜냐면 자녀에서는 public을 없애면 자동으로 기재가 안되기 때문. 따라서 안적어도 되지만 꼭 적어주기 
}
