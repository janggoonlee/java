package backjuncoding;

import java.util.Scanner;

public class if5 {

	public static void main(String[] args) {
		///45분 일찍 알람 설정하기
		
		Scanner s = new Scanner(System.in);
		
		
		int h = s.nextInt(); //시
		int m = s.nextInt(); //분
		
		if(m<45) { // 분이 45분 보다 작으면 
			h--;   // 시간  1감소 
			m = 60 - (45 - m); //m 은 60분  - (45분 - m)
			
			if(h<0) {
				h = 23; 
				
		}
			System.out.println(h + " " + m);
		}
		else {
			System.out.println(h+ " " + (m - 45));
		}
		
/*		
		45분 전의 시간을 구하면 되는 간단한 문제다.

		 

		가장 쉬운 알고리즘으로는

		입력받은 분(minute) 을 45 기준으로 45보다 작으면 시(hour)을 -1 해주고 아닐경우 입력받은 분(minute)에 -45 를 해주면 된다.

		또한 시(hour)가 0보다 작아질 경우 시(hour) 을 23으로 수정해준다.


		1-1 단계 : 45분보다 작은지 여부 - if (min < 45 )

		     2-1 단계 : 시(hour) 가 0보다 작은지 여부 - if (hour < 0 )

		1-2 단계 : 1단계 조건 외 여부 - else


		이와 같이 구성하면 되겠다.

		참고로 분은 60분이니 만약 입력값이 45보다 작을 경우 (45-입력값) 의 차이만큼 60에서 빼주면 된다.

		즉 , 60 - (45-입력값) 이 된다.
*/
		
}
}
