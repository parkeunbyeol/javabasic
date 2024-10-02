package i_access2.sub;

/* 접근지정자
 * 
 *   - private :
 *   - public :
 *   - protected :
 *   - default( 아무것도 지정하지 않음 )  :
 *   
 */
public class Access {
       private    String a = "프라이빗 데이타";
       public     String b = "퍼플릭 데이타";
       protected  String c = "프로텍티드 데이타";
                  String d = "디폴드 데이타";
                  
        public void output() {
        	System.out.println("a");
        	System.out.println("b");
        	System.out.println("c");
        	System.out.println("d");
        	
        }
}
