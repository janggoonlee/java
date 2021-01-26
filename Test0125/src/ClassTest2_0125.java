import java.util.Scanner;

abstract class Calc {
double op1, op2;
abstract void set(double op1, double op2);
abstract double calculate();
}
class Add extends Calc {
void set(double op1, double op2) {
this.op1 = op1;
this.op2 = op2;
}
double calculate() {
return op1 + op2;
}
}
class Sub extends Calc {
void set(double op1, double op2) {
this.op1 = op1;
this.op2 = op2;
}
double calculate() {
return op1 - op2;
}
}
class Mul extends Calc {
void set(double op1, double op2) {
this.op1 = op1;
this.op2 = op2;
}
double calculate() {
return op1 * op2;
}
}
class Div extends Calc {
void set(double op1, double op2) {
this.op1 = op1;
this.op2 = op2;
}
double calculate() {
return op1 / op2;
}
}
public class ClassTest2_0125 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("사칙연산 설정 하세요!");
		
		double a = s.nextDouble();
		double b = s.nextDouble();
		char ch = s.next().charAt(0);
		
		switch(ch){
			
		case '+' :
			Add d1 = new Add();
			d1.set(a, b);
			System.out.println(d1.calculate());
			break;
			
		case '-' :
			Sub d2 = new Sub();
			d2.set(a, b);
			System.out.println(d2.calculate());
			break;
			
		case '*' :
			Mul d3 = new Mul();
			d3.set(a, b);
			System.out.println(d3.calculate());
			break;
			
		case '/' :
			Div d4 = new Div();
			d4.set(a, b);
			System.out.println(d4.calculate());
			break;
			}
		

	}

}
