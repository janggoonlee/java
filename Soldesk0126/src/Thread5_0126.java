class Th implements Runnable{
	String str;
	
	Th(String str){
		this.str=str;
	}
	
	public void run() {
		System.out.println(str);
	}
}


public class Thread5_0126 {

	public static void main(String[] args) {
		
		
		Th t = new Th("스레드 1"); 
		Thread th = new Thread(t);// 이 객체가 있으면 Runnable. 
		th.start();// 스레드 1 출력

	}

}
