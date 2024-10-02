package c_exercise2;

import java.util.Scanner;

public class Product {

	// 멤버변수 *멤버변수는 "private"를 사용하여 지정한다. 
	private String productNo;
	private String productName;
	private int stock;

	
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	// 멤버메소드
    public void income(int num){
      stock += num;
    	}
	
    public void sale(int panmae ) {
      stock -= panmae;
    }
    
    public void output(){
     System.out.println("상품번호:"+productNo);
     System.out.println("상품명:"+productName);
     System.out.println("재고량"+stock);
    }
}
