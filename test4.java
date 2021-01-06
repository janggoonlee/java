import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {

		// 함수 : 입력, 출력(sysout) 기본
        // Scanner sc = new Scanner(system.in); = Scanner 객체는 System.in으로 하여금 키보드로부터 입력을 받아 원하는 문자, 문자열, 정수, 실수 등으로 변환하여 리턴한다.
		// import(수입, 들여보내다) 문 필요 : import jave.util. Scanner; (패키지 안에 클래스가 들어있다.)
		// 	
		
	// 예제 A a(객체명) = new A(); : 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a값 입력: ");
		int a= sc.nextInt();                 // 객체를 이용하여 클래스에 해당하는 함수를 사용가능 sc:Scanner
		                                    // . 접근연산자 (객체에 접근)
		
		System.out.println("b값 입력: ");
	    int b= sc.nextInt();
		

		System.out.println();
		
		
		
		System.out.println("내 이름:");
		String name = sc.next("");
		//문자, 문자열: next()
		
		System.out.println("상승");

		
		//두 정수를 입력 받아 평균 출력하는 프로그램 
		// 실행 결과) 두 정수 입력하세요 : 10,20
		//          10+20은 30
		
		
		
		

		
		
		
	}

}	
