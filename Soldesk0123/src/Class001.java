class Car{

 public int gas; //필드

 public void up() {

  gas+=1;

 }

 public final void stop() {

  System.out.println("stop");

  gas=0;

 }

}

class SportsCar extends Car{

 public void up() {  //재정의~~~ 오버라이딩 !

  gas+=100;

 }

}

public class Class001 {

	public static void main(String[] args) {

	    
		  Car c=new Car();

		  c.gas=0;

		  c.stop();

		  c.up();

		  

		  SportsCar s=new SportsCar();

		  s.stop();

		    
		
	}
}
