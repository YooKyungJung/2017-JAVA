package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ActionEventExam_2 extends JFrame implements ActionListener{
	private JButton b1;
	private JPanel p;
	public ActionEventExam_2() {
		super("ActionEvnet");
		b1=new JButton("¹öÆ°");
		p=new JPanel();
		p.add(b1);
		add(p);
		setSize(300,300);
		setVisible(true);
		b1.addActionListener(this);
	}
	public static void main(String[] args) {
		new ActionEventExam_2();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			System.exit(0);
		}
		
	}
}
