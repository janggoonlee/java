package JavaBeginnerStart;

import java.util.Scanner;

public class YeanSan {

	public static void main(String[] args) {
		// 연산자
/*		
		  //p.157 예제모음 08 입력된 두 실수 산술연산 Scanner s = new Scanner(System.in);
		 
		  System.out.print("첫번째 계산할 값을 입력하세요==>"); double a = s.nextDouble();
		  
		  System.out.print("두번째 계산할 값을 입력하세요==>"); double b = s.nextDouble();
		  
		  double result;
		  
		  result = a + b; System.out.println(a + " + " + b + "= " + result);
		  
		  result = a - b; System.out.println(a + " - " + b + "= " + result);
		  
		  result = a * b; System.out.println(a + " * " + b + "= " + result);
		  
		  result = a / b; System.out.println(a + " / " + b + "= " + result);
		  
		  result = a % b; System.out.println(a + " % " + b + "= 10" + (int) result);
*/		

/*
//p.157 예제모음 09 동전 교환 프로그램 

		Scanner s = new Scanner(System.in);
		int money, c500, c100, c50, c10;

		System.out.print("## 교환할돈은 ? ");
		money = s.nextInt(); /// 7777 입

		c500 = money / 500;  // 15개 7500
		money = money % 500; // 나머지 277
		//c500 = money / 500; 나누고 나머지가 아래칸 머니로간다 
		c100 = money / 100;  //2개 200
		money = money % 100; // 나머지 77
		//c500 money 의 나머지 값을 이용해서 계산 계속 나머지 값은 아래로 이동하면서 정산 
		c50 = money / 50;  // 1개 50
		money = money % 50; // 27

		c10 = money / 10; // 2개 20
		money = money % 10; // 7

		System.out.printf("\n 오백원짜리  ==> %d 개 \n", c500);
		System.out.printf(" 백원짜리  ==> %d 개 \n", c100);
		System.out.printf(" 오십원짜리  ==> %d 개 \n", c50);
		System.out.printf(" 십원짜리  ==> %d 개 \n", c10);
		System.out.printf(" 바꾸지 못한 잔돈 ==> %d 원 \n", money);
*/		
//p.158 예제모음10 윤년 계산 프로그램		
/*		
	Scanner s = new Scanner(System.in);
		int year;
		System.out.print("년도를 기입하세요 ==> ");
		year = s.nextInt();
		if(year%4==0&&year%100!=0||year%400==0) {
			System.out.println(year+" 는 윤년입니다!");
		}
		else {
			System.out.println(year+"윤년이 아닙니다!");
		}
*/	
		
		
/*	
 //p.165 - 입력값 받아 시 분 초 계산기		
		Scanner s = new Scanner(System.in);
		
		System.out.print("계산할 초는? ==>");
		int sec = s.nextInt(); //12345
		
		int hour = sec / 3600; // 1시간에 3600초 정수 버림 값 적용 3시간 
		int min = sec % 3600 / 60; // 나머지 초를 다시 60으로 나누어  분 계산 25분  
		int se = sec % 3600 % 60;  // 기존 12345 초를 3600(시간), 60(분)계산 전부 나머지 계산 처리 
			
		System.out.printf("시간은 ==> %d 시간 \n",hour);
		System.out.printf("분은  ==> %d 분 \n",min);
		System.out.printf("초는  ==> %d 초 \n",se);
*/
	}
}
