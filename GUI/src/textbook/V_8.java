package textbook;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class V_8 extends JFrame{
	public V_8() {
		super("�ؽ�Ʈ�ʵ�");
		JPanel p=new JPanel();
		JTextField tf1=new JTextField("�ֹε�Ϲ�ȣ ���ڸ�");
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
		new V_8();
	}

}
