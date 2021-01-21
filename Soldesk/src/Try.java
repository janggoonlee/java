import java.util.Scanner;

class Num extends Exception{ // api Exception 상속 받는다. 일종에 api에 내제 된 class 여서 ?
	Num(){ 
		super("잘못된값!!!!! "); // 
		///부모 생성자 호출 (Exception)
	}
	}

public class Try {
		//입력값을 적는 공간 만들기, 그리고 오류가 나면 이곳에서 처리 하지 않고 클래스로 넘긴다, throws 
	static int in() throws Num{ // 아래 throws Num 위에 함수 선언 창에 동일하게 적는다, 
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		if(n<0) {
			Num num = new Num(); // 객체생성 , 생성자 호출
			throw num; //
		}
		return n;
		}	
		
	
	public static void main(String[] args) {
		

		
		System.out.println("양수입력");
		
		try { //에러가 날 수 있기에   
			int n = in(); // 정수입력하는 함수  /// 위에 static int in() 생성. 
			System.out.println(n);
			
			}catch(Exception e) {
			System.out.println(e.getMessage());
			}

		
		
}
}
