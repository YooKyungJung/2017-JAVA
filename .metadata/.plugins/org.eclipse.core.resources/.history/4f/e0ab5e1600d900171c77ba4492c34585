package textbook;

import java.awt.ScrollPane;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JTextAreaExam extends JFrame{
	public JTextAreaExam() {
		super("JtextArea");
		JPanel p=new JPanel();
		JTextArea ta1=new JTextArea("first",3,30); //스크롤 없는 것이 디폴트
		JTextArea ta2=new JTextArea("second",6,10);
		//ta2 TextArea에 스크롤바 나타내기
		JScrollPane sp = new JScrollPane(ta2, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		//HORIZOTNTAL_SCROLLBA_ALWAYS
		p.add(ta1); p.add(sp);
		add(p);
		setSize(500,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JTextAreaExam();

	}
}
