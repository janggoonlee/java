import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		
		
/*		
		System.out.printf("%.2f", (double)5/3);
*/	
		
/*		
	Scanner s  = new Scanner (System.in);
	
	
		System.out.print("키를 입력하세요: ");
		double ki = s.nextDouble();
		
		if(ki<160) {
			System.out.println("Small");
		}
		else if(ki<170) {
			System.out.println("Medium");
		}
		else if(ki<180) {
			System.out.println("Large");
		}
*/
	
/*		
		int n1 = 50, n2 =100, gob=0;
		gob = n1>n2?n1:n2;
		System.out.println(gob);
*/
		
/*		
		Scanner s  = new Scanner (System.in);
		System.out.print("나이입력: ");
		int age = s.nextInt();
		System.out.print("키 입력: ");
		int ki = s.nextInt();
		
		
		if(age<20) {	
			
		if(ki<160) { 
			System.out.println("s");
		}
		else if(ki>=160&&ki<170) { 
			System.out.println("m");
		}
		else if(ki>=170) {
			System.out.println("l");
		}
		}
		
		if(age>=20) {
		
		if(ki<165) {
			System.out.println("S");
		}
		else if(ki>=165&&ki<175) {
			System.out.println("M");
		}
		else if(ki>=175) {
			System.out.println("L");
		}
		}
*/
		
/*		
		for(int i = 1; i<=50; i++) {
			System.out.println(i);
		}
*/

/*
		for(int i = 1; i<=50; i++) {
			if(i%6==0) {
				System.out.println(i);
			}
*/		
		
/*		
		int sum = 0;
		for(int i = 1; i<=50; i++) {
			sum+=i;
		}
		System.out.println(sum);
*/		
		
/*		
		int r = (int)(Math.random()*50)+1;
		System.out.println(r);
*/	
		
/*		
		Scanner s = new Scanner(System.in);
		int a = 10, b = 20;
		
		System.out.print("연산자 입력 : ");
		char ch = s.next().charAt(0);
		
		switch(ch) {
		
		case '+':
			System.out.printf("%d + %d = %d \n",a,b,a+b);
			break;
		case '-':
			System.out.printf("%d - %d = %d \n",a,b,a-b);
			break;
		case '*':
			System.out.printf("%d * %d = %d \n",a,b,a*b);
			break;
		case '/':
			System.out.printf("%d / %d = %d \n",a,b,a/b);
			break;
		}
*/	
/*		
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫번째 과목 점수: ");
		int num1 = s.nextInt();
		System.out.print("두번째 과목 점수: ");
		int num2 = s.nextInt();
		
		System.out.println((double)(num1+num2)/2);
*/	

/*		
		Scanner s = new Scanner(System.in);
		
		int money =100000;
		
		System.out.print("시간: ");
		int time = s.nextInt();
		
		System.out.print("물건 갯수: ");
		int num = s.nextInt();
		
		
		if(time==14&&num<=3) {
			System.out.println(money*.95);
		}
		if(time==18&&num<=5) {
			System.out.println(money*0.90);
		}
		if(time==20&&num<=10) {
			System.out.println(money*0.80);
		}
*/
		
/*		
		Scanner s = new Scanner(System.in);
		int a ;
		int cnt=1;
		while(true) {
			System.out.println("숫자를 입력 하세요!");
			a = s.nextInt();
			if(a>18) {
			System.out.println("크네요..");
			continue;
		}
			if(a<18) {
			System.out.println("작네요..");
			continue;
			}
			if(a==18) {
				System.out.println("정답!");
				break;
				
				}
			cnt++;
		}
		System.out.println("시도한 횟수는 "+cnt+"입니다!.");
*/		
/*		
		int sum = 0; 
		for(int i = 1; i<=10; i++) {
			sum+=i;
		}
		System.out.println(sum);
*/
		
/*		
		int i = 1;
		int sum = 0;
		while(i<=10) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
*/
		
/*		
		int i = 1;
		int sum = 0;
		
		do {
			sum+=i;
			i++;
			
		}while(i<=10);
		System.out.println(sum);
*/
		
/*		
		Scanner s = new Scanner(System.in);
		int sum = 0;
		int avg = 0;
		while(true) {
			int i = s.nextInt();
			if(i==0) {
				break;
			}
			sum+=i;
			avg+=1;
		}
		System.out.println(sum/(double)avg);
*/

/*		
		int i=0, sum=0;
		while(true) { 
			i=i+2;
			sum+=i;
			if(i>=10) {
				break;
			}
		}
		System.out.println(sum);
*/
/*		
		double sum=0.0;

		 double ary[]={1.0, 1.5, 2.0, 2.5};

		 for(int i=0; i<4 ;i++) 

		    sum+=ary[i];

		 System.out.println(sum);
*/		


}	
}
