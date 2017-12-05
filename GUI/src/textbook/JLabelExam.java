package textbook;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JLabelExam extends JFrame{
	public JLabelExam() {
		super("Label");
		JPanel p=new JPanel();
		
		JLabel label1=new JLabel("레이블1");
		JLabel label2=new JLabel("레이블2", JLabel.CENTER);
		
		label1.setOpaque(true);
		label1.setForeground(Color.yellow);
		label2.setOpaque(true);
		label2.setForeground(Color.blue);
		p.add(label1);
		p.add(label2);
		add(p);
		setSize(300,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JLabelExam();
	}

}
