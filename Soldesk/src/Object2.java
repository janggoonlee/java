/*import java.io.FileOutputStream;
  import java.io.IOException;
*/import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Object2 {

	public static void main(String[] args) throws IOException{
/*		
 	//2.
 	///Object.java  파일 이용 출력. 
		ObjectOutputStream os = null;
		
		try {
			os = new ObjectOutputStream(new FileOutputStream("ob.txt"));
			
			Object ob = new Object();
			
			ob.setName("윤민"); // 출력할때 set
			ob.setId("123");
			ob.setAge(22);
			
			os.writeObject(ob);
		}catch(Exception e) {}
		os.close();
*/

/*		
		//3. 파일 읽기.
		ObjectInputStream is = null;
		try {
			is = new ObjectInputStream(new FileInputStream("ob.txt"));
			
			Object ob= (Object)is.readObject(); /// Object.jave 클래스가 따로 있기때문에,(Object) 형변환
			// 예제 int n = (int)3.5;
		 
			System.out.println(ob.getName()); // 읽을때 get
			System.out.println(ob.getId());
			System.out.println(ob.getAge());
		}catch(Exception e) {}
		is.close();
*/		
		
		
		
		
	}

}
