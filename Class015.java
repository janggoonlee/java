package Class2;

import java.util.Scanner;

	class Song{
	String s,t;
	Song(String s, String t){
		this.s=s;
		this.t=t;
		
	}
	}	

public class Class015 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); //1
		
		Song so [] = new Song[2]; // 2 객체 배열
		
		for(int i =0; i<2; i++) { //3 
			System.out.println("가수"); //4
			String singer = s.next();//5
			//BTS
			System.out.println("제목");
			String tittle = s.next();
			//ON
			so[i] = new Song(singer, tittle);
		}
		
		for(int i = 0; i<2; i++) {
			System.out.println(so[i].s+" "+so[i].t);
		}

}
}
