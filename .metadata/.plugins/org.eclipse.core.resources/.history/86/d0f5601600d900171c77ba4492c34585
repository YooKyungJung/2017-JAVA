package textbook;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class ChoiceExam2 extends Frame{
	public ChoiceExam2() {
		super("Choice 테스트");
		Panel p=new Panel();
		
		Choice ch_month=new Choice();
		Label label1=new Label("월");
		for(int i=1; i<=12; i++) {
			ch_month.addItem(Integer.toString(i));
		}
		p.add(label1); p.add(ch_month);
		
		Choice ch_day=new Choice();
		Label label2=new Label("일");
		for(int i=1; i<=31; i++) {
			ch_day.addItem(Integer.toString(i));
		}
		p.add(label2); p.add(ch_day);
		
		add(p);
		pack();
		setVisible(true);
	}
	public static void main(String[] args) {
		new ChoiceExam2();

	}

}
