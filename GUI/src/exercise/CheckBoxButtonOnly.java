package exercise;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxButtonOnly extends JFrame{
	private JCheckBox bold, italic;
	private JButton ok, cancel;
	public CheckBoxButtonOnly() {
		super("간단한 화면");
		setSize(200,100);
		Container cont = getContentPane();
		bold = new JCheckBox("고딕체");
		cont.add(bold);
		italic = new JCheckBox("이텔릭체");
		cont.add(italic);
		ok = new JButton("확인");
		cont.add(ok);
		cancel = new JButton("취소");
		cont.add(cancel);
		cont.setLayout(new FlowLayout());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBoxButtonOnly fr = new CheckBoxButtonOnly();
		fr.setVisible(true);
	}

}
