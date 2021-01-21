import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Test003 {

	public static void main(String[] args) throws IOException {

		//1. while문을 이용해 실수를 여러 개 입력받고 평균 출력. (-1이 입력되면 입력을 종료시켜라.)
/*
		Scanner s = new Scanner(System.in);
		
		System.out.println("평균을 입력하세요:");
		int sum = 0;
		double i = 0;
		while(true) {
			i = s.nextDouble();
			if(i==-1) {
				System.out.println("-1을 입력 하셨습니다 종료!");
				break;
			}
			sum+=i;
			i++;
		}
		System.out.println("합: "+ sum/i);
*/
		
		/*2.Hi
			저는 자바를 좋아하고 잘합니다.
			앞으로 더 열심히 공부할 것입니다.
			이 문자열을 test01.txt 파일에 저장해라.
		*/
		
	/*
		FileWriter fw = new FileWriter("text01.txt");
		BufferedWriter bf = new BufferedWriter(fw);
		
		bf.write("hi");
		bf.newLine();
		bf.write("저는 자바를 좋아하 잘합니다.");
		bf.newLine();
		bf.write("앞으로 더 열심히 공부할것입니다.");
		
		bf.close();
		fw.close();
	 */
		
		
		//3.Scanner로 입력 받은 이름(문자열), id(문자열)를 한 줄마다 파일(test02.txt)에 저장해라.
		//“그만” 입력하면 종료시켜라. “그만” 입력하기 전까지의 문자열을 파일에 저장해라.(break, FileWriter 사용)
		//실행 결과) 홍길동 hong    
		        //   이길동 lee
		         //  그만
/*		
		BufferedReader in=
				new BufferedReader(new InputStreamReader(System.in));
		FileWriter out=new FileWriter("test02.txt");
		BufferedWriter out1=new BufferedWriter(out);
		
		String str;
		while(true) {
			System.out.println("이름");
			str=in.readLine();
			if(str.equals("그만")) {
				break;
			}
		}
		out.close();
		in.close();
*/

/*
 	//4.다음 main()를 보고 클래스 작성해라.
	
		class Rectangle{ //1 클래스 생성 
			int width, height;       //width, height 구체적으로 2.값 초기화
			
			int area() { //
				return width * height;
		}
		}
*/
/*
		Rectangle rec = new Rectangle();
		rec.width=5;     //구체적인 접근 
		rec.height=6;
		System.out.println("사각형면적" + rec.area( ));
*/ 
		
		
		//5.main()를 보고 Song클래스를 작성해라.
/*		
			class Song{ //1.클래스 생성 
			String name; //2. on, 00:00 둘다 스트링. 
			Song(String name){ // 3.new Song 생성자 만들기/ 스트링 설정
			this.name=name;  //4. 위에 네임을 가져온다. 
			}
			String getsong() {//5. 시스아웃겟송 생각해서 파라미트 노작성.
				return name;	// 리턴값 위의 네임 사용 
			}
			}
*/		 
/*
			Song s1 = new Song("On");
			Song s2 = new Song("00:00");
			System.out.println("좋아하는 노래" + s1.getsong());
			System.out.println("내 노래" + s2.getsong());
*/
		
		
		
		
}
}
