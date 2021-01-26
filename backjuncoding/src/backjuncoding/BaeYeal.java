package backjuncoding;

import java.util.Arrays;
import java.util.Scanner;

public class BaeYeal {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int ary [] = new int[n];
		
		for(int i = 0; i<ary.length; i++) {
			ary[i]=s.nextInt();
		}
		
		s.close();
		
		Arrays.sort(ary);
		System.out.println(ary[0]+ " "+ary[n-1]);
		
		
	}

}
