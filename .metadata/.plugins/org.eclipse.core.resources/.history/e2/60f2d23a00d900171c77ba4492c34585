package exercise;

import java.awt.BorderLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class TransWeight{
	String kg;
	double kgInt;
	double pound;
	
	public void trans(TextField weight){
			// TODO Auto-generated method stub
			kg = weight.getText();
			kgInt = Double.parseDouble(kg);
			pound = kgInt*2.2046;
			weight.setText(String.valueOf(pound));
	}
}
public class WeightTrans extends JFrame implements ActionListener, KeyListener{
	JLabel text = new JLabel("당신의 몸무게를 입력하세요.");
	TextField weight = new TextField(15);
	JPanel p = new JPanel();
	JButton trans = new JButton("변환");
	TransWeight tw = new TransWeight();
	public WeightTrans(){
		setLayout(new BorderLayout());
		add(p);
		p.add(text);
		p.add(weight);
		p.add(trans);
		
		setSize(350,200);
		trans.addActionListener(this);
		weight.addKeyListener(this);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new WeightTrans();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==e.VK_ENTER){
			tw.trans(weight);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		tw.trans(weight);
	}
	
}