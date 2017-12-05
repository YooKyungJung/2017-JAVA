package exercise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//인터페이스 => 딱 하나의 추상 메소드 actionPerformed
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
		JFrame window = new JFrame("파일 뷰어"); //윈도우를 생성, "파일뷰어" -> 제목
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//윈도우를 close할 경우: system exit
		window.setContentPane(new ViewFileGUI());
		//속성 초기화: 일반적으로 생성자메서드와 함께 사용
		window.pack(); //자동으로 윈도우 사이즈 셋팅 또는 가장 최근의 사이즈로 
		window.setVisible(true); //화면에 보이기_없으며 화면에 안보임
	}
}//endOfFileView

class ViewFileGUI extends JPanel {
		JTextArea ta=new JTextArea(25, 80);
		JFileChooser fc=new JFileChooser();
		
		public ViewFileGUI() {
			JButton openButton=new JButton("열기");
			openButton.addActionListener((ActionListener)new OpenAction());
			//버튼에 이미트 리스터 달기
			this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS)); 
			//패널에 버튼과 텍스트 에어리어의 배치와 모양잡기
			this.add(openButton);
			this.add(new JScrollPane(ta));
		}//end ViewFileGUI constructor
		
	class OpenAction implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			int retval=fc.showOpenDialog(ViewFileGUI.this); //open file 명령창 열기
			if(retval==JFileChooser.APPROVE_OPTION) { //선택여부(true, false 값 리턴)
				File file=fc.getSelectedFile(); //중복선택을 허용하면서 선택값을 리턴
				try {
					Scanner scan=new Scanner(file);
					String line;
					ta.setText("");
					
					while(scan.hasNextLine()) {
						line=scan.nextLine();
						ta.append(line); //텍스트 에어리어에 보여주기
					} //while
				} catch(FileNotFoundException e) {
					System.out.println("파일 없음");
				} //catch
			}//if
		}//actionPerformed
	}//OpenAction
	
	}//end of viewFileGUI