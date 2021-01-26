package Class;

class Movie{
	String tittle; //메인에 시스아웃 타이틀 이름 동일하게 .
	int price;
	
	Movie(String tittle){
		this.tittle=tittle;
	}
	Movie(String tittle,int price){
		this.tittle=tittle;
		this.price=price;
	}
	

}

public class Class006 {

	public static void main(String[] args) {
		
		
			Movie m1 = new Movie("해리포터");
			Movie m2 = new Movie("기생충,20000");
			
			System.out.println(m1.tittle);
			System.out.println(m2.tittle+" "+m2.price);
	}

}
