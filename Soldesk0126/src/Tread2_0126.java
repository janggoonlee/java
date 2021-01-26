class Share extends Thread{
	
 synchronized void pr(String str) { // 이장군 한자씩 012 
// synchronized싱크로나이즈 : 섞여 나오는것을 방지해준다 . 동기화 	 
		for(int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}
}

class Th1 extends Thread{
	Share s;
	String [] str;
	
	Th1(Share s, String [] str){
		this.s=s;
		this.str=str;
	}
	
	public void run() {
		for(int i = 0; i < str.length; i++) {
			s.pr(str[i]);  //  s로 pr 접근
		}
	}
	
}

public class Tread2_0126 {

	public static void main(String[] args) {
		

		
		Share s = new Share ();
		String eng[] = {"java","study","music","gym","power"};
		String kor[] = {"자바","공부","음악","체육관","힘"};
		
		
		Th1 t1 = new Th1(s,eng); 
		Thread t2 = new Th1(s,kor);// 업캐스팅으로 인해 둘다 thread 가능 
		
		t1.start();
		t2.start();
		

	}

}
