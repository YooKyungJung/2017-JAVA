package textbook;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class PanelExam extends Frame{
	public PanelExam() {
		Panel p=new Panel();
		p.setBackground(Color.blue);
		p.setSize(300,200);
		this.add(p); //this ��������
		setSize(500,300); //�����ӻ�����
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PanelExam();
	}
}
