interface Figure{
	void circle_area();
	void rec_area();
}

class fuck implements Figure{
	int a;
	
	fuck (int a){
		this.a=a;
	}
	
	public void circle_area() {
		
		System.out.println(a*a*3.14);
	}

	public void rec_area() {
		
	}



}
class Rec implements Figure{
	int a, b;
	
	Rec(int a, int b){
		this.a=a;
		this.b=b;
	}

	
	public void rec_area() {
	
		System.out.println(a*b);
	}

	public void circle_area() {
		
	}

}

public class Interface2_0126 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Figure 인터페이스 만들어 circle_Area()에는 원면적
		// rec_area() 에는 사각형 면적 출력
		
			Figure f1 = new fuck(5);//3.14*5*5
			Figure f2 = new Rec(2, 5); // 2*5
			f1.circle_area();
			f2.rec_area();
	}

}
