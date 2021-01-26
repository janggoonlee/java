class Th implements Runnable{
String str;

 Th(String str){
  this.str=str;
 }

 public void run() {  //쓰레드의 메인메소드

  for(int i=0;i<10;i++) {
   System.out.println(str);

   try {
   Thread.sleep(100);
  }catch(Exception e) {}

  }
  
}
}
public class Thread0125 {

	public static void main(String[] args) {
		  //스레드의 우선순위를 정할 수 있다.

		  Th t=new Th("쓰레드");

		  Thread t1=new Thread(t);

		  t1.start();
	}

}
