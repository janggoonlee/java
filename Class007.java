package Class;

class Car{
	String color; //  인스턴스 변수 독립적.
	int speed; 	  //  인스턴스 변수 독립적.
	static int count;  /// 클래스 변수 공유.
	
	Car(){
		count++; // 공유가 되면서 증가시킴. 
	}
}

public class Class007 {

	public static void main(String[] args) {


				Car c1=new Car(); 
				System.out.println(c1.count); //count1
				Car c2=new Car();
				System.out.println(c2.count); // count2
				Car c3=new Car();
				System.out.println(Car.count); // count3
				// 클래스 네임을 사용하면 카운트 공유가능. 
		
	}

}
