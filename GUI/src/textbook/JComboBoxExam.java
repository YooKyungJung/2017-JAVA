package textbook;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JComboBoxExam extends JFrame{
	public JComboBoxExam() {
		super("�޺��ڽ�");
		JPanel jp=new JPanel();
		String[] pets= {"������","�����","�縷����","�䳢","����"};
		JComboBox cb=new JComboBox(pets);
		jp.add(cb);
		add(jp);
		setSize(300,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JComboBoxExam();
	}

}
