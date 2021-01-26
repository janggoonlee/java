package JavaBeginnerStart;

class myCar{ // 1. 클래스 설계
	char x;
	char y;
}


public class Method { //global 전체 함수 기능 

	

	public static void main(String[] args) {
		// Method : 반복적으로 코딩할때 한번만 코딩하고 반복해서 사용가능.
/*		
 		// main 에 하지말아라. 
		static int plus(int a, int b) {
			// 아래서 출력 하기 때문에 스태틱 인트 플러스 설정후, 아래 플러스 변수값(100,200) 동일하게 설정 	
					int result; // 정수 초기값 설정 하나 잡고,
					result = a+b; // result 안에 초기값 설정 
					return result; // 리턴으로 날린다. 
					
				}
		
		int hap;
		hap = plus(100,200);
		System.out.printf("100과 200의 plus() 메소드 결과는 :%d",hap);
*/	
/*		
		class myCar{ // 1. 클래스 설계
			char x;
			char y;
		}

		/// public class 에만 static 생성 가능 
		static void func(char x, char y) {//2 func 값 채운다  // 지역함수 기능. 
			char imsi;
			imsi= x;
			x = y;
			y = imsi;
		}
		static void func2(myCar ch) { // 3. func2 값 채운다.
			char imsi;
			imsi = ch.x;
			ch.x = ch.y;
			ch.y = imsi;
		}	

		
		
		char x = 'A', y = 'Z';
		System.out.printf("원래 값    :x=%c, y=%c\n",x,y);
		func(x,y);
		System.out.printf("값을 전달한 후 : x=%c, y=%c\n\n",x,y);
		
		
		myCar ch = new myCar();
		ch.x = 'A';
		ch.y = 'Z';
		System.out.printf("원래 값    : x=%c, y=%c\n",ch.x,ch.y);
		func2(ch);
		System.out.printf("주소를 전달한 후 : x=%c, y=%c\n",ch.x,ch.y);
*/
		
		
		
		
	}

}
