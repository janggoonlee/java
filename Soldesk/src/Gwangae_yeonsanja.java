
public class Gwangae_yeonsanja {

	public static void main(String[] args) {
		///관계 연산자 if,for,while 에 사용 true / false 로만 적용
		// == 같다, !=같지않다, >< 크다/작다, >=/<= 크거나 같다 / 작거나 같다.
		
		
		int a = 100, b = 200;
		
		System.out.println("a == b = "+(a == b)+" 이다.");//false
		System.out.println("a != b = "+(a != b)+" 이다.");//true
		System.out.println("a > b = "+(a > b)+" 이다.");//false
		System.out.println("a < b = "+(a < b)+" 이다.");//true
		System.out.println("a >= b = "+(a >= b)+" 이다.");//false
		System.out.println("a <= b = "+(a <= b)+" 이다.");//true
		System.out.println("a = b = "+(a = b)+" 이다.");  //200 ==,= 사용주의!

	}

}
