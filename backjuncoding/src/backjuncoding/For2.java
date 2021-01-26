package backjuncoding;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
	
		int c = s.nextInt(); // 5를 입력 

		int aa[] = new int [c]; // 위에 입력을 배열선언 . 
			
		for(int i = 0; i<c; i++) { // 5를 입력했으니 0~5 까지 1씩 증감하면서 출력 

			int a = s.nextInt(); ///두번째 수 입력 . 
			int b = s.nextInt(); // 세번째 수 입력 .. 
			
			aa[i] = a+b; // 배열 i증감 선언 , 입력한 a + b 대입
		}
		s.close();
		
		for(int k : aa) {  // for each 문  정수 k를 선언하고 배열을 순차적으로 대입시킨다. 
			System.out.println(k); 
		}
		
		
	}
}
