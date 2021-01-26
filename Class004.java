package Class;

class Total{
	int a ,b;
	
	Total(int a, int b){
		this.a=a;
		this.b=b;
	}
	void sum() {
		int sum = 0;
		for(int i = 0; i<10; i++) {
			sum+=i;
			System.out.println(sum);
		}
	}
}

public final class Class004 {

	public static void main(String[] args) {

		Total t = new Total(1,10);
		t.sum();

	}

}
