package n_collection;

public class Ex00_Objects {

	public static void main(String[] args) {
		
		StudentA a = new StudentA("1234", "홍길동");
		StudentA b = new StudentA("1234", "홍길동");
		
		System.out.println(a.toString());  // "println" = overloading
		System.out.println(b.toString());
	
	    if(a.equals(b)) {                      // a.equals() = Object안에 들어있는 함수이기 때문에 에러가 안난다.
	    	System.out.println("동일인");	    	
	    }else {
	    	System.out.println("다른사람");       // a, b는 저장된 주소가 다르기 때문에 출력을 안해도 다른 사람이다.
	    }
	
	
	}
}

class StudentA extends Object {    // "Object"는 toString을 포함하고 있다.
	String hakbun;
	String name;
	
	
	StudentA(String hakbun, String name){      
	
		this.hakbun = hakbun;
		this.name = name;
	}
	
	public boolean equals(Object obj) {
		StudentA other = (StudentA)obj;
		
		if(hakbun.equals(other.hakbun)){
			return true;
		}else {
			return false;
		}
	}
	
	public String toString() {               // "Object"는 toString을 포함하고 있다. 그래서 "overriding"하여 함수 사용
		return "학번:" + hakbun + "[이름]" + name;
	}
}