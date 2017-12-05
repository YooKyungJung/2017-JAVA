package layout;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutExam extends JFrame{
	public FlowLayoutExam() {
		super("FlowLayout");
		//각종 스타일 적용시 쓰는 메소드- 속성 값들을 얻어오는 역할
		Container cont=getContentPane();
		cont.setLayout(new FlowLayout());
		cont.add(new JButton("버튼1"));
		cont.add(new JButton("버튼2"));
		cont.add(new JButton("버튼3"));
		pack();
		//setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new FlowLayoutExam();
	}
}
