package Class;

class People{
	
	int age;
	String name;
	
	void show() {
		System.out.println(age+" "+name);
	}
	
	
}

class Student extends People{ // extens + 부모 클래스 이름.  // 자식 클래스
	
	String major;
	
	void pr() {
		show(); //
		System.out.println(major);
	}
}

public class class008 {

	public static void main(String[] args) {
		
		
		People pp = new People();		
		pp.age=30;
		pp.name="이장군";
		pp.show();
		
		Student s = new Student();
		s.age=19; // 상속 받아서  age, name 사용 가능
		s.name="마누엘";
		s.major="컴퓨터 공학";
		s.pr();
		
		

	}

}
