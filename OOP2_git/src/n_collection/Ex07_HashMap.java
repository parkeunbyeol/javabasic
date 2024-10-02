package n_collection;

import java.util.*;

public class Ex07_HashMap {

	public static void main (String[]args) {
 		    
		   Scanner input = new Scanner(System.in);
		
            HashMap<String, String> map = new HashMap<String, String>();
            //         아이디    비밀번호
            map.put("javassem", "1111");
            map.put("javababo", "9999");
            map.put("kimjava","9999");
            map.put("javassem", "1234");  // 13행과 16행의 아이디가 같음(키 중복) => 결과를 출력하면 13행의 비밀번호가 16행의 비밀번호인 1234으로 덮어버림 => 키 중복 안됨           
           
            while(true) {  
               System.out.println("아이디->");
               String id = input.nextLine();
               System.out.println("비밀번호 ->");
               String password = input.nextLine();
           
               if(map.containsKey(id)) {// map에서 Key값을 가지고 있는 id
        	      if(  (map.get(id)).equals(password)   ) {    // map.get(id) = String , password = String인 참조형이므로 
        		     System.out.println("로그인 성공");          // "=="가 아닌 .equals로 해야함
        		     break;
        	      }else {
        		     System.out.println("비밀번호가 일치하지 않습니다.");
        		     continue;
        	    }
                  }else {
        	         System.out.println("존재하지 않는 아이디 입니다.");
        	         continue;
                   }
               
             }  // 구현부분
	}
}
