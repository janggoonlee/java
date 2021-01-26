package JavaBeginnerStart;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		/// For: 여러개 수행 할 것을 한번에 .

/*		
// p.207 1~100 수에서 3의 배수 합계 구해보기. 
			int sum = 0;
		for(int i =1; i<=100; i++) { ///1-100까지 출
			
			if(i%3==0) { // i가 증감 하면서 3의 배수를 찾고,
				sum+=i; // 찾은 3의 배수를 총합 한다 i+sum = sum 	
			}	
			}
			System.out.println(sum);
*/		

/*
// p.209 6-15 
		Scanner s = new Scanner(System.in);
		int num1, num2, num3;
		int sum = 0;

		System.out.println("첫번째 수 입력");
		num1 = s.nextInt();
		System.out.println("두번째 수 입력");
		num2 = s.nextInt();
		System.out.println("증가값 입력");
		num3 = s.nextInt();
		//////ex)  1   ~   30 1,2 수 입력, 증가값 입력 3 1~30 에서 3씩 증감시킨다  
		for(int i=num1; i<=num2; i=i+num3 ) {
			sum=sum+i; /// 1~30 에서 3씩 증감 시킨 값 합을 지정한다 
		}
		System.out.println(num1+" 에서 "+num2+" 까지 "+num3+"씩 증가값의 합 : "+sum);
*/		

/*		
//p.210 직접 풀어보기 6-6		
		Scanner s = new Scanner(System.in);
		
		System.out.println("단을 입력하세요!");
		int dan = s.nextInt();
		
		for(int i =9; i>=1; i--) { // 입력 받은 단 수 거꾸로 출력하기 
			System.out.printf("%d X %d = %d\n",dan,i,dan*i);
		}
*/

/*
p.218 6-9 직접 풀어보기!
		for(int i = 9; i>=1; i--) { /// 역 순 구구단 출력 
			for(int j = 9; j>=2; j--) {
				System.out.printf("%dx%d= %2d ",j,i,j*i);
		}
			System.out.println();
		}
*/
		
	
//p.221 for문 다른사용법 무한루프 ;; 		
/*		
		int i = 0 ;
		
		for(;;) { // 무한 루프 ;; 증감식 하면 끝도 없이 숫자 생성 멈추려면 terminate 빨간 버튼클릭
			
			i++;
			System.out.println(i);
		}
*/		
/*
		Scanner s = new Scanner(System.in);
		int a,b;//입력 받아서 계산 후 다시 반복.
		
		System.out.print("첫번째 수 : ");
		a= s.nextInt();
		
		System.out.print("두번째 수 : ");
		b= s.nextInt();
		
		System.out.printf("%d+%d =%d",a,b,a+b);
*/

/*		
//p.224 예제 14 구구단 출력 문제 		
		for(int dan = 2; dan<=9; dan++) {
			System.out.printf(" ##%d단## ",dan);
		}
		System.out.println();
		
		for(int i = 1; i<=9; i++) {
			for(int j =2; j<=9; j++) {
				System.out.printf(" %dx%d= %2d ",j,i,j*i);
			}
			System.out.println();
		}
*/		
		
		
		
		
	}
}
