package Class;

class Book1{
	Book1(){
		System.out.println("Book 클래스 생성자 ~~ (피라미터 없음)");
}
}
class ComputerBook extends Book1{
	ComputerBook(String a){
		
		System.out.println("ComputerBook 클래스 생성자 ~~");
	}
}

public class Class010 {

	public static void main(String[] args) {
		
		ComputerBook sedan1 = new ComputerBook("굿자바");

	}

}
