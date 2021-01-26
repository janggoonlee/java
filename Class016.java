package Class2;

class Person{
	String name;
	String id;
	
	Person(String name){
	this.name=name;
}
}
class Student extends Person{ // 생성자 
	Student(String name){
	super(name);
}
}

public class Class016 {
	

	public static void main(String[] args) {
		
		Person p = new Student("장군"); // 앞 뒤가 다른 객체 . 하지만 적어줄수있다. 
		//오른쪽의 하위를 상위로 가져온다 .  자식클래스를 부모클래스로 형변환(upcasting):업캐스팅.
		
		Student s = (Student)p; // downcasting 앞에 클래스명 적어야 한다.  
		
		//Student s = new Student("장군"); // 객체생성 
		System.out.println(s.name);

}
}
