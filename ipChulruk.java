package JavaBeginnerStart;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ipChulruk {

	public static void main(String[] args) throws IOException{///throws Exception 에러가 나면 예외처리 능력.


		
		

		
/*		
		FileWriter fw = new FileWriter("b.txt"); // 1.파일열기  독립적으로 읽어오는 주인공 생성. (Writer)
		
		BufferedWriter out = new BufferedWriter(fw);
		
		out.write("안녕?"); ///2.세부처리
		out.newLine();
		out.write("오늘은 월요일");
		out.newLine();
		out.write("janggoon9@naver.com");
		out.close(); /// 3. 종료 close.
		// 이안에서 출력해도 안나온다. 
		// 좌측 상단 최상위 폴더에서 Run 한번 돌리고 -> Refresh-> b.txt 파일생성. 

 */

/*
	BufferedReader in  = new BufferedReader(new FileReader("b.txt")); // 출력창으로 읽어오는작업(Reader)
		
		String str; // 초기값 문자열 설정
		
		while(true) { // 반복 무한루프 
			str = in.readLine(); // 읽어들인다.
			if(str==null) { // 조건문 문자가 없으면 
				break; //무한반복문 종료.
			}
			System.out.println(str); // 출력 
		}
		in.close(); // 종료 
*/		
		
		// 콘솔창에 문자를 입력 해서 입력한 문자를 파일에 저장.
/*		
		BufferedReader bu = null; // 메모리 공간 초기화 이장군 입력 하면 이  장 군 띄는 구간에 버퍼 구간이 생성, 메모리 차지
		
		PrintWriter pr = null;
		
		try { // throws 없기에 try사용 

			InputStreamReader in = new InputStreamReader(System.in);
			
			bu = new BufferedReader(in);  // 1. 여기까지가 콘솔의 입력.
			
			FileWriter fw = new FileWriter("d.txt"); // 2. d.txt 파일에 저장 
			
			pr = new PrintWriter(fw); //3 . 저장한 d.txt 읽어오기 . 
		
			String str;
			while((str=bu.readLine())!=null) {
				pr.println(str);
		}
			bu.close();
		}catch(Exception e) {}
		
		finally {
			pr.close();
		}
*/		

/*		
		InputStreamReader in = new InputStreamReader(System.in); // 입력
		
		FileWriter out = null;
		
		int r ;
		
		try {
			out = new FileWriter("f.txt");
			
			while((r=in.read())!=-1) {
				out.write(r);
			}
			in.close();
			out.close();
				
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
*/	
		
/*		
			byte[]in = {1,2,3,4,5};
			byte[]out = null;
			//1,2,3,4,5 를 읽어와서 OutputStream에 저장하고 싶다.
			ByteArrayInputStream input=null;
			ByteArrayOutputStream output=null; // null 청소작업
			
			output = new ByteArrayOutputStream();
			input = new ByteArrayInputStream(in);
			
			int r = 0;
			while((r=input.read())!=-1) {
				output.write(r);///스트림에 저장
			}
			out=output.toByteArray();
			//바이트 스트림을 바이트 배열로 바꿔서 out (바이트 배열)
			System.out.println(Arrays.toString(in));
			System.out.println(Arrays.toString(out));
*/
		
/*		
		ByteArrayInputStream in = null;
		FileOutputStream out = null;
		
		try {
			byte[]b = new byte[] {1,2,3};
			in = new ByteArrayInputStream(b);
			out = new FileOutputStream("g.dat");
			
			int r = -1;
			
			while((r=in.read())!=-1) {
				out. write(r);
			}
		}catch(Exception e) {}
		out.close();
		in.close();
		// g.dat 파일을 읽어와서
		// 바이트 배열에 저장하겠다
*/		

/*		
		FileInputStream in = null;
		ByteArrayOutputStream out = null;
		
		int r = -1;
		
		try {
			in = new FileInputStream("g.dat");// g.dat 파일을 읽어와서 
			out = new ByteArrayOutputStream();// 바이트에 저장하겠다.
			
			while((r=in.read())!=-1) {
				out.write(r); // 배열 저장 1,2,3
			}
			byte [] b= out.toByteArray();
			// 1 2 3 
			for(int i = 0; i<b.length; i++) {
				System.out.println(b[i]);
			}
		}catch(Exception e) {}
		out.close();
		in.close();
*/		

/*
		DataOutputStream out = null;
		
		try {
			int a = 5;
			double b = 1.5;
			boolean c = true;
			
			FileOutputStream fi = new FileOutputStream("h.txt"); // FileOutputStream("h.txt"); 초기값 짧게 fi 로 설정
			
			out = new DataOutputStream(fi);//fi =FileOutputStream fi = new FileOutputStream("h.txt"); 다들어감.
			
			out.writeInt(a);
			out.writeDouble(b);
			out.writeBoolean(c);
		
		}catch(Exception e) {}
		out.close();
*/		
		
/*		
		DataInputStream in = null;
		
		try {
			FileInputStream fi = new FileInputStream("h.txt");
			in = new DataInputStream(fi);
			int a =	in.read();
			double b = in.readDouble();
			boolean c = in.readBoolean();
			///파일에 저장한 기본자료형 값 읽어와서 출력
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			
		}catch(Exception e) {}
		in.close();
*/		
		
		
		
		
		
		
		
		
	}

}
