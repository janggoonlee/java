import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class inChulruk {

	public static void main(String[] args) throws IOException {
		
		
		char[] ary = new char[10];
		
		int cnt;
		
		FileReader in = new FileReader("a.txt");
		
		cnt =in.read(ary, 0, ary.length);
		
				
		for(int i =0; i<cnt; i++) 
			System.out.println(ary[i]);
			
			
			in .close();
		
	}

}
