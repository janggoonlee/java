package backjuncoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baeyeal3 {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int aa [] = new int [10];
		// 0~9 까지 체크할 길이 10의 인트배열생성. 초기값 0
		
		int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) *
				Integer.parseInt(br.readLine());
		// val 에다가 br.readLine() 으로 읽은 값을 곱해서 저장 . // 세 정수를 곱한다.  
		
		String str = String.valueOf(val);
		//String str 에다가 val의 int형을 String 으로 변환 해준 뒤 ,
		
		for(int i = 0; i < str.length(); i++) {
			aa[(str.charAt(i) - 48)]++;
			//for문을 통해 해당 문자열 문자 값을 -48 (또는 -'0')을 추출하여 int 배열에 index값을 1 증가.
		}
		for(int v : aa) {
			System.out.println(v);
		}

	}

}
