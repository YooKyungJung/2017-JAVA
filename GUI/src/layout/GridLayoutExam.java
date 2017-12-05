package layout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutExam extends JFrame{
	public GridLayoutExam() {
		super("GridLayout");
		setLayout(new GridLayout(2,3)); //배치 관리자 2줄 3칸 GridLauout 적용
		
		JButton b1=new JButton("버튼1");
		JButton b2=new JButton("버튼2");
		JButton b3=new JButton("버튼3");
		JButton b4=new JButton("버튼4");
		JButton b5=new JButton("버튼5");
		JButton b6=new JButton("버튼6");
		
		add(b1); add(b2); add(b3);
		add(b4); add(b5); add(b6);
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutExam();

	}

}
