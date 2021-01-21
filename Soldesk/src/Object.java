import java.io.Serializable;
//1
public class Object implements Serializable{ 
	// 직렬화 인터페이스
	// 객체를 파일안에 저장할때 (ObjectOutputStream)=>직렬화 Serializable
	// 저장된 객체를 읽는다(ObjectInputStream)=>역직렬화
	

	private String name;
	private String id;
	private int age;
	///반환 받고 싶을때. 상단 source 창에서 Generate Getter and Setting.. 를 켜라.
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


}
