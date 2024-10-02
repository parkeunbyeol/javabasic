package Cafe;

public class Account {

	private String name ="";
	private String num = "";
	private int jan;  // 초기잔액
	

	public void Inchul(int a) {
         if( a > jan)
        	 // 잔액이 부족할 때
        	 System.out.println("잔액이 부족합니다.");
         else {
        	 jan -= a;
  
        	 System.out.println("인출한 금액:"+a+"원");
        	 System.out.println("남은 잔액:"+jan+"원");
         }
	}
	 public void Ipgum(int b) {
	   	jan += b;
	   	System.out.println("입금한 금액:"+ b);
	   	System.out.println("잔액 : " + jan);
	 }
	 
	 public Account() {
		// name ="자바맨";
		// num = "123-456";
		// jan = 1000;
		
		 this("자바맨","123-456",1000);
		 
	 }
	 
     public Account(String name, String num, int jan) {
    	 this.name = name;
    	 this.num = num;
    	 this.jan = jan;
    	 System.out.println("예금주:"+name+",계좌번호:"+num+",잔액:"+jan+"원");
     }
}

