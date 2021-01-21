import java.util.Scanner;

public class Swich_CaseMun {

	public static void main(String[] args) {
		// Switch Case 문 = 다중분기 Switch 조건문 사용해 case 사용 (if조건과 비슷)
		// Switch, case, default(else) 사용 항상 마지막엔
		// break 탈출해야 한다. 아니면 다음에 계속 출력.
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("1~4 까지 선택하세요!");
		int a = s.nextInt();
		
		switch (a){
		
		case 1:
		System.out.println("1을 선택했다.");
		break;
		
		case 2:
		System.out.println("2을 선택했다.");
		break;
		
		case 3:
		System.out.println("3을 선택했다.");
		break;
		
		case 4:
		System.out.println("4을 선택했다.");
		break;
		
		default:
		System.out.printf("다른것을 선택하셨습니다.");
		break;
		}
		

	}

}
