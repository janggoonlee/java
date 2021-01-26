	class Timer extends Thread{
		public void run() {
			
			
			try {
				for(int i=0;i<10;i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}	
			}catch(Exception e) {}
			
		}
	}
public class Thred6_0126 {

	public static void main(String[] args) {
		
		Timer t = new Timer();
		t.start();

	}

}
