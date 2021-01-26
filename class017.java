package Class2;
	class Fruit{
		String color;
		int number;
		Fruit(String color, int number){
			this .color = color;
			this .number  = number;	
		}
		void show() {
			System.out.println(color+" "+number);
		}
		}
	class Apple extends Fruit{
		Apple(String color, int number){
		super(color,number);
		}
		}
public class class017 {

	public static void main(String[] args) {
		
		Fruit f1 = new Apple("red",10); // 1.부모 자식 판별.
		f1.show();//red 10
	}

}
