package exercise;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Panel;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AddText extends JFrame{
	public AddText(){
		super("텍스트 입력기");
		Container cont = getContentPane(); // 각종 스타일(CSS와 같이) -> 속성 값들을 얻어오는 역할
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		Panel p3 = new Panel();
		JTextArea ta = new JTextArea(8,20);
		ta.setBorder(BorderFactory.createLineBorder(Color.RED));
		JTextField tf = new JTextField(20);
		tf.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		JButton insert = new JButton("추가한다");
		JButton delete = new JButton("지운다");
		cont.setLayout(new BorderLayout());
		p1.add(ta);
		p2.add(tf);
		p3.add(insert);
		p3.add(delete);
		cont.add(p1, BorderLayout.NORTH);
		cont.add(p2, BorderLayout.CENTER);
		cont.add(p3, BorderLayout.SOUTH);
		pack();
		//setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AddText();
	}

}
