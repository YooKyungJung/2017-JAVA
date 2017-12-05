package layout;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutExam extends JFrame{
	public BorderLayoutExam() {
		super("BorderLayout");
		setLayout(new BorderLayout());
		JButton b1=new JButton("위");
		JButton b2=new JButton("아래");
		JButton b3=new JButton("왼쪽");
		JButton b4=new JButton("가운데");
		JButton b5=new JButton("오른쪽");
		add(b1,BorderLayout.NORTH);
		add(b2,BorderLayout.SOUTH);
		add(b3,BorderLayout.WEST);
		add(b4,BorderLayout.CENTER);
		add(b5,BorderLayout.EAST);
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new BorderLayoutExam();
	}
}
