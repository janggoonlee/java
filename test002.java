package JavaBeginnerStart;

import java.io.BufferedReader;
import java.io.FileReader;

public class test002 {
	
	public static void main(String[] args) throws Exception {
/*
	//1.FileOutputStream을 이용하여 byte[] 배열 속에 들어있는 값을 test.txt파일에 저장해라.
	//byte b[]={4,6,7,8,-1,24};	
		FileOutputStream fos = new FileOutputStream("test.txt");
		byte b[]={4,6,7,8,-1,24};
		int ch;
		
		for(int i = 0; i<b.length; i++) {
			fos.write(b[i]);
		}
		fos.close();
*/
		
/*
		//// FileInputStream을 이용하여 test.txt파일을 읽어 byte[] 속에 저장하고 화면에 출력해라.
		FileInputStream fis = new FileInputStream("test.txt");
		
		byte bt[] = new byte[6];
		int ch;
		int i = 0;
		
		while((ch = fis.read())!=-1) {
			bt[i] = (byte)ch;	
			i++;
		}
		for(int j = 0; j<bt.length;j++) {
			System.out.println(bt[j]);
		}
		fis.close();
*/
		
/*		
	//2.복권의 번호와 추첨한 복권의 번호를 확인하여 일치하는 번호의 개수를 출력하는 프로그램.
   	//두 배열은 main함수에 선언하고 두 배열에서 일치하는 번호를 찾아 그 개수를 반환해라.
		static int same(int lotto[],int my[]) {
			int gap = 0;
			for(int i = 0; i<lotto.length; i++) {
				for(int j = 0; j<my.length; j++) {
					if(lotto[i]==my[j]) {
						gap++;
						
				}
				}
			}
			return gap;
		}
		int lotto[]={4,10,25,30,45,47};
		int my[]={1,4,7,26,45,48};
		int r;

		r=same(lotto,my);
		System.out.printf("일치하는 번호의 개수:%d\n", r);
*/
		
/*		
 	4. show()함수를 배열을 역순으로 출력하는 함수로 정의해라.
		static void show(int a[]) {
			int i ;
			for( i = a.length -1; 0<=i; i--){
				System.out.print(a[i]);
			}
				
		}

		int ary[] ={6,2,8,4,9};
		 show(ary);
*/
		
/*		
		///병용씨 버블정렬 풀이 
		static void show(int ary[]) {
			for (int i=0;i<ary.length/2;i++) {
				int b;
				b=ary[ary.length-1-i];
				ary[ary.length-1-i]=ary[i];
				ary[i]=b;			
			}
			for(int k:ary) {
				System.out.print(k+" ");
			}
		}
		
		int ary[] ={6,2,8,4,9};
		 show(ary);
*/	

		/*
		///5.다음 배열의 전체 합과 평균 출력(소수점 첫째자리까지)
		static void ary( int ary[][]) {
			int sum = 0, cnt = 0;
			double avg = 0;
			
			for (int i = 0; i < ary.length; i++) {
				for (int j = 0; j < ary[i].length; j++) {
					sum += ary[i][j];
					cnt++;
				}
			}
			avg = (double)sum / cnt;
			System.out.printf("합: %d, 평균: %.1f", sum, avg);
		}

		  int [][]ary ={{43,97},
				  		{34,77,87},
				  		{100,95,38,89}};
*/
		
		
	/* 6. 다섯명의 학생의 점수를 입력하여 유효점수와 평균 출력하는 프로그램
		유효점수는 최고점과 최저점을 제외한 점수이며 평균은 유효점수로 계산해라.
		(for-if문 중첩, contine사용)
		실행결과) 5명 학생 점수 입력 : 1 2 3 4 5
		         유효 점수: 2 3 4
		         평균: 3.0
	*/
/*		
		int score[]=new int[5];
		
		Scanner s=new Scanner(System.in);
		System.out.print("5명 학생 점수 입력 :");
		//1 2 3 4 5 
		int sum=0,max=0,min;
		double avg;
		
		for(int i=0;i<score.length;i++) {
			score[i]=s.nextInt();
		}
		
		for(int i=0;i<score.length;i++) {
			if(max < score[i]) {
				max=score[i];
			}
		}
		min=max;
		for(int i=0;i<score.length;i++) {
			if(min > score[i]) {
				min=score[i];
			}
		}

		System.out.print("유효점수: ");
		for(int i=0;i<score.length;i++) {
			if(max==score[i] || min==score[i]) {
				continue; //최고, 최저값 제외
			}
			else {
				sum+=score[i];
			}
		}
		System.out.println(sum/3.0);	
	}
}
*/
		
/*		
		FileOutputStream fos = new FileOutputStream("Sample.txt");
		
			int ch;
			
			while((ch = System.in.read())!=-1) {
				fos.write((byte)ch);
			}
			fos.close();
*/			

/*
			FileInputStream fis = new FileInputStream("Sample.txt");
			
			int c;
			
			byte[]bt = new byte[1024];
			
			int i = 0;
			int c;
			for(c = fis.read()!=-1) {
				bt[i] = (byte)c;	
				i++;
			}
			System.out.println(new String(bt));	
			fis.close();
*/	
		//7.Sample.txt파일에 “저는 자바를 좋아합니다”를 저장하고 파일을 읽어 화면에 출력해라.
		//(String [] 배열로 초기화해서 for문으로 읽기)
/*
		FileWriter fw=new FileWriter("Sampel.txt");
		BufferedWriter out=new BufferedWriter(fw);
		
		out.write("저는 자바를 좋아합니다");
		out.close();
*/
		
/*		
		//읽기
		FileReader fr=new FileReader("Sample.txt");
		BufferedReader br=new BufferedReader(fr);
		String str=null;
		String []str2 = new String[10];
		int i=0;
		while((str=br.readLine())!=null) {
		str2[i]=str;
		i++;
		}
		for (String str3:str2) {
		if (str3==null) {
		break;
		}
		System.out.print(str3+" ");
		}
		br.close();
		fr.close();
*/		
	}

}
