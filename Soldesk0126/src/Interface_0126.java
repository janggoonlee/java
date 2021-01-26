interface Cal{
	int total (int a, int b);
	int big (int a, int b);
}

class Calcu implements Cal{

	
	public int total(int a, int b) {
		int sum = 0;
		for(int i = a; a<=b; i++) {
				sum+=i;
		}
		return sum;
	}

	public int big(int a, int b) {
		
		return a>b?a:b;
	}
	
	
}
public class Interface_0126 {

	public static void main(String[] args) {
		
		Cal c = new Calcu();
		System.out.println(c.total(1, 10));
		System.out.println(c.big(5, 2));
	}

}
