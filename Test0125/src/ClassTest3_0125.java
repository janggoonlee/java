import java.util.Scanner;

public class ClassTest3_0125 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		int Num = s.nextInt();
		
		int ary [] = new int[Num];
		
		
		
		for(int i = 0; i < ary.length; i++) {
			
			ary[i]=(int)(Math.random()*100)+0;
			
			System.out.println("성적 : "+ ary[i]);
		}

	}

}
