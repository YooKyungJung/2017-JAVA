package Club;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Main.SelectMenu;

public class MirimClub extends JFrame {
	private JLabel label;
	private JLabel label_img;
	private JButton[] clubbtn = new JButton[3];
	private String[] img = {"/club_1.png", "/club_2.png","/club_3.png"};
	Image[] btnimg = new Image[3]; 
	private JButton backbtn = new JButton("");
	private Image back_img = new ImageIcon(SelectMenu.class.getResource("/back_white.png")).getImage();
	
	public MirimClub() {
		setTitle("동아리");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280, 750);
		setLocationRelativeTo(null); //창 중앙에 띄우기
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(null);
		getContentPane().add(contentPane);
		label = new JLabel("");
		label_img = new JLabel("");
		label_img.setLocation(270, 0);
		Image title_img = new ImageIcon(this.getClass().getResource("/club_title.png")).getImage();
		for(int i=0;i<3;i++) {
			clubbtn[i] = new JButton("");
			btnimg[i] = new ImageIcon(this.getClass().getResource(img[i])).getImage();
		}
		label.setSize(1280,720);
		label_img.setSize(756,550);
		Image img = new ImageIcon(this.getClass().getResource("/Wallpaper.png")).getImage();
		contentPane.add(label_img);
		contentPane.add(label);
		
		label.setIcon(new ImageIcon(img));
		label_img.setIcon(new ImageIcon(title_img));
		
		//동아리 분류 버튼 
		clubbtn[0].setBounds(250, 565, 214, 93);
		clubbtn[1].setBounds(550, 565, 214, 93);
		clubbtn[2].setBounds(850, 565, 214, 93);
		
		for(int i=0;i<3;i++) {
			clubbtn[i].setIcon(new ImageIcon(btnimg[i]));
			clubbtn[i].setBorderPainted(false);
			clubbtn[i].setContentAreaFilled(false);
			clubbtn[i].setFocusPainted(false);
			label.add(clubbtn[i]);
		}
		setBackbtn(backbtn);
		//버튼에 클릭 이벤트 넣어주기
		clubbtn[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clubbtn[0].setVisible(false);
				setVisible(false);
				CaClub cc = new CaClub();
				cc.setVisible(true);
			}
		});
				
		clubbtn[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clubbtn[1].setVisible(false);
				setVisible(false);
				ResearchClub rc=new ResearchClub();
				rc.setVisible(true);
			}
		});
				
		clubbtn[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clubbtn[2].setVisible(false);
				setVisible(false);
				AllClub ac = new AllClub();
				ac.setVisible(true);
			}
		});
	}
	//뒤로가기 버튼
	public void setBackbtn(JButton j) {
		
		j.setIcon(new ImageIcon(back_img));
		j.setBounds(5,5,100,70);
		j.setBorderPainted(false);
		j.setContentAreaFilled(false);
		j.setFocusPainted(false);
		label.add(j);
		
		backbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                backbtn.setVisible(false);
                setVisible(false);
                SelectMenu sm = new SelectMenu();
                sm.setVisible(true);
            }
        });
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
