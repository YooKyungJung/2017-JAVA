package textbook;

import java.awt.Frame;
import javax.swing.JFrame;

public class JFrameExam extends JFrame {
	public JFrameExam() {
		setLocation(100,100);
		setSize(300,300);
		setVisible(true); //화면에 보이게 해라
		setTitle("프레임");	
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		JFrameExam f=new JFrameExam();
		//f.setTitle("aaa");		
	}
}