package Class;
class Car1{
	public int gas;/// 필드
	public void up() {
		gas+=1;
	}
	public final void stop() {
		System.out.println("stop");
		gas=0;
	}
	}
class sportsCar extends Car1 {
	public void up(){
	gas+=100;
	}
	}	
public class FinalClass {

	public static void main(String[] args) {
		
		Car1 c = new Car1();
		c.gas=0;
		c.stop();
		c.up();
		
		sportsCar s = new sportsCar();
		s.stop();

	}

}
