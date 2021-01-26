import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI2_0126 {
////BoderLayout JPrame 따로 생성 과정
	public static void main(String[] args) {
 
		JFrame j = new JFrame();
		j.setLayout(new BorderLayout());
		////BoderLayout 위치지정 필요
		j.add(new JButton("동"), BorderLayout.EAST);
		j.add(new JButton("서"), BorderLayout.WEST);
		j.add(new JButton("남"), BorderLayout.SOUTH);
		j.add(new JButton("북"), BorderLayout.NORTH);
		j.add(new JButton("중앙"), BorderLayout.CENTER);
		
		j.setVisible(true); // 실행
		
		
	}

}
