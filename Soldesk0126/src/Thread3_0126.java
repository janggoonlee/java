class Cook{
	String food;
	boolean send = false;
	
	void set (String f) {
		food = f;
		send = true;
	
	synchronized(this) { // this 는 위에 set.
		notifyAll();//잠자고 있는 스레드 다 깨운다 : 함수가 다 셋에 있으므로 
	}
	}
	String get() {
		if(send == false) {
			try {
				synchronized(this) {
					wait(); // 손님이 기다림.
				}
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		///else 생략 가능
		return food;
	}
	
}

class Chef extends Thread{
	
	Cook c;
	Chef(Cook c){
		this.c=c;
	}
	
	public void run() {
		c.set("음식");
	}
}

class Customer extends Thread{
	
	Cook c;
	Customer(Cook c){
		this.c=c;
	}
	
	public void run() {
		System.out.println(c.get());
	}
}

public class Thread3_0126 {

	public static void main(String[] args) {
		
		Cook c = new Cook();
		
		Customer c1 = new Customer(c);
		Customer c2 = new Customer(c);
		
		Chef c3 = new Chef(c);
		
		try {
			c1.start();
			c2.start();
			Thread.sleep(1000);
			c3.start();
			
			c1.join();
			c2.join();
			c3.join();

		}catch(Exception e) {}

	}

}
