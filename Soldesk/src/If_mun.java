import java.util.Scanner;

public class If_mun {

	public static void main(String[] args) {
		// if 문 :if, switch 조건문 - 어떤 조건을 걸어서 참과 거짓으로만 산출.
		
		Scanner s = new Scanner(System.in); // 스캐너 사용 
			

		
		
        
		System.out.println("정수를 입력하세요! ");
		int	a = s.nextInt();
		
		if(a%2==0)
			System.out.println("짝수를 입력하셨군요!");
		else
			System.out.println("홀수를 입력하셨군요!");
		
		
		
		

	}

}
