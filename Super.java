package Class;

class Person{

	 private String name;

	 

	 Person(String name){

	  this.name=name;

	 }

	 void name() {

	  System.out.println(name);

	 }

	}

	class Student1 extends Person{

	 private String major;

	 private String school;

	 

	 Student1(String name,String major,String school){

	  super(name);//부모생성자 호출 this.name=name;

	  this.major=major;

	  this.school=school;

	  

	 }

	 void show() {

	  System.out.println(major);

	  System.out.println(school);

	  name();

	 }

	}

public class Super {

	public static void main(String[] args) {
		
		  Person p=new Person("태수");

		  Student1 s=new Student1("태수","컴퓨터","컴공");

		  s.name();

		  s.show();

	}

}
