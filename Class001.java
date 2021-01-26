package Class;

//1. 클래스명을 확인한다.
//2. 생성자 호출부분을 보고 필드값을 적는다.
//3. 파라미터가 있는 생성자일 경우 생성자를 반드시 만들어야 한다.

class Profile{
	String a,b; 
	// 매개변수를 필드에 넣는다 !
	Profile(String a,String b){ // 생산자 작업
		this.a=a;
		this.b=b;
	}
	

}

public class Class001 {

	public static void main(String[] args) {


			Profile p1 = new Profile("010- 1234 -5678","장군");
			Profile p2 = new Profile("010- 4321 -5678","승훈");
			
			System.out.println(p1.a +" "+p1.b);
			System.out.println(p2.a +" "+p2.b);
	}

}
