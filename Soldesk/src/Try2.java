
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Rec implements Serializable{ 
	int x, y;
	
	Rec(int x, int y){
		this.x=x;
		this.y=y;
		// 객체를 파일에 저장: 직렬화
		// 파일에 저장한 객체를 읽어옴 : 역직렬화
	}
	
	void show(){
		System.out.println(x+ " "+y);
	}
	
}

public class Try2 {

	
	public static void main(String[] args) throws Exception {
	
/*      ObjectOutputStream os=null;
		os= new ObjectOutputStream (new FileOutputStream("obj.dat"));

		//Rec r = new Rec(4,7);
		
		os.writeObject(new Rec(4,7));
		os.writeObject(new Rec(8,5));
		os.writeObject(new String("glgl"));
		
		os.close();
*/		
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("obj.dat"));
		
		Rec r1 = (Rec) in. readObject();
		// Object 최고조상
		
		Rec r2 = (Rec) in.readObject();
		String r3 = (String) in.readObject();
		
		r1.show();
		r1.show();
		System.out.println(r3);
		
		in.close();
	}

}
