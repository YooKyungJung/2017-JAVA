package exercise;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class DivideByThreePanel extends JPanel{
	private JLabel prompt;
	private JTextField number;
	private JButton check;
	public DivideByThreePanel() {
		prompt = new JLabel("정수 값을 입력하세요.");
		add(prompt);
		number = new JTextField(12);
		add(number);
		check = new JButton("검사");
		add(check);
		
		setPreferredSize(new Dimension(300,12));
		setBackground(Color.WHITE);
		setLayout(new FlowLayout());
		setVisible(true);
		
			NumberListener nl = new NumberListener();
			check.addActionListener(nl);
	}
	
	private class NumberListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String text = number.getText();
			int num = Integer.parseInt(text);
			if(num%3==0)
				number.setText("3의 정수 입니다");
			else
				number.setText("3의 정수가 아닙니다");
			
			
		}
		
	}
}

public class DivideByThreeEvent{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("3의 배수 확인");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DivideByThreePanel panel = new DivideByThreePanel();
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}