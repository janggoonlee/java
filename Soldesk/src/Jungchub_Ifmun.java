import java.util.Scanner;

public class Jungchub_Ifmun {

	public static void main(String[] args) {
		
		// 중첩 if문 은 여러가지 조건 추가 else if 사용 중괄호{}를 넣어야 한다.
		
		Scanner s = new Scanner(System.in);
		
		// 학점 점수 출력. 
		
		
		System.out.println("수를 입력하세요!");
		int a = s.nextInt();
	
		if(a>=95) {
			System.out.println("A+");
		}
		else if(a>=90) {
			System.out.println("A0");
		}
		else if(a>=85) {
			System.out.println("B+");					
		}
		else if(a>=80) {
			System.out.println("b0");
		}
		else if(a>=75) {
			System.out.println("C+");
		}
		else if(a>=70) {
			System.out.println("C0");
		}
		else if(a>=65) {
			System.out.println("D+");
		}
		else if(a>=60) {
			System.out.println("D0");
		}
		else
			System.out.println("F");
		
		
		
		
	
		
		
		

	}

}
