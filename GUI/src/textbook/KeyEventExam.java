package textbook;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventExam extends Frame implements KeyListener{
	private TextField jumin1;
	private Label lb;
	private TextField jumin2;
	private Panel p;
	public KeyEventExam() {
		super("Key Evnet");
		jumin1=new TextField(10);
		lb=new Label("-",Label.CENTER);
		jumin2=new TextField(10);
		p=new Panel();
		p.add(jumin1); p.add(lb); p.add(jumin2); add(p);
		setSize(300,100);
		setVisible(true);
		//Ű���� �Է��� �� ��ü(jumin1)�� �̺�Ʈ �ڵ鷯(addKeyListener)�� ������
		jumin1.addKeyListener(this);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyEventExam();
	}
	@Override
	//Ű�� ������ ���� �̺�Ʈ�� ����� �����Ѵ�.
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==e.VK_LEFT) {
			jumin2.setText("Left ����");
		}
	}
	@Override
	//Ű�� ���ȴٰ� �������� ���� �̺�Ʈ�� ����� ������
	public void keyReleased(KeyEvent e) {
		if(jumin1.getText().trim().length()==6) {
			jumin2.requestFocus(); //���� ĭ���� Ŀ���� �̵�
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		//�߻� �޼ҵ� �̹Ƿ�, ������� �ʾƵ� �����ؾ� �Ѵ�.
		
	}

}
