package Class;
class Score{
	
	void show(int a [][]) {
		int sum  =0;
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[i].length; j++) {
				sum+=a[i][j];
			}
		}
		System.out.println(sum/12.0);
	}
}


public class Class011 {

	public static void main(String[] args) {
	////배열을 이용한 클래스 .
		int [][] grade= {{90,100,80},
	            {70,95,87},
	            {80,90,70},
	            {90,100,100}};

	Score s = new Score();
	s.show(grade);

}
}