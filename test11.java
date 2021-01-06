import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		
		1.	10/4 한 결과값을 소수점까지 출력해라
		.
		2.	하나의 정수를 입력받아 그 수의 제곱을 구해라.

		3.	a를 4.0, b를 1.2로 초기화하여 4.0+1.2를 printf로 출력해라.
		실행 결과) 4.0+1.2=5.2
		3-1. 앞에서 출력한 5.2를 소수점을 버려라. 

		4.	Scanner클래스를 이용하여 이름, 사는 곳, 나이, 체중을 입력받고, 출력하는 프로그램 작성해라.
		실행 결과) 입력해라: kim seoul 29 65.5
		                    내 이름은 kim이다.
		                    사는 곳은 seoul이고, 나이는 29살이다.
		                    몸무게는 65.5kg이다.

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		1. float a = 10/4;
		   System.out.println(a);


		2.Scanner s = new Scanner(System.in); 
 	   System.out.println("정수를 입력하세요!");
		  int n = s.nextInt();			
		  int a = n*n;
		  System.out.println(a);


		3.double a = 4.0, b = 1.2 ;
		  System.out.println(a+b);


		4.double a = 4.0, b = 1.2 ;
		  System.out.println(a+b);
		  System.out.println((int)(a+b));

		5.Scanner s = new Scanner(System.in);
				
		  System.out.println("이름");
		  String name = s.next();
				
		  System.out.println("지역");
		  String area = s.next();
				
		  System.out.println("나이");
		  int age = s.nextInt();
				
		  System.out.println("무게");
		  float weight = s.nextFloat();
				
		  System.out.printf("내 이름은 "+name+"이다.\n" + "지역은"+area+"이고,\n" + "나이는" +age+ "이다.\n" + "몸무게는" +weight+ "이다.");
	
	}
}
