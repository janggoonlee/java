import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class GUI3_0126 extends JFrame {
		GUI3_0126(){
			
			Container c = getContentPane();
			
			c.setLayout (new FlowLayout());
			c.setBackground(Color.blue); // 박스 안에 색넣기 .
			
			
			c.add(new Button("java"));
			c.add(new Button("어렵다"));
			c.add(new Button("어려워"));
			
			setVisible(true);
			
			
			
		}
	public static void main(String[] args) {
		// 
		new GUI3_0126();
	}

}
