class Th03 extends Thread{
	String str;

	Th03(String str){
	this.str=str;
	}

 public void run() {  //쓰레드의 메인메소드

	 for(int i=0;i<10;i++) {
	 System.out.println(str);

	 try {
	 sleep(100);
	 }catch(Exception e) {}

  }

}
}
public class Thread2_0125 {

	public static void main(String[] args) {
		

		  Th03 t=new Th03("쓰레드");

		  t.start();
	}

}
