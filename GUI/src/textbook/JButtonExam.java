package textbook;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JButtonExam extends JFrame{
	public JButtonExam() {
		super("��ư");
		JPanel jp=new JPanel();
		JButton jb1=new JButton("��ư1");
		JButton jb2=new JButton();
		jb2.setLabel("��ư2");
		
		jp.add(jb1);
		jp.add(jb2);
		add(jp);
		
		setSize(400,200);
		setVisible(true);
		//��� ����� �⺻��
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JButtonExam();
	}
}
