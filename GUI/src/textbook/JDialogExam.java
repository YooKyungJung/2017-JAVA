package textbook;

import java.awt.Dialog;
import java.awt.Frame;

import javax.swing.JFrame;

public class JDialogExam  extends JFrame{
	public JDialogExam() {
		super("Dialog");
		Dialog jd=new Dialog(this,"다이얼로그");
		setSize(300,100);
		setVisible(true);
		jd.setSize(200,50);
		jd.setVisible(true);
		//j프레임은 저절로 닫는거 지가알아서
	}
	public static void main(String[] args) {
		new JDialogExam();
	}
}
