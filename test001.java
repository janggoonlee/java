package JavaBeginnerStart;

import java.util.Scanner;

public class test001 {


	public static void main(String[] args) {
		// 문제 풀어보기

		
/*		
 		//	1. 정수 10개를 입력받아 배열에 저장한 후, 배열을 검색하여 4의 배수만 골라 출력하는 프로그램
 		  
 		  Scanner s = new Scanner(System.in);
		int [] aa = new int[10];
		
		for(int i = 0 ; i<10; i++) {
			
			aa[i] = s.nextInt();
			
			if(aa[i]%4==0) {
				System.out.println(aa[i]);
			}
		}
*/
		
/*		
		//2. 정수 a=50, b=150으로 초기화해서 a가 b보다 크면 a와 b의 곱, 아니면 a를 b로 나눴을 때의 나머지 출력(삼항 조건 연산자 활용)
			int a = 50; int b = 150; int g;
			
			g = a>b?a*b:a%b; // a가b보다크면a*b ?아니면 : a b 나머지 a%b
			System.out.println(g);
*/	

/*
//	3. 100이하의 자연수 중에서 2의 배수이고 7의 배수인 숫자를 출력하고, 출력된 숫자의 합을 출력(while문 이용)
	int i = 1, sum = 0;
	
			
	while(i<=100) {
		
		if(i%2==0&&i%7==0) {
		sum+=i;
		}
		i++;
	}
	System.out.println(sum);
*/
/*	
//	4. 정수를 입력받아 짝수이면 “짝수”, 홀수이면 “홀수” 라고 출력해라.
//	정수를 입력하지 않은 경우에는 프로그램을 종료시켜라.(try-catch 사용)
 
	Scanner s = new Scanner(System.in);
	int a;
	
	try {
		System.out.println("입력: ");
		a=s.nextInt();
		if(a%2==0) {
		System.out.println("짝수");
		}
		else
		System.out.println("홀수");

		}catch(Exception e) {
		System.out.println("프로그램종료");
		}
*/	

	/*	5. 무한루프안에 두 정수를 입력받아 합을 구하고, 실수를 입력하면 “실수는 안된다”라고 출력하고, 다시 두 정수를 입력받는 코드를 작성해라.

		실행 결과) 두 정수 입력: 3 3.5

		           실수는 안된다

		           두 정수 입력: 3 5

		           답: 8 	 
		
	Scanner s = new Scanner(System.in);
	
	int sum=0;
	
	while(true) {
		try {
			System.out.println("1");
			int a = s.nextInt();
			System.out.println("2");
			int b = s.nextInt();
			System.out.println(a+b);
			break;
			
		}catch(Exception e) {
			System.out.println("실수x");
			//s.nextLine();
			continue;
			
		}
	}
*/
		
/*
// 6. func함수 작성하기.(키보드로 입력한 양수를 5로 나누어 몫과 나머지를 변수에 저장하기)
		static void func(int n) {
			
			System.out.println("몫: "+n/5+"나머지:"+n%5);
		}
		
			int a;

			Scanner s = new Scanner(System.in);

			a=s.nextInt();

			func(a); } //c->몫, d-> 나머지
*/		
	
		
/*		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("첫번째 숫자 입력");
				int n1 = s.nextInt();
				System.out.println("두번째 숫자 입력");
				int n2 = s.nextInt();	
				System.out.println("정답: "+ (n1+n2));
				break;
			}catch(Exception e) {
				System.out.println("실수는 안됩니다!");
				s.nextLine();
				continue;
			}
		}
*/		

		
/*		
 //7. 다섯 과목 점수가 저장된 배열의 값에 따라 #출력 (#은 5점당 하나씩 출력하며 남는 점수는 버리기. pr함수를 작성
		static void pr (int a[], int b) {
			for(int i = 0; i<b; i++) {
				int n = a[i]/5;
				for(int j = 0; j<n; j++) {
					System.out.print("#");
				}
				System.out.println();
			}
	}

		int score[]=new int[] {58, 60, 86, 90, 84};

		pr(score, 5);
*/		
		
//		8. 다음 main함수를 보고 반환형을 String값으로 주고 출력해라.
/*
		static	String show(char a, int b) {
			String str="";
			for(int i = 0; i<b; i++) {
				str+=a;
			}
			return str;
		}
		
			  System.out.println(show('$' , 10));
*/
/*		
 		///concat 사용 법 = "" String 스타일 변환
		static	String show(String a, int b) {
			String str="";
			for(int i = 0; i<b; i++) {
				str=str.concat(a);
			}
			return str;
		}
		
		System.out.println(show("$" , 10));
*/		
		
//	9. “공부는 어렵지만, 재밌네요”라는 문자열을 str에 저장한 후,
//      ","를 기준으로 문자열을 구분해보고, 인덱스 6에 있는 한 글자를 출력, “공부는” 출력	
/*		
			String str = "공부는 어렵지만, 재밌네요";
			String[] str2;
			str2 = str.split(",");
			for (int i = 0; i < str2.length; i++) {
			System.out.println(str2[i]);
			}
			System.out.println(str.charAt(6));
			System.out.println(str.substring(0, 3));
*/			
		
	}
}
