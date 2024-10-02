package excercise;

public class Student extends Human{

	String number;
	String major;
	
	public Student() {
		this("홍길동", 20, 171, 81, "201101", "영문");
		
	}
	
	public Student (String name, int age, int height, int weight, String number, String major) {
		super.name = name;
		super.age = age;
		super.height = height;
		super.weight = weight;
		this.number = number;
		this.major = major;
	}
	
	public String printInformation() {
	    return ();
	}
}
// 카페 문제 답 2번-5, 3 -4, 4-1, 5 부모가 갖고 있는 메소드를 자식이 똑같이가져와서 쓰는 것 2, 6-3 오버로딩 인자만 다른것 7-3 
