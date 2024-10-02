package d_array;

public class Ex03_2차원배열연습 {

	public static void main(String[] args) {

		int a[][]=new int[][]{
			{3,-5, 12 }, 
			{-2, 11, 2, -7},  
			{21, -21, -35, -93, -11}, 
			{9, 14, 39, -98}};


			//         // 출력
			//    	 for(int i=0; i<4; i++) {
				//    		 for(int j=0; j<a[i].length; j++) {
					//    			 System.out.print(a[i][j]+"/");
			//    		 }
			//    		 System.out.println();
			//    	 }
			//	
			//    	 
			//        // a 배열의 모든 값의 합을 구하기
			//    	 int sum=0;
			//    	 for(int i=0; i<a.length; i++) {
			//    		 for(int j=0; j <a[i].length; j++) {
			//    			 sum = sum + a[i][j];  //[]데이터가 있는 장소
			//    		 }
			//    	 }
			//    	 
			//    	 System.out.println("합:" + sum);
			//    
			//------------------------
			// 각 행의 값들의 합이 가장 큰 행을 출력하기
			int hap [] = new int[a.length];


			// 
			// 계산 위치
//			for(int i=0; i<a.length;i++) {
//				for(int j=0; j<a[i].length; j++) {
//					System.out.println(a[i][j]+ "/");
//				}
//				System.out.println();
//			}

			int sum=0;
			for(int i=0; i<a.length; i++) {
				for(int j=0; j<a[i].length; j++) {     // int j의 길이
					hap [i] = hap[i] + a[i][j];
				}
			}			
			// 출력
			for(int i=0; i<hap.length; i++) {
				System.out.println(i+"번째 줄의 합" + hap[i]);
			}



	}

}
