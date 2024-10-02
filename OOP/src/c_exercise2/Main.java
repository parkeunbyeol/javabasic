package c_exercise2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		 Product s = new Product();
		
		Scanner input = new Scanner (System.in);
	    System.out.println("상품번호를 입력하세요");
         s.setProductNo(input.next());
	    
        System.out.println("상품명을 입력하세요");
         s.setProductName(input.next());
         
        System.out.println("초기재고량을 입력하세요");
          s.setStock(input.nextInt());
          
        System.out.print(s.output());
          
	}
		
	    
	
}
