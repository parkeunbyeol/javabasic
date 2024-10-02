package c_control;

/*
 *   break : 블럭을 벗어나는 문장
 *   continue : 블럭의 끝으로 이동하는 문장
 */
public class Ex10_BreakCoutinue {

	public static void main(String[] args) {
	
/*		       END:
		        for( int i=0; i<2; i++) {
		        	
		 		       for(int j=0; j<3; j++) {
		    	   if(j==1)   break END;  //continue;          // END 라벨은 라벨이 붙여진 반복문의 끝으로 간다.
		    	// END라벨이 오는 곳
		    	   System.out.printf("< %d , %d  > \n", i,  j); // END라벨이 오는 곳
     // continue오는 자리	(블럭 안으로)	   그러므로 j==1일때는 점핑하기 때문에 <1>은 출력이 안된다.  
		    	   }  // break오는 자리 (블럭 밖으로)
		       System.out.println("데이터");
	}
*/
		
/*[확인]제어문
 * 1) 2 3 6
 * 2)1 (=표시는 ==로 써야함, i=0은 단순 i에 0대입)
 * 3) 2 3   
 * 4)4
 *5)4
 * 6)
 * 
 * 
*/	
	 //-------------------------------제어문 6번
		int i = 1, j =10;
		do {
			if( i > j) break;
			j--;
		}while (++i <5);
		System.out.println("i=" + i, "j=" + j);
	}

}
