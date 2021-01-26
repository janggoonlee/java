interface Po{
	
	 void pr(int n, String j);
	 void pr(String j);
}

class Point implements Po{
	
	public void pr(int n, String j) {
		System.out.println(n+", "+j);
	}
	public void pr(String j) {
		System.out.println(j);
	}
}
public class Munjae2_0126 {

	public static void main(String[] args) {
		
		
		Po p=new Point();

        p.pr(30000,"java");   

        p.pr("python"); 

	}

}
