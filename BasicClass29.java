package Class;

	class Pet{
	String type;									//인스턴스 변수로 애완동물 종류 개월수 설정
	int age;
	
	void move() {
	System.out.println(this.type+"가 움직입니다..");	// 애완동물의 움직임을 설정하는 메소드를 정의한다
}
	int getAge() {
		return this.age;							// 애완동물의 개월 수를 반환하는 메소드를 정의한다
	}
}

public class BasicClass29 {

	public static void main(String[] args) {
		// p418 풀어보기 클래스 기본29
		
		Pet pet1 = new Pet();						
		pet1.type="강아지";				// 애완동물 인스턴스 1을 생성하고 종류에 '강아지', 개월 수 '8'을 대입
		pet1.age = 8;
		
		Pet pet2 = new Pet();
		pet2.type="고양이";				//	애완동물 인스턴스 1을 생성하고 종류에 '고양이', 개월 수 '13'을 대입
		pet2.age = 13;
		
		pet1.move();					// 메소드 호출
		pet2.move();
		
		System.out.println(pet1.type+"는 "+pet1.age+"개월 입니다.");
		System.out.println(pet2.type+"는 "+pet2.age+"개월 입니다."); /// 인스턴스 변수의 내용을 출력 
		
		
	}

}
