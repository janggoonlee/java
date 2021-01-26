class Grade{
	private int english, math, science;
	
	Grade(){
	}
	
	Grade(int eng, int mat, int sci){
		this.english=eng;
		this.math=mat;
		this.science=sci;
	}
		
	
	double avg() {	
		return english+math+science/3;
	}
	
}
public class ClassTest0125 {

	public static void main(String[] args) {
		
		Grade g1 = new Grade();
		Grade g2 = new Grade(60,80,100);
		
		System.out.println(g2.avg());
		

	}

}
