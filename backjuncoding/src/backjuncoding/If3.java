package backjuncoding;

import java.util.Scanner;

public class If3 {

	public static void main(String[] args) {
		
		///연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
		
		Scanner s = new Scanner(System.in);
		
		int year = s.nextInt();
		
		if(year%4==0) { //4배수 1-1
		
			if(year%400==0) System.out.println("1"); //4배수이면서 400도 가능  2-1
		
			else if(year%100==0) System.out.println("0"); // 4배수 이면서 100 은 아니여야 한다. 2-2
			
			else System.out.println("1"); //2 조건 나머지 2-3
			}
			else System.out.println("0"); // 1-2 1 조건 나머지
		
}
}
