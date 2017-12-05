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
		//키보드 입력이 될 객체(jumin1)에 이벤트 핸들러(addKeyListener)를 연결함
		jumin1.addKeyListener(new MyClass());
	}
	
	class MyClass extends KeyAdapter{
		//키가 눌렸을 때의 이벤트의 기능을 구현한다.
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			if(e.getKeyCode()==e.VK_LEFT) {
				jumin2.setText("Left 눌림");
			}
		}
		//키가 눌렸다가 떼어졌을 때의 이벤트의 기능을 구현함
		public void keyReleased(KeyEvent e) {
			if(jumin1.getText().trim().length()==6) {
				jumin2.requestFocus(); //다음 칸으로 커서를 이동
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyEventExam();
	}

}