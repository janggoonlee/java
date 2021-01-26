package Class2;
class Music {
String title;
String singer = "방탄";

Music(String title) {
this.title = title;
}

Music(String title, String singer) {
this.title = title;
this.singer = singer;
}
}
public class test004 {

	public static void main(String[] args)  {


			Music m=new Music("On", "BTS");//1
			System.out.println(m.title+ " " +m.singer); // On , BTS 출력//2

			Music m1=new Music("00:00");//3
			System.out.println(m1.title+" " +m1.singer); // 00:00, 방탄 출력//4
		
/*		
		for(int i =0; i<4; i++) {
			for(int j = 0; j<3-i; j++) {
				System.out.print(" ");
			}
			int n =0;
			for(int j = 0; j<(2*i)+1; j++) {
				System.out.print(n);
				n++;
			}
			System.out.println();
		}
*/		
}
}
