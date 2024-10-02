package e_constructor;

import java.util.Scanner;

public class GradeTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("데이터의 개수를 입력하세요->");
		int su = input.nextInt();
		
		int [] arr = new int[su]; // 입력된 데이터 개수를 크기로 원소를 갖는 "int"타입 배열을 생성

	    System.out.println("정수 데이타입력"); // 표준 입력으로 데이터를 받음 "arr"
	    for(int i=0; i<arr.length; i++) {
	    	arr[i]=input.nextInt();
	    }
	    
	    GradeExpr grade = new GradeExpr(arr);  // GradeExpr을 불러온  뒤, 위에 입력 받은 "arr"을 넘겨 받아  
	    System.out.println("총점:"+grade.getTotal());
	    System.out.println("평균:"+grade.getAverage());
	}
}
