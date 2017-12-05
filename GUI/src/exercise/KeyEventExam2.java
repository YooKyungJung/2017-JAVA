package exercise;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KeyEventExam2 extends JFrame{
	JTextField jumin1=new JTextField(10);
	JLabel lb=new JLabel("-",JLabel.CENTER);
	JTextField jumin2=new JTextField(10);
	JPanel p=new JPanel();
	public KeyEventExam2() {
		super("Key Event");
		p.add(jumin1); p.add(lb); p.add(jumin2); add(p);
		setSize(300,100);
		setVisible(true);
		//Ű���� �Է��� �� ��ü(jumin1)�� �̺�Ʈ �ڵ鷯(addKeyListener)�� ������
		jumin1.addKeyListener(new MyClass());
	}
	
	class MyClass extends KeyAdapter{
		//Ű�� ������ ���� �̺�Ʈ�� ����� �����Ѵ�.
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			if(e.getKeyCode()==e.VK_LEFT) {
				jumin2.setText("Left ����");
			}
		}
		//Ű�� ���ȴٰ� �������� ���� �̺�Ʈ�� ����� ������
		public void keyReleased(KeyEvent e) {
			if(jumin1.getText().trim().length()==6) {
				jumin2.requestFocus(); //���� ĭ���� Ŀ���� �̵�
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyEventExam();
	}

}