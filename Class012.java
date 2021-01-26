package Class;
class Ccar{
	String color;
	int speed;
	
	void upSpeed(int value) {
		speed = speed +value;
	}
	void downSpeed(int value) {
		speed = speed - value;
	}	
	}
	
	class Sedan extends Ccar{
		int seatNum;
		
		int getSeatNum(){
			return seatNum;
		}
		}
	
	class Truck extends Ccar{
		int capacity;
		
		int getCapacity() {
		return capacity;	
		}
		}

public class Class012 {

	public static void main(String[] args) {
		
		Sedan sedan1 = new Sedan();
		Truck truck1 = new Truck();
		
		sedan1.upSpeed(300);
		truck1.upSpeed(100);
		
		sedan1.seatNum = 5;
		truck1.capacity = 50;
		
		System.out.println("승용차 속도는 " + sedan1.speed + "km, 좌석수는 " + sedan1.getSeatNum() +"개 입니다");
		System.out.println("트럭 속도는 " + truck1.speed + "km, 적재량은 " + truck1.getCapacity() + "톤 입니다");
	}

}