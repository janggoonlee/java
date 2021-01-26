package backjuncoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baeyeal2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int aa [] = new int [9];
		
		for(int i = 0; i<9; i++) {
			
			aa[i] = Integer.parseInt(br.readLine());		
		}
		
		int max = 0;
		int index = 0;
		int cnt = 0;
		
		for(int value : aa) {
			
			cnt++;
			
			if(value > max) {
				
				max = value;
				index = cnt;
			}
		}
		System.out.println(max);
		System.out.println(index);
		
		
}
}
