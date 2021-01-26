class Music extends Thread{
	String a;
	Music(String a){this.a=a;}
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(a);
		}
	}
}
class Movie implements Runnable{
	String a;
	Movie(String a){this.a=a;}
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(a);
		}
	}
}
public class Thread0126 {

	public static void main(String[] args) {
	
		//프로세스 : 할당된 메모리를 이용하여 사용하는 일종의 프로그램 ? ex) 구글, 이클립스 등등.. 
		//Thread : 여러 프로세스를 동시 작업. 
		
		Music m=new Music("음악 재생");
		m.start(); //10번
		
		Movie m1=new Movie("영화 재생");
		Thread t=new Thread(m1);
		t.start();
		
		
		/// 동기화 synchronized, wait-notify, join 
		
		try{
			m.join();
			t.join();
			///throw 로 처리 가능. 
		}catch(Exception e) {}
		

	}

}
