import java.util.Scanner;

public class test10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
	    System.out.println("�̸�: ");
		String name = s.next();
		
		System.out.println("��� ��: ");
		String place = s.next();
		
		System.out.println("����: ");	
		int age = s.nextInt();
		
		System.out.println("Ű: ");
		double tall = s.nextDouble();
		
		System.out.println("�����ߴ��� ����?: ");
		boolean check = s.nextBoolean();
		
		System.out.println(name +" "+ place +" "+ age +" "+ tall +" "+ check);
	
	}
	
	
	
	
	}
