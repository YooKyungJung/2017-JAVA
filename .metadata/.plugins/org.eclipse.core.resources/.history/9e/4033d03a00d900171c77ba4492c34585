package exercise;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


class AddTextPanel extends JPanel{
	private JTextArea textArea;
	private JTextField inputLine;
	private JButton addButton, clearButton;
	
	//생성자 메소드 : GUI를 설정한다.
	public AddTextPanel(){
		textArea = new JTextArea(10,20);
		textArea.setBorder(BorderFactory.createLineBorder(Color.RED));
		textArea.setEditable(false);
		
		inputLine = new JTextField(20);
		
		JPanel panel = new JPanel();
		addButton = new JButton("추가한다");
		clearButton = new JButton("지운다");
		setLayout(new BorderLayout());
		
		panel.add(textArea);
		panel.add(inputLine);
		panel.add(addButton);
		panel.add(clearButton);
		
		add(panel);
		setPreferredSize(new Dimension(250,270));
		setBackground(Color.WHITE);
		
		addButton.addActionListener(new AddTextListener());
		clearButton.addActionListener(new AddTextListener());
		
	}
	private class AddTextListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==addButton){
				textArea.append(inputLine.getText());
				inputLine.setText("");
			}
			else if(e.getSource()==clearButton){
				textArea.setText("");
				inputLine.setText("");
			}
			else{
				textArea.append(inputLine.getText());
				inputLine.setText("");
			}
		}
		
	}
}
	public class AddText_Event{
		public static void main(String[] args){
			JFrame frame = new JFrame("텍스트 입력기");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			AddTextPanel panel = new AddTextPanel();
			frame.getContentPane().add(panel);
			frame.pack();
			frame.setVisible(true);
		}
	}