import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class GUI1_0126 extends JFrame {///1. JFrame 을 상속 받는다. 
	
		GUI1_0126(){///2.생성자 이름생성 . 
		super("java"); // 3. super로 JFrame 불러오고 제목설정 , setTitle("java"); 제목설정.
		setSize(300,300);//4. 프레임 크기 설정
		setVisible(true); // 5. 프레임 출력 메소드
		
		JButton j1 = new JButton("버튼 1"); // 6. 객체생성 JButton버튼생성 
		JButton j2 = new JButton("버튼 2");
		JButton j3 = new JButton("버튼 3");
		
		Container c = getContentPane(); // 7.
		//컨탠트팬 
		c.add(j1);
		c.add(j2);
		c.add(j3);
		c.setLayout(new FlowLayout()); // 일렬로 출력
	}
	

	public static void main(String[] args) {


		new GUI1_0126();
	}

}
