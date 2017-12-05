package exercise;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KeyEventExam extends JFrame implements KeyListener{
	private JTextField jumin1;
	private JLabel lb;
	private JTextField jumin2;
	private JPanel p;
	public KeyEventExam() {
		super("Key Event");
		jumin1=new JTextField(10);
		lb=new JLabel("-",JLabel.CENTER);
		jumin2=new JTextField(10);
		p=new JPanel();
		p.add(jumin1); p.add(lb); p.add(jumin2); add(p);
		setSize(300,100);
		setVisible(true);
		//키보드 입력이 될 객체(jumin1)에 이벤트 핸들러(addKeyListener)를 연결함
		jumin1.addKeyListener(this);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyEventExam();
	}
	@Override
	//키가 눌렸을 때의 이벤트의 기능을 구현한다.
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==e.VK_LEFT) {
			jumin2.setText("Left 눌림");
		}
	}
	@Override
	//키가 눌렸다가 떼어졌을 때의 이벤트의 기능을 구현함
	public void keyReleased(KeyEvent e) {
		if(jumin1.getText().trim().length()==6) {
			jumin2.requestFocus(); //다음 칸으로 커서를 이동
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		//추상 메소드 이므로, 사용하지 않아도 정의해야 한다.
		
	}

}
