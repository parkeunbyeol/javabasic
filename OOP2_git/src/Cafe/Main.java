package Cafe;

import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		System.out.println("예금주를 입력하세요:");
         String name = input.next();
        System.out.println("계좌번호를 입력하세요:");
         String num = input.next();
        System.out.println("초기잔액을 입력하세요:");
         int jan = input.nextInt();
         
         Account atm = new Account (name, num, jan);
         
         Scanner input2 = new Scanner(System.in);
         System.out.println("업무를 선택하세요 -> 1.인출  2.입금");
         int upmu = input2.nextInt();
         
         System.out.println("금액을 입력하세요->");
         int don = input2.nextInt();
         
         if(upmu == 1) {
         atm.Inchul(don);
         }else if(upmu == 2) {
         atm.Ipgum(don);
         }
         
         
         
	}	
	
	
	         
}	    
