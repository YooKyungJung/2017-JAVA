package test;

import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Test1 extends JFrame{
	public Test1() {
		super("test");
		JPanel jp=new JPanel();

		JLabel label1=new JLabel("아이디");
		label1.setSize(100, 50);
		label1.setOpaque(true);
		label1.setBackground(Color.blue);
		JTextField id=new JTextField(15);
		jp.add(label1); jp.add(id);

		JLabel label2=new JLabel("비밀번호", JLabel.CENTER);
		label2.setOpaque(true);
		label2.setBackground(Color.blue);
		JPasswordField pw=new JPasswordField(15);
		pw.setEchoChar('*');
		jp.add(label2); jp.add(pw);
		
		JLabel que1=new JLabel("1. 당신의 관심분야는? (여러개 선택가능)");
		JCheckBox ck1=new JCheckBox("news");
		JCheckBox ck2=new JCheckBox("sports");
		JCheckBox ck3=new JCheckBox("movies");
		JCheckBox ck4=new JCheckBox("music");
		jp.add(que1); jp.add(ck1); jp.add(ck2); jp.add(ck3); jp.add(ck4);
		
		JLabel que2=new JLabel("2. 얼마나 자주 극장에 가십니까?");
		ButtonGroup bg=new ButtonGroup();
		JRadioButton ra1=new JRadioButton("한달에 한번");
		JRadioButton ra2=new JRadioButton("일주일에 한번");
		JRadioButton ra3=new JRadioButton("거의 안간다");
		jp.add(que2); bg.add(ra1); bg.add(ra2); bg.add(ra3);
		jp.add(ra1); jp.add(ra2); jp.add(ra3);
		
		JLabel que3=new JLabel("3. 좋아하는 계절은?");
		JList list=new JList();
		String[] season= {"봄", "여름","가을","겨울"};
		list=new JList<>(season);
		jp.add(que3); jp.add(list);
		
		JLabel que4=new JLabel("4. 하고싶은 말을 남기세요.");
		JTextArea ta1=new JTextArea("입력:",3,30);
		jp.add(que4); jp.add(ta1);
		
		add(jp);
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Test1();
	}

}
