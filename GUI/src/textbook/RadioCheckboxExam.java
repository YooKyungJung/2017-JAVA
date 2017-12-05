package textbook;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Panel;

public class RadioCheckboxExam extends Frame{
	public RadioCheckboxExam() {
		super("라디오버튼형");
		Panel p1=new Panel();
		CheckboxGroup g=new CheckboxGroup();
		Checkbox ra1=new Checkbox("여자", g, false);
		Checkbox ra2=new Checkbox("남자", g, true);
		Checkbox ra3=new Checkbox("어린이", g, false);
		
		p1.add(ra1);
		p1.add(ra2);
		p1.add(ra3);
		
		add(p1);
		setSize(300,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new RadioCheckboxExam();
	}
}
