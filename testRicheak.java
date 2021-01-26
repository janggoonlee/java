package JavaBeginnerStart;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class testRicheak {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
			FileOutputStream fos = new FileOutputStream("test.txt");
			byte b[]={4,6,7,8,-1,24};

			int ch;
			
			for(int i = 0; i<b.length; i++) {
				fos.write(b[i]);
			}
			fos.close();
	}

}
