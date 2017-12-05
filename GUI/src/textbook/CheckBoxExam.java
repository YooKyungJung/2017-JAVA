package textbook;

import java.awt.*;

public class CheckBoxExam extends Frame{
	public CheckBoxExam() {
		super();
		Panel p=new Panel();
		Checkbox ck1=new Checkbox("사과"); //체크박스생성
		Checkbox ck2=new Checkbox("딸기", true);
		Checkbox ck3=new Checkbox("키위");
		p.add(ck1);
		p.add(ck2);
		p.add(ck3);
		add(p);
		setSize(400,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new CheckBoxExam();

	}

}
