package exercise;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ItemEventExam2 extends JFrame implements ItemListener, ActionListener{
	JPanel p1=new JPanel();
	JTextArea ta=new JTextArea(7,15);
	JButton btn=new JButton("닫기");
	JCheckBox[] fruit=new JCheckBox[3]; 
	//awt에서 getItem은 Object형태
	//JFrame 에서 JCheckBox같은 경우에는  index 형태
	//구분 X -> 배열에 넣어준다.
	String[] fr_s={"키위","사과","딸기"};
	
	public ItemEventExam2() {
		super("액션이벤트");
		for(int i=0; i<3; i++) {
			fruit[i]=new JCheckBox(fr_s[i]);
			p1.add(fruit[i]);
			fruit[i].addItemListener(this);
		}
		btn.addActionListener(this);
		add(p1, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String args[]) {
		new ItemEventExam2();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange()==ItemEvent.SELECTED) {
			if(e.getItem()==fruit[0]){
				ta.append(fr_s[0]+"가 선택됨\n\n");
			} else if(e.getItem()==fruit[1]){
				ta.append(fr_s[1]+"가 선택됨\n\n");
			} else {
				ta.append(fr_s[2]+"가 선택됨\n\n");
			}
		}
		
		if(e.getStateChange()==ItemEvent.DESELECTED) {
			if(e.getItem()==fruit[0]){
				ta.append(fr_s[0]+"가 취소됨\n\n");
			} else if(e.getItem()==fruit[1]){
				ta.append(fr_s[1]+"가 취소됨\n\n");
			} else {
				ta.append(fr_s[2]+"가 취소됨\n\n");
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn) {
			System.exit(0);
		};
	}
}
