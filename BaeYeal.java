package JavaBeginnerStart;

import java.util.Scanner;

public class BaeYeal {

	public static void main(String[] args) {
		// 배열 
		
//p.267	
/*		
		Scanner s= new Scanner(System.in);
		
		int aa[] = new int [4];
		
		int sum = 0;
		System.out.print("1번째 숫자: ");
		aa[1] = s.nextInt();
		System.out.print("2번째 숫자: ");
		aa[2] = s.nextInt();
		System.out.print("3번째 숫자: ");
		aa[3] = s.nextInt();
		System.out.print("4번째 숫자: ");
		aa[4] = s.nextInt();

		sum = aa[1]+aa[2]+aa[3]+aa[4];
		System.out.printf("합계 ==> %d", sum);
	
*/
		
/*
		Scanner s = new Scanner(System.in);
		int aa [] = new int [4];
		int sum = 0;
		for(int i = 0; i<4; i++){
			System.out.printf("%d 번째 숫자: ",i+1);
			aa[i] = s.nextInt();
		}
		sum= aa[0]+aa[1]+aa[2]+aa[3];
		
		System.out.printf("합은 ==> %d",sum);
*/		
// p.270 배열 초기		
/*	
		int aa[] = {100,200,300,400};
		int bb[] = {100,200,300};
		int cc[] = {100,200};
		int dd[] = {100};
		
		for(int i = 0; i<4; i++)
			System.out.printf("aa[%d]==> %d\t",i,aa[i]);
			System.out.println();
		for(int i = 0; i<3; i++)
			System.out.printf("bb[%d]==> %d\t",i,bb[i]);
			System.out.println();		
		for(int i = 0; i<2; i++)
			System.out.printf("cc[%d]==> %d\t",i,cc[i]);
			System.out.println();	
		for(int i = 0; i<1; i++)
			System.out.printf("dd[%d]==> %d\t",i,dd[i]);
			System.out.println();
*/		
//p.273
/*		
		int aa [] = new int[100];
		int bb [] = new int[100];
		
		int i = 0;
		
		for(i = 0; i<100; i++) { // 0~99까지 반복 
			aa[i]=i*2; // 반복된 숫자를 2곱한다 99*99 = 198
		}
		for(i = 0; i<100; i++) { // 0~99까지 반복
			bb[i] = aa[99-i]; // 역순 
		}
		System.out.printf("bb[0]는 %d, bb[99]는 %d 입력됨\n",bb[0],bb[99]);
*/
		
/*		
		int aa[] = {10,20,30,40,50};
		int count, size;
		
		count = aa.length; // 문자열 개수를 세어준다 length.
		size = count*Integer.BYTES; //배열 전체 바이트 크기수를 세어 준다 Integer.BYTES 
		System.out.printf("배열 aa[]의 요소의 개수는 %d 개 입니다. \n",count);
		System.out.printf("배열 aa[]의 요소는 전체 크기는 %d 바이트입니다. \n",size);
*/		

//p.275 8-3 직접 풀어보기
/*		
		int aa[] = {10,20,30,40,50};
		int count = 0;
		int sum = 0;
		
		for(int i = 0; i<aa.length; i++) {
			sum+=aa[i];
		}
		System.out.println(sum);
*/

		  

		  
/*
 		  Scanner s = new Scanner(System.in);
 		  
		  int a[]=new int[5]; // 1~5층 까지 인원 입력 받아 합산 
		  
		  int sum = 0;
		
		  for(int i = 0; i<5; i++) {
			  
			  System.out.print(i+1+" 층 : ");
			  a[i] = s.nextInt();
			  
			  sum = sum+a[i];
		  }
		System.out.printf("총인원==> %d",sum);
*/
		
/*		
		Scanner s = new Scanner(System.in);	 	  
		double ary[]=new double[3]; //실수 3개 입력받아 출력 . while 문이용 
		int i = 0 ;
		int sum = 0;
		while(i<3) {
			ary[i]=s.nextDouble();
			System.out.println(ary[i]);
			i++;
		}
*/
		
/*			
		Scanner s = new Scanner(System.in);
		
		  int ary[]=new int[4];
		  int sum=0;
		  int multi=1;
		  int i = 0;
		  
		  
		  while(i<4) {
			   System.out.print(i+1+"번째 숫자를 입력하세요:");

			   ary[i]=s.nextInt();

			   sum=sum+ary[i];
			   multi=multi*ary[i];
			   i++;
		  }
		  System.out.println("합계==>"+sum);

		  System.out.println("곱셈==>"+multi);
*/

/*		
		Scanner s = new Scanner(System.in);
		
		  int ary[]=new int[4];
		  int sum=0;
		  int multi=1;
		  int i = 0;
		
		do {
			   System.out.print(i+1+"번째 숫자를 입력하세요:");

			   ary[i]=s.nextInt();

			   sum=sum+ary[i];
			   multi=multi*ary[i];
			   i++;
		}while(i<4);
		  System.out.println("합계==>"+sum);

		  System.out.println("곱셈==>"+multi);
*/		  
		  
	}
}
