import java.util.Scanner;

public class test10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
	    System.out.println("이름: ");
		String name = s.next();
		
		System.out.println("사는 곳: ");
		String place = s.next();
		
		System.out.println("나이: ");	
		int age = s.nextInt();
		
		System.out.println("키: ");
		double tall = s.nextDouble();
		
		System.out.println("공부했는지 여부?: ");
		boolean check = s.nextBoolean();
		
		System.out.println(name +" "+ place +" "+ age +" "+ tall +" "+ check);
	
	}
	
	
	
	
	}
