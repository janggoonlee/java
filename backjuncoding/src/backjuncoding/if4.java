package backjuncoding;

import java.util.Scanner;

public class if4 {

	public static void main(String[] args) {
		//주어진 점이 어느 사분면에 속하는지 알아내는 것
		
		Scanner s = new Scanner(System.in);

		int x = s.nextInt();
		int y = s.nextInt();
		
		if(x>0) {
			
			if(y>0) {
				System.out.println("1");
			}
			
			else {
				System.out.println("4");
			}
			
			}
		
		
		else {
			if(y>0) {
				System.out.println(2);
				}
			
			else {
				System.out.println(3);
			}
			
			}
		
}
}
