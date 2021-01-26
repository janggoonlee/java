package Class2;

class Elec{
	String color;
	
	Elec(String c){
		color =c;
	}
	}


class Note extends Elec{
	int number;
	
	Note(String c, int n){ // 상위에서 String c 물려받음 
		super(c);
		number=n;
	}
}

class Ipad extends Note{ // 단일 상속만 가능
	int size;
	Ipad(String c, int n, int s){
		super(c,n);
		size=s;
	}
	void show() {
		System.out.println(color + " " + number + " "+ size);
	}
}

public class class018 {

	public static void main(String[] args) {
		
		Note ip = new Ipad("IpadMINI", 120, 150);
		System.out.println(ip.color);
		System.out.println(ip.number);

	}

}
