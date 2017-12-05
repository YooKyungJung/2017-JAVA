package textbook;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JTextFieldExam extends JFrame{
	public JTextFieldExam() {
		super("텍스트필드");
		JPanel p=new JPanel();
		JTextField tf1=new JTextField("주민등록번호 앞자리");
		JPasswordField tf2=new JPasswordField(15);
		tf1.selectAll();
		tf2.setEchoChar('*');
		p.add(tf1);
		p.add(tf2);
		add(p);
		setSize(400,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JTextFieldExam();
	}

}
