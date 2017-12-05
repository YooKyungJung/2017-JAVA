package exercise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//�������̽� => �� �ϳ��� �߻� �޼ҵ� actionPerformed
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class FileView {

	public static void main(String[] args) {
		JFrame window = new JFrame("���� ���"); //�����츦 ����, "���Ϻ��" -> ����
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//�����츦 close�� ���: system exit
		window.setContentPane(new ViewFileGUI());
		//�Ӽ� �ʱ�ȭ: �Ϲ������� �����ڸ޼���� �Բ� ���
		window.pack(); //�ڵ����� ������ ������ ���� �Ǵ� ���� �ֱ��� ������� 
		window.setVisible(true); //ȭ�鿡 ���̱�_������ ȭ�鿡 �Ⱥ���
	}
}//endOfFileView

class ViewFileGUI extends JPanel {
		JTextArea ta=new JTextArea(25, 80);
		JFileChooser fc=new JFileChooser();
		
		public ViewFileGUI() {
			JButton openButton=new JButton("����");
			openButton.addActionListener((ActionListener)new OpenAction());
			//��ư�� �̹�Ʈ ������ �ޱ�
			this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS)); 
			//�гο� ��ư�� �ؽ�Ʈ ������� ��ġ�� ������
			this.add(openButton);
			this.add(new JScrollPane(ta));
		}//end ViewFileGUI constructor
		
	class OpenAction implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			int retval=fc.showOpenDialog(ViewFileGUI.this); //open file ���â ����
			if(retval==JFileChooser.APPROVE_OPTION) { //���ÿ���(true, false �� ����)
				File file=fc.getSelectedFile(); //�ߺ������� ����ϸ鼭 ���ð��� ����
				try {
					Scanner scan=new Scanner(file);
					String line;
					ta.setText("");
					
					while(scan.hasNextLine()) {
						line=scan.nextLine();
						ta.append(line); //�ؽ�Ʈ ���� �����ֱ�
					} //while
				} catch(FileNotFoundException e) {
					System.out.println("���� ����");
				} //catch
			}//if
		}//actionPerformed
	}//OpenAction
	
	}//end of viewFileGUI