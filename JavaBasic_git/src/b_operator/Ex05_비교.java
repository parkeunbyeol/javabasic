package b_operator;

/*
 * 
 *      비교연산자
 *      
 *      
 *        >   >=  <  <=     ==   !=
public static void main(Strign[] args{
}
System. out. println()
 * 
 */
public class Ex05_비교 {

	public static void main(String[] args) {
		
		 int kor = 89, eng=87, math=77;
		 // 총점, 평균을 구해서 변수에 저장하고 출력
		
		 int total = kor + eng + math ; 
		System.out.println("총점:" + total);
		
		double avg = (double)total  / 3;        // 과목수 =3(정수)이므로, 평균 소숫점 살리기 위해 형변화(double) 진행
		System.out.println("평균:" + avg);
		
		
		/*  [학점 구하기]
		 * 
		 *     평균이 90점 이상이면 A학점
		 *     평균이 80이상 90미만이면 B학점
		 *     평균이 70이상 80미만이면 C학점
		 * 
		 *     if( avg >= 90)  {                                   // 만약에 avg 값이 90 이상이라면
			System.out.println("A학점");        // 그렇다면 'A' 학점 출력

		} if ( avg >= 80) {                       //  만약에 avg 값이 80 이상이라면			
			System.out.println("B학점");       // 그렇다면 'B' 학점 출력

		}if(avg >=70) {                           //  만약에 avg 값이 70 이상이라면
			System.out.println("C학점");       // 그렇다면 'C'학점 출력
		 *  
		 *   -----------------> 위와 같은 경우는 "else"가 빠졌기 때문에 84점이더라도 B학점과 C학점이 동시에 출력
		 *                            잘못된 경우이다.     
		 *     -----------------------------------------------------------------     
		 *   
		 *     if( avg >=70)  {                                   
			System.out.println("A학점");        

		} else if ( avg >= 80) {                      			
			System.out.println("B학점");       

		}else if(avg >=90) {                          
			System.out.println("C학점");           
		 *     
		 *     ---------------------------> 작은 점수부터 비교하게 되면 84점이더라도 C학점으로 나오게 된다. 즉, 큰 수부터 비교해야한다
		 */
		
		if( avg >= 90)  {                                   // 만약에 avg 값이 90 이상이라면
			System.out.println("A학점");        // 그렇다면 'A' 학점 출력

		} else if ( avg >= 80) {                       // 그렇지 않다면 만약에 avg 값이 80 이상이라면			
			System.out.println("B학점");       // 그렇다면 'B' 학점 출력

		}else if(avg >=70) {                           //  그렇지 않다면 만약에 avg 값이 70 이상이라면
			System.out.println("C학점");       // 그렇다면 'C'학점 출력
		}
		
		
	}

}
