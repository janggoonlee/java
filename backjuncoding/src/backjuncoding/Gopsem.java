package backjuncoding;

import java.util.Scanner;

public class Gopsem {

	public static void main(String[] args){

		Scanner s = new Scanner(System.in);
		
		int A = s.nextInt();
		int B = s.nextInt();
		
		s.close(); // 472 x 385 
		
		System.out.println(A *(B%10)); // 일의 자리 5 385 % 10 을 해주면 10으로 나눠준 값의 나머지를 구하니 5가 반환
		System.out.println(A *(B%100/10));// 8은 385%100 을 해주면 85 가 나오고 10으로 나누면, 즉 85/10 을 하면 8이 반환
		System.out.println(A *(B/100));// 3은 385/100 을 하면 3이 나온다.
		System.out.println(A*B);
		
	}

}
