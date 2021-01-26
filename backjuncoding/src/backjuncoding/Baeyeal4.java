package backjuncoding;

import java.util.Scanner;

public class Baeyeal4 {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		int val = (s.nextInt() * s.nextInt() * s.nextInt());
		
		String str = Integer.toString(val);
		
		for(int i = 0; i < 10; i++) {
			int cnt = 0;
			
			for(int j = 0; j < str.length(); j++) {
				
				if((str.charAt(j) - '0') == i) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		
		
	}

}
