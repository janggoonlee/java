package JavaBeginnerStart;

import java.util.Scanner;

public class guitarJearmun {

	public static void main(String[] args) {
		// 기타 제어문 break, continue, return....
//p.244 
		
/*		
		for(int i = 1; i<= 100; i++) {
			System.out.println("for문 "+i+" 번 실행");
			break; /// 브레이크가 위에 출력이 100번 이루어 질것이다.
		}
		System.out.println("프로그램 종료한다 .");
*/
		
/*		
		Scanner s = new Scanner(System.in);
		
		int a, b;
		
		while(true) {
			System.out.print("더할 첫번째 숫자: ");
			a = s.nextInt();
			System.out.print("더할 두번째 숫자: ");
			b = s.nextInt();	
			
			if(a==0&&b==0) {//a가 0이고 b도 0 이라면 break.
				System.out.println("계산 불가능");
				break;
			}
			System.out.printf("%d + %d = %d \n",a,b,a+b);
		}
*/		
/*		
		int i  =1, sum =0;
		
		while(i<=100) {
			sum+=i;
			i++;
			if(sum>=1000) {
				break; // 1~100 까지 수중 1000이 넘을때 탈출 =>46 번째 
			}
			System.out.println(i); 
		}
*/		

//p.248 continue 사용예제 // 1~100까지 합을 구하되 , 3배수 값 제외하기.
/*		
		int i =1; // 1. 초기값 설정 
		int sum = 0;
		do {
			i++; // 3. 증감식 설정 
			if(i%3==0) {
				continue;  // 1~100 증감 값을 3으로 나눈 나머지 값이 0이 될때 까지 continue
			}
			sum+=i; // 3배수 값이 아닌 값을 총 더한다. 
		}while(i<=100); // 2. 조건식 설정 
		System.out.println(sum);
*/		
/*		
		Scanner s = new Scanner(System.in);
		
		String str;
		char ch;
		int i,k;
		int star;
		
		System.out.print("숫자를 여러개 입력: ");
		 str= s.nextLine();
		
		 i=0;
		 ch = str.charAt(i);
		 while(true) {
			 star = (int)ch-48;
			 
			 for(k=0; k<star; k++) 
				 System.out.printf("*");
				 System.out.println();
			
				 if(++i>str.length()-1) 
					break;
					ch = str.charAt(i);
		 }
*/
		
		
	}

}
