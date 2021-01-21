
public class Nonri_yeonsanja {

	public static void main(String[] args) {
		// 논리연산자 
		//&&:둘다 참이어야 참. and ~이고, 그리고
		//|| : 참이 하나여도 참. or ~이거나, 또는
		//! 참이면 거짓, 거짓이면 참. not ~아니다, 부정
		
		int a = 99;
		
		System.out.println((a>98)&&(a>80));// true
		System.out.println((a>100)||(a<80));// true
		System.out.println(!(a<80));//false
		
	

		
	}

}
