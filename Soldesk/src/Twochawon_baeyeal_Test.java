
public class Twochawon_baeyeal_Test {

	public static void main(String[] args) {
		
		
		int aa[][] = new int [3][4];
		int sum =0;
		for(int i =0; i<3; i++) {
			for(int j =0; i<4; j++) {
				aa[i][j]= (int)(Math.random()*10);
				sum+=aa[i][j];
				System.out.print(aa[i][j]+" ");	
			}
			System.out.println();
		}
		System.out.print("총합 : "+sum);
		
		
		

	}

}
