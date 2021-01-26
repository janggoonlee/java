package JavaBeginnerStart;

import java.util.Scanner;

public class Java_0001 {

	public static void main(String[] args) {

		// p52 Java 프로그램 작성 
		// 변수: 무언가를 담는그릇, 바뀔수 있는수, 초기값 설정.
		// p.66 직접 풀어보기 
		
		
/*		int a = 1234, b =456;  // int :정수,  = :대입 , 1234 : 정수값 입력 (그릇에 내용물 담기.)
		int result ;
		

		result = a+b; // 1234 과 456을 더한 값을 result 에 담는다
		System.out.println(a+"+"+b+"="+result); //  왼쪽 부터 오른쪽 까지 결과물 출력 ! 100+50=150 

		result = a-b;
		System.out.println(a+"-"+b+"="+result);
		result = a*b;
		System.out.println(a+"*"+b+"="+result);
		result = a/b;
		System.out.println(a+"/"+b+"="+result);
	*/
		
//p.77 직접 풀어보기 
/*	
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫번째 값 입력 : ");
			int a = s.nextInt();
			
		System.out.print("두번째 값 입력 : ");
			int b = s.nextInt();
		
		System.out.print("세번째 값 입력 : ");
			int c = s.nextInt();
			
			int result1;
			int result2;
			
			result1 = a * b * c;
			System.out.println("값은:"+result1);
			result2 = a / b / c;
			System.out.println("값은:"+(double)result2);	
*/		
		
//p.77 예제 1 :입력받아 숫자 4개를 더하기
/*		
		Scanner s = new Scanner(System.in);
			
			System.out.print("첫번째 계산할 값을 입력하세요==> ");
			int a = s.nextInt();
			System.out.print("첫번째 계산할 값을 입력하세요==> ");
			int b = s.nextInt();		ß
			System.out.print("첫번째 계산할 값을 입력하세요==> ");
			int c = s.nextInt();
			System.out.print("첫번째 계산할 값을 입력하세요==> ");
			int d = s.nextInt();
			
			System.out.println(a+"+"+b+"+"+c+"+"+d+"="+(a+b+c+d));
*/		
		
//p.77 예제 2: if 문 활용 입력 계산기 
/*		
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 입력==> ");
			int a = s.nextInt();
		System.out.print("<1> +, <2> -, <3> *, <4> / ==> ");
			int b = s.nextInt();
		System.out.print("두번째 숫자 입력==>");
			int c = s.nextInt();		
			
			int result;
			if(b==1) {
				result = a+c;
				System.out.println(a+"+"+c+"="+(result));
				}
			else if(b==2) {
				result = a-c;
				System.out.println(a+"-"+c+"="+(result));
			}
				
			else if(b==3) {
				result = a*c;
				System.out.println(a+"*"+c+"="+(result));
			}
			else if(b==4) {
				result = a/c;
				System.out.println(a+"/"+c+"="+(result));
			}
*/
//p.79 오류없는 계산기 0을 입력해도 오류안나게 하기 
/*		
		Scanner s = new Scanner(System.in);
		
		int a,b ;
		char ch;
		int result;
		System.out.print("첫번째 숫자 입력 ==> ");
			a = s.nextInt();
		System.out.print("연산자 입력 ==> ");
			ch = s.next().charAt(0);		
		System.out.print("두번째 숫자 입력==> ");
			b = s.nextInt();
			
			switch(ch) {
			case '+' :
				System.out.println(a+"+"+b+"="+(a+b));
				break;
			case '-' :
				System.out.println(a+"-"+b+"="+(a-b));
				break;
			case '*' :
				System.out.println(a+"*"+b+"="+(a*b));
				break;
			case '/' :
				System.out.println(a+"/"+b+"="+(a/b));
				break;
			case '0':
				System.out.println("0으로 나누면 안됩니다!");
				break;	
			}
*/	
/*		
		Scanner s = new Scanner(System.in);
		
			System.out.print("첫번째 계산할 값을 입력하세요==>");
			int a = s.nextInt();
			System.out.print("두번째 계산할 값을 입력하세요==>");
			int b = s.nextInt();
			System.out.print("세번째 계산할 값을 입력하세요==>");
			int c = s.nextInt();
			System.out.print("네번째 계산할 값을 입력하세요==>");
			int d = s.nextInt();
		
			int result;
			result = a+b-c*d;
			System.out.println(a+"+"+b+"-"+c+"*"+d+"="+result);
*/			
	}

}
