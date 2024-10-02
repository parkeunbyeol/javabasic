package f_exception;

import java.io.IOException;

public class Ex000_카페 {
/* 2번문제  - 1번
		static void method()  {

		  throw new Exception();          // "method()"뒤에 "throws Exception"를 붙여야한다.

		}

		public static void main( String [] args ) {   

		     try{

		         method();

		} catch( Exception ex ) {

		         System.out.println ("예외처리");

		     } 

		}

		
}
*/
	
	/*3번-4번
	 * return;이 있어도 finally는 무조건 실행되므로
	 */
	/*4번 - System.exit(0); = 아예 프로그램 종료시켜버림.
	 * 5번 - catch3 try/2
	 
	static void method( int i ) throws Exception {

		   if ( i % 2 == 0 ) throw new Exception();

		}

		public static void main( String [] args ) {

		   for( int i=0; i <= 4 ; i++ ) {

		     try{

		         method( i );

		         System.out.println("try");

		     }catch( Exception ex ) {

		         System.out.println("catch");

		     }

		   }

		}
*/
	/* 6번 - IOEXCEPTION / FINALLY / END	
	 * 
	 
	
	static void method() throws IOException {

		  throw new IOException();

		}

		public static void main( String [] args ) {   

		     try{

		         method();

		         System.out.println("TRY");

		     } catch( IOException ex ) {

		         System.out.println("IOEXCEPTION");

		     } catch( Exception ex ) {

		         System.out.println("EXCEPTION");

		     } finally {

		System.out.println("FINALLY");

		     }

		 System.out.println("END");

		}
		*/
	// 7번 - 1번
	/*static void method() throws IOException {

		  throw new IOException();

		}

		public static void main( String [] args ) {   

		     try{

		         method();

		         System.out.println("TRY");

		     } catch( Exception ex ) {

		         System.out.println("EXCEPTION");

		     } catch( IOException ex ) {                         // 114행에서 이미 에러를 다 잡았기 때문에 상대적으로 
		    	                                                 //좁은 범위의 118행은 실행이 안된다. 114( Exception ex )과 118행( IOException ex )을 바꿔야 함

		         System.out.println("IOEXCEPTION");

		     } finally {

		System.out.println("FINALLY");

		     }

		 System.out.println("END");

		}
	
		*/
/* 8번 - ACDBC
 * 
 */
	static String str = "";

	static void method( int i ){

	     try{

	if ( i == 10 ) throw new Exception();

	str += "A";

	     } catch( Exception ex ) {

	 str += "B";

	 return;

	     } finally {

	str += "C";

	     }

	str += "D";

	}

	public static void main( String [] args ) {   

	    method( 5 );

	    method( 10);

	System.out.println(str);

	}
}

