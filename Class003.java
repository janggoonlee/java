package Class;

class Color{
	
	String a;
	String b = "black";
	
	Color(String a){
		this.a = a; // this를 붙여서 필드와 피라미터 구분 , 다른 생성자 호출
	}
	Color(String a, String b){
		this.a = a;
		this.b = b;
	}
	
	void show() {
		System.out.println(a+"는"+b);
	}
}



public class Class003 {

	public static void main(String[] args) {
		
		
		Color c1 = new Color("승태");
		Color c2 = new Color("정민","red");
		
		
		c1.show(); // 승태는 black
		c2.show(); // 정민은 red
	}

}
