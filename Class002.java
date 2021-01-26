package Class;

class Rec{
	
	int a,b; // 필드 
	
	Rec(int a, int b){
		this.a=a;
		this.b=b;
	}
	void area() { // 메소드
		System.out.printf("%d*%d = %d\n",a,b,a*b);
	}
	
}


public class Class002 {

	public static void main(String[] args) {
		
		
		Rec r1 = new Rec(4,7);
		Rec r2 = new Rec(7,9);
		
		//r1.area();// 4*7=28
		//r2.area();// 7*9==63
		
		System.out.println(r1.a*r1.b);
		System.out.println(r2.a*r2.b);
	}

}
