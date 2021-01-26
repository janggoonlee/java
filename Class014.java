package Class2;


class Circle{
		int r;
		
		Circle(int r){
			this.r=r;
		}
		
		double getarea() {
			return r*r*3.14;
		}
		}

public class Class014 {

	public static void main(String[] args) {
		
		Circle[] aa = new Circle[4]; // 객체배열 선언
		
		//Circle c1 = new Circle();
		//Circle c2 = new Circle();
		//Circle c3 = new Circle();
		//Circle c4 = new Circle();
		// 			||
		
		for(int i = 0; i<aa.length; i++) {
			aa[i] = new Circle(i); // 객체  4개를 생성해서 배열 위치에 저장.
			System.out.println(aa[i].getarea());
		}
		//객체 배열: 여러개의 객체를 배열형태로 묶어줌.
		//0.0  r*r*3.14; =	r0 0*0*3.14
		//3.14 r*r*3.14; =	r1 1*1*3.14
		//12.56 r*r*3.14; =	r2 2*2*3.14
		//28.26 r*r*3.14; =	r3 3*3*3.14
		
}
}
