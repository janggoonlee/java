import java.util.Scanner;

public class test7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
		System.out.println("이름: ");
		String name = s.next();
		
		System.out.println("나이  ");
		int age = s.nextInt();
		
		System.out.println("키  ");
		double tall = s.nextDouble();
	
	System.out.printf("이름 :%s 나이 :%d 키 : %1f\n, name,age,tall");
	
	}
	

}
