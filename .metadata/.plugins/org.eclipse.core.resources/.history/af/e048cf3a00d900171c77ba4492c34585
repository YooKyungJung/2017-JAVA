package layout;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class V_13 extends JFrame {
	public V_13(){
			super("친구정보"); //setTitle
			Container cont = getContentPane();
			JPanel p1 = new JPanel();
			JPanel p2 = new JPanel();
			JPanel p3 = new JPanel();
			cont.setLayout(new BorderLayout());
			JLabel name = new JLabel("이름");
			JTextField tf1 = new JTextField(8);
			tf1.selectAll();
			JButton search = new JButton("검색");
			p1.add(name);
			p1.add(tf1);
			p1.add(search);
			cont.add(p1, BorderLayout.NORTH);
			JTextArea ta2 = new JTextArea(8,30);
			
			JScrollPane sp = new JScrollPane(ta2, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			p2.add(sp);
			cont.add(p2, BorderLayout.CENTER);
			cont.add(p3, BorderLayout.SOUTH);
			JButton save = new JButton("저장");
			JButton delete = new JButton("삭제");
			JButton update = new JButton("수정");
			p3.add(save);
			p3.add(delete);
			p3.add(update);
			pack();
			setVisible(true);
	}
	public static void main(String[] args) {
		new V_13();
	}

}
