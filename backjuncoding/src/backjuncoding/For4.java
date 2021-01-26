package backjuncoding;

import java.util.Scanner;

public class For4 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		int c = s.nextInt();
		int sum = 0;
		for(int i = 0; i<c; i++) {
			
			int a = s.nextInt();
			int b = s.nextInt();
			
			sum=a+b;
			System.out.println("Case #"+(i+1)+": "+sum);
		}
		
	}
}
