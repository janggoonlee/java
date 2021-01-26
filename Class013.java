package Class;
class Circle{//1.
	private int n; //2.
	
	int get() { // 9
		return n; // 10
	}
	Circle(int n){//11
		this.n=n;//12
	}
	}
class NCircle extends Circle{//3
	private String color;//4
	
	NCircle(int r, String c){//5
		super(r); // this.r=r; //6
		color=c; //7
	}
	void show() { // 8
		System.out.println("반지름"+get()+color+"색");//13
	}
	}
public class Class013 {

	
	public static void main(String[] args) {
		
		NCircle n = new NCircle(10,"red");
		n.show(); // 반지름 10 red 
		

	}

	}
