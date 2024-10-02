package c_control;

public class Ex02_if_학번 {

	public static void main(String[] args){
		
/*		String hakburn = "2018133001";   //문자열로 처리
		char year=hakburn.charAt(3);   // 입학년도 구하기
		char major = hakburn.charAt(4);
		String	hakgwa = hakburn.substring(5,7);
		
		
		
		if(major == '2' && hakgwa.equals("11")) {
			System.out.println(hakburn+"는 201"+ year +"년도에 입학한 사회대"+ " 사회학과 학생입니다.");
		}else if(major == '1' && hakgwa.equals("11")) {
			System.out.println(hakburn+"는 201"+ year +"년도에 입학한 공대"+ " 컴퓨터학과 학생입니다.");
		}else if(major == '1' && hakgwa.equals("33")){
		   System.out.println(hakburn+"는 201" + year + "년도에 입학한 공대" + " 컴퓨터학과 학생입니다.");
		}
	
*/		 
		 

          String hakbun = "2018133001";   // "hakbun"이라는 변수 지정
          //입학년도 구하기
          String year = hakbun .substring(0, 4);
          String major = hakbun.substring(5, 7);
          
          //단과 구하기
           char dan = hakbun.charAt(4);
          String college = "";
          System.out.println(hakbun + "는" + college);
           
          if(dan == '1')          
            { college  = "공대";
            
            if(major.equals("11")) {
            System.out.println( college + " 컴퓨터학과 학생입니다.");
                }else if(major.equals("12")) {
            	System.out.println(college + " 소프트웨어학과 학생입니다.");
                } else if(major.equals("13")) {
            	System.out.println(college + " 자바학과 학생입니다.");
                } else if(major.equals("33")) {
            	System.out.println(college+" 서버학과 학생입니다.");
                }
                   
            
            } else if (dan == '2')
                { college = "사회대";
               if(major.equals("11")) {
            	   System.out.println( college + " 사회학과 학생입니다.");
                    } else if(major.equals("12")) {
            	   System.out.println( college + " 경영학과 학생입니다.");
                    } else if(major.equals("13")) {
            	   System.out.println( college + "경제학과 학생입니다.");
                    }
              }
            
     
	}       	
}
	

