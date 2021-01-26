package JavaBeginnerStart;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class FileIpChulRuk {

	public static void main(String[] args)throws Exception {
		// java에서 파일 입출력이란 파일로 처리하는 메소드.
/*	
 	// 스트림(통로)은 두종류, 바이트(1byte)스트림과 문자(2byte)스트림이 있다.

 	바이트 스트림										문자 스트림
	1) 입력 스트림 -> ~~InputStream으로 끝남 				1) 입력 스트림 -> ~~Reader
	2) 출력 스트림 -> ~~OutputStream으로 끝남 			2) 출력 스트림 -> ~~Writer

	1. 파일 생성(출력)
	OutputStream(바이트단위 파일생성)						Writer(문자단위 파일생성)

	@주인공 장식@
	->Constructors의 매개변수를 보고-> InputStream, OutputStream,Reader,Writer 가 보이면 장식, 없으면 주인공!

	2. 파일에다 값 저장 (write 메소드)

	3. 파일 읽어들임 
	InputStream(바이트단위로 읽어들임)  					Reader(문자단위로 읽어들임)
	
	4. 파일닫기(close())
	
	5. ObjectOutputStream 
	   ObjectInputStream 
*/
/*
		//메모장 파일 읽어 들일때.
		FileInputStream fis = new FileInputStream("b.txt");//1. 주인공 파일 열기 
		
		int ch;
		
		while((ch = fis.read())!= -1)  // 파일에서 문자하나를 read()로 읽어온다. 파일이 끝일경우 -1 반환한다.(정의)
			System.out.print((char)ch); // 문자를 출력한다. 
		
		fis .close(); // 파일의 모든 내용 처리후 파일닫기. 
		// 바이트 스트림 계열이기 때문에 영어만 읽히고 나머지 문자는 깨진다. 
*/
/*		
		FileOutputStream fos = new FileOutputStream("a.txt");
		
		int ch;
		
		while((ch = System.in.read())!=13) { // 아스키코드 13 입력할때까지 키보드에서 문자하나를 read()로 읽어온다. 
			fos.write((byte)ch); // 바이트로 형변환 문자를 파일에쓴다.
		}
		fos.close(); // 파일 닫기. 
*/
/*		
		Scanner s = new Scanner(System.in);
		
		FileWriter fw = new FileWriter("koon.txt");
		
		String str;
		
		while(!(str = s.nextLine()).equals("")) {
			//입력한 행이 비어 있는 행이 아니면 11행을 처리한다. 즉 엔터를 누르면 끝난다.
			
			fw.write(str+"\r\n"); // \r은 줄바꿈
			
			fw.close();
			}
*/			
/*		
		FileWriter f = new FileWriter("koon2.txt");
		
		BufferedWriter w = new BufferedWriter(f);
		
		char a[] = new char[] {'월','요','일'};
		
		w.write(a);
		w.newLine();
		w.write("자바는 참 재밌네요");
		w.close();
		
*/	
		
/*		
		 // FIleInput Stream 을 이용하여 문자열 파일을 -> 바이트 단위로 -> 다시 문자열로 바꿔서 파일 읽어들이기 
		FileInputStream fis = new FileInputStream("koon2.txt");
		
		int ch;
		
		byte[]bt = new byte[1024]; // 바이트 1024 크기 바이트 계열 선언
		
		int i = 0;
		
		while((ch = fis.read())!=-1) { //문자열 여기에 저장 :
			bt[i] = (byte) ch; // 바이트단위로 변경.
			i++;
		}
		
		System.out.println(new String(bt)); // 다시문자열String(bt)로 변경 
		fis.close();
*/	
	/*	
		FileWriter fw = new FileWriter("test.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Hi");
		bw.newLine();
		bw.write("저는 자바를 좋아합니다.");
		bw.newLine();
		bw.write("앞으로 더 열심히 공부할 것 입니다.");
		
		bw.close();
		fw.close();
	*/
		
		Scanner s = new Scanner(System.in);
		
		FileWriter fw1=new FileWriter("text02.txt");
		BufferedWriter bw1 = new BufferedWriter(fw1);
		String str;
		while(true) {
		System.out.println("입력할 내용");
		str=s.nextLine();
		if(str.equals("그만")) {
		break;
		}
		bw1.write(str);
		bw1.newLine();
		}
		bw1.close();
		fw1.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
