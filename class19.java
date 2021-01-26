package Class2;

abstract class Car{
	
	String name; // 필드 
	
	void run() { // 일반적인 메소드
		System.out.println("차가 움직인다.");
	}
	
	abstract void stop();// 추상 메소드 (빈껍데기 함수)
		
	}

class Cars extends Car{
	String name;
	
	Cars(){
		name="닷지";
	}
	void stop() {
		System.out.println(" 차가 멈춘다.");
	}
	}
//// 추상 클래스 안에는 일반적인 메소드, 추상 메소드 둘다 가능.
///  추상 메소드는 반드시 추상 클래스 안에 있어야한다.
public class class19 {

	public static void main(String[] args) {
		
		Cars c = new Cars();
		c.run();
		c.stop();
	}
}
