package n_collection;

import java.util.ArrayList;
import java.util.Iterator;


public class Ex03_ArrayLIst {

	public static void main(String[] args) {
		
		ArrayList <Student> result = method();
		
		for(Student s: result) {   
			System.out.println(s);
		}
		System.out.println("[참고]----------------------------------");
		// 전체요소를 순서대로 검색할 때 : Enumeration -> Iterator (업그레이드 됨)
		Iterator<Student> i = result.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
			
	}

	static ArrayList <Student> method() {   // 여기서의 자료형 = ArrayList <Student>
		
		ArrayList<Student> list = new ArrayList<Student>();  // <들어가는 자료형> 집어넣기 = 제네럭스
		list.add(new Student("홍길자", 23));
		list.add(new Student("홍길숙", 23));
		list.add(new Student("홍길동", 23));
		
		return list;
	}

}


class Student{
	String name;
	int age;
	Student(String name, int age){
		this.name = name;
		this.age = age;
		
	}
	
	public String toString() {
		return name+"님 학생은" + age + "살입니다";
	}
}