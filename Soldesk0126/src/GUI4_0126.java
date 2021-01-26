import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;




public class GUI4_0126 extends JFrame{

	GUI4_0126(){
		
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		
		//문자열 
		
		JLabel j =  new JLabel("안녕");
		
		ImageIcon img = new ImageIcon("/Users/ihaneul/Desktop/KakaoTalk_Photo_2020-08-18-22-57-43.jpeg");
		JLabel i = new JLabel(img);
		
		c.add(j);
		c.add(i);
		
		setVisible(true);
		
		}
	
	
	public static void main(String[] args) {
		
		
	 new GUI4_0126();
		
	}

}
