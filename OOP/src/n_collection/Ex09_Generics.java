package n_collection;

public class Ex09_Generics {

	public static void main(String[] args) {
		
	     MyType<String, String> name = 	new MyType("이름","김자바");
	     MyType<String, Integer> age = new MyType("나이", new Integer(44));
	     MyType<String, Double> height = new MyType("키", new Double(130.99));
		
	     System.out.println(name.getName() + "/" + name.getValue());
	     System.out.println(age.getName() + "/" + age.getValue());
	}
	
}
 // 9행 기준으로 K자리가 String, V자리가 Double   
class MyType<K,V>{
    K name;   // K를 자료형처럼 취급
	V value;  // V를 자료형처럼 취급
	MyType(K name, V value){
		this.name = name;
		this.value = value;
	}
	
	K getName(){
		return name;
	}
	
	V getValue(){
		return value;
	}
}