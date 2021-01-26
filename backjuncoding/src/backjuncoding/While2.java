package backjuncoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class While2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int copy = N; // 변수 복사
		
		int cnt = 0; 

		do{
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10); 
			cnt++;
			
		}while(copy != N); // 입력된 수가 변수복사가 아닐때 까지 
		
		System.out.println(cnt);
		
}
}
