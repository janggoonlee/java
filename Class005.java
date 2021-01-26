package Class;

class Book{
	String a;
	int b;
	
	void show() {
		System.out.println(a+" "+b);
	}
	
	Book(String a, int b){
		this.a=a;
		this.b=b;
	}
	Book(String a){
		this(a,0); /// 다른 생성자 호출(많이쓰임) // 위에있는 생성자 호출
	}
	Book(){
		this("",0); // 다른 생성자 호출
		System.out.println("생성자 호출 !"); // 제일 먼저 출력한다 이유는 : 기본생성자가 먼저 출력.
	}

}


public class Class005 {

	public static void main(String[] args) {
		
		Book b = new Book("하멜표류기",30000);/// 파라미터가 있는생산자
		Book b1 = new Book("총균쇠"); /// 파라미터가 있는생산자
		Book b2 = new Book(); // 기본생성자

		
		b.show();
		b1.show();
		b2.show();
	}

}
