class Circle{
	int a;
	
	Circle(int a){
		this.a=a;
	}
	
	public String toString() { /// 스트링 투스링 으로 함수선언.  객체비교 함수,
		return a+ " "; // 문자열이기 때문에 " ". 
	}
	
	public boolean equals(Object ob) { // 이부분을 다시 짜서 비교, 모든 클래스는 object 상속 받고 있다.
		if(this.a == ((Circle)ob).a) { // 다운캐스팅
			return true;
		}
		return false;
		}
}
public class Munjae0126 {

	public static void main(String[] args) {
		
		
		Circle a=new Circle(30);

        Circle b=new Circle(30);

        System.out.println("반지름"+a);

        System.out.println("반지름"+b);

        if(a.equals(b)) { // a, b 메모리 값이 다르다 30이 아님. 
          System.out.println("같은 원");
        } 

        else {
         System.out.println("다른 원");
        }
                   

	}

}
