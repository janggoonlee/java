package Class2;

abstract class Ca{
	abstract int add(int a, int b);
	abstract double avg(int a[]);  // 추상은 추상끼리
	}

class Cal extends Ca{ 
	int add(int a, int b) { // 위에 추상에서 다 긁어오기.
		return a+b;
	}
	double avg(int a[]) {
		int sum = 0;
		for(int i = 0; i<a.length; i++) {
			sum+=a[i];
			
	}
	return sum/a.length; // or 3.0 으로 
	}
	
	}	
	
	
public class Class020 {

	public static void main(String[] args) {
		
		Cal c = new Cal();
		System.out.println(c.add(3,7)); // 두수합
		System.out.println(c.avg(new int[] {1,2,3})); //1,2,3 평균

	}

}
