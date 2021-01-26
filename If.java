package JavaBeginnerStart;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// If 문
/*
 
 // p.178 직접풀어보기
		Scanner s = new Scanner(System.in);

		System.out.println("점수를 입력하세요!");
		int score = s.nextInt();

		if (score >= 95) {
			System.out.println("A+");
		} else if (score >= 90) {
			System.out.println("A0");
		} else if (score >= 85) {
			System.out.println("B+");
		} else if (score >= 80) {
			System.out.println("B0");
		} else if (score >= 75) {
			System.out.println("C+");
		} else if (score >= 70) {
			System.out.println("C0");
		} else if (score >= 65) {
			System.out.println("D+");
		} else if (score >= 60) {
			System.out.println("D0");
		} else {
			System.out.println("F");
		}
		
*/	

	
//p.183 switch if~else 로 바꿔서 출생년도 입력값 받아서 띠 출력	

   		Scanner s = new Scanner(System.in);
 
		
		System.out.println("출생연도를 입력하세요!");
		int a = s.nextInt();
		
		if(a%12==0) {
			System.out.println("원숭이띠 입니다!");
		}
		else if(a%12==1) {
			System.out.println("닭띠 입니다!");
		}
		else if(a%12==2) {
			System.out.println("개띠 입니다!");
		}
		else if(a%12==3) {
			System.out.println("돼지띠 입니다!");
		}
		else if(a%12==4) {
			System.out.println("쥐띠 입니다!");
		}
		else if(a%12==5) {
			System.out.println("소띠 입니다!");
		}
		else if(a%12==6) {
			System.out.println("호랑이띠 입니다!");
		}
		else if(a%12==7) {
			System.out.println("토끼띠 입니다!");
		}
		else if(a%12==8) {
			System.out.println("용띠 입니다!");
		}
		else if(a%12==9) {
			System.out.println("뱀띠 입니다!");
		}
		else if(a%12==10) {
			System.out.println("말띠 입니다!");
		}
		else if(a%12==11) {
			System.out.println("양띠 입니다!");
		}

		
/*		
//p.184 예제모음 11 단순 if 문 입력값 받아 +,-,*,/,% 계산기 만들기 		
		Scanner s = new Scanner(System.in);
		int hap;
		System.out.println("첫번째 수 입력");
		int num1 = s.nextInt();
		
		System.out.println("연산자 입력 ");
		char ch = s.next().charAt(0);
		
		System.out.println("두번째 수 입력");
		int num2 = s.nextInt();
		
		if(ch=='+') {
			System.out.println(num1+" + "+num2+"= "+(num1+num2)+" 입니다!");
		}
		if(ch=='-') {
			System.out.println(num1+" - "+num2+"= "+(num1-num2)+" 입니다!");
		}
		if(ch=='*') {
			System.out.println(num1+" * "+num2+"= "+(num1*num2)+" 입니다!");
		}	
		if(ch=='/') {
			System.out.println(num1+" / "+num2+"= "+(num1/num2)+" 입니다!");
		}
		if(ch=='%') {
			System.out.println(num1+" % "+num2+"= "+(num1%num2)+" 입니다!");
		}
*/
		
/*		
//p.184 예제모음 11 단순 if 문 입력값 받아 +,-,*,/,% 계산기 만들기(else 활용해서 연산자 잘못 입력 오류 코드 설정) 		
		Scanner s = new Scanner(System.in);
		int hap;
		System.out.println("첫번째 수 입력");
		int num1 = s.nextInt();
		
		System.out.println("연산자 입력 ");
		char ch = s.next().charAt(0);
		
		System.out.println("두번째 수 입력");
		int num2 = s.nextInt();
		
		if(ch=='+') {
			System.out.println(num1+" + "+num2+"= "+(num1+num2)+" 입니다!");
		}
		else if(ch=='-') {
			System.out.println(num1+" - "+num2+"= "+(num1-num2)+" 입니다!");
		}
		else if(ch=='*') {
			System.out.println(num1+" * "+num2+"= "+(num1*num2)+" 입니다!");
		}	
		else if(ch=='/') {
			System.out.println(num1+" / "+num2+"= "+(num1/num2)+" 입니다!");
		}
		else if(ch=='%') {
			System.out.println(num1+" % "+num2+"= "+(num1%num2)+" 입니다!");
		}	
		else {
			System.out.println("연산자 잘못입력!");
		}
*/	
	
/*		
//p.185 switch ~case 입력받아 연산자 오류 까지 감안해서 계산기 만들기 .		
		Scanner s = new Scanner(System.in);
		
		System.out.print("수식을 한줄로 띄어쓰기로 입력하세요: ");
		int num1 = s.nextInt();
		char ch = s.next().charAt(0);
		int num2 = s.nextInt();
		
		switch(ch) {
		
		case '+':
			System.out.println(num1+" + "+num2+" = "+(num1+num2)+" 입니다.");
			break;
		case '-':
			System.out.println(num1+" - "+num2+" = "+(num1-num2)+" 입니다.");
			break;
		case '*':
			System.out.println(num1+" * "+num2+" = "+(num1*num2)+" 입니다.");
			break;
		case '/':
			System.out.println(num1+" / "+num2+" = "+(num1/num2)+" 입니다.");
			break;
		case '%':
			System.out.println(num1+" % "+num2+" = "+(num1%num2)+" 입니다.");
			break;
		default:
			System.out.println("연산자를 잘못 입력하셨습니다!");
			break;
			}
*/		
		
	}
	

}
