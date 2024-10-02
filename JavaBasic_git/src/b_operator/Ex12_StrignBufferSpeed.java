package b_operator;

public class Ex12_StrignBufferSpeed {

	public static void main(String[] args) {
		
		
				long startTime = 0L;
				long elapsedTime = 0L;

				//1. String으로 문자열 만들기의 속도 측정
				String str1 = ""; 
				startTime = System.currentTimeMillis(); 
				for(int i=0; i<50000; i++){
					str1 += "H"; 
				}
				elapsedTime = System.currentTimeMillis() - startTime;
				System.out.println("String 문자열만들기:" + elapsedTime);

				//2. StringBuffer로 문자열 만들기의 속도 측정
				StringBuffer sb = new StringBuffer(); 
				startTime = System.currentTimeMillis(); 
				for(int i=0; i<50000; i++){
					sb.append("H"); 
				}
				elapsedTime = System.currentTimeMillis() - startTime; 
				System.out.println("StringBuffer 문자열만들기:" + elapsedTime);
			 
				
				 // StringBuffer = 문자열의 변화가 많을 때 사용
				// String = 새로운 주소 만들어서 공간 확보 후 사용  StringBuffer가 속도 빠름
		
		
	}
	
}
