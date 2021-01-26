package backjuncoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class For6 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		br.close();
		
		for(int i = 1; i <= T; i++) {
			for(int j = 1; j<=T-i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k<=i; k++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
}
}
