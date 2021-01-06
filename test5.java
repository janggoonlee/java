import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		
		Scanner sw = new Scanner(System.in);
		
		System.out.println("두 정수를 입력하세요.");
		
		int a = sw.nextInt();
		int b = sw.nextInt();
		
	   System.out.println(a+"+"+b+"은"+(a+b));
	   System.out.printf("%f", (a+b)/2.0);
		
		
	}

}
