package Subject;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Subject.MirimSubject;
import Main.SelectMenu;

public class SecondSubject extends JFrame implements ActionListener {
	private int id = 0;
	public static int key[];
	private JLabel label, label_img;
	private JButton[] majorbtn = new JButton[3]; // �а� ��ư
	private JButton[] subjectBtn;
	private String[] img = { "/experience_1.png", "/experience_2.png", "/experience_3.png" };
	Image[] btnimg = new Image[3];
	private JButton backbtn = new JButton("");
	private Image back_img = new ImageIcon(SelectMenu.class.getResource("/back_white.png")).getImage();
	private String[] sub; // ���� �̸�
	int i = 0;
	int row;
	int grade_num;
	String major[] = new String[] { "���ͷ�Ƽ��̵��", "���̵�������", "���̵��ַ��" };
	private JLabel subjectLabel = new JLabel("");

	public SecondSubject(int grade_num) { // �а� ���� ��ȣ
		this.grade_num = grade_num;
		setTitle("2�г� ����");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280, 750);
		setLocationRelativeTo(null); // â �߾ӿ� ����
		JPanel p = new JPanel();
		p.setBorder(new EmptyBorder(0, 0, 0, 0));
		p.setLayout(null);
		p.add(subjectLabel);
		getContentPane().add(p);
		label = new JLabel("");
		label_img = new JLabel("");

		label_img.setLocation(270, 0);
		for (int i = 0; i < 3; i++) {
			majorbtn[i] = new JButton("");
			btnimg[i] = new ImageIcon(this.getClass().getResource(img[i])).getImage();
		}
		label.setSize(1280, 720);
		Image img = new ImageIcon(this.getClass().getResource("/Wallpaper.png")).getImage();
		p.add(label_img);
		p.add(label);

		label.setIcon(new ImageIcon(img));
		majorbtn[0].setBounds(250, 70, 214, 93);
		majorbtn[1].setBounds(550, 70, 214, 93);
		majorbtn[2].setBounds(850, 70, 214, 93);

		for (int i = 0; i < 3; i++) {
			majorbtn[i].setIcon(new ImageIcon(btnimg[i]));
			majorbtn[i].setBorderPainted(false);
			majorbtn[i].setContentAreaFilled(false);
			majorbtn[i].setFocusPainted(false);
			label.add(majorbtn[i]);
		}
		setBackbtn(backbtn);
		subjectLabel.setBounds(180, 250, 900, 300);
		subjectLabel.setLayout(new GridLayout(3, 4));
		majorbtn[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				majorbtn[0].setVisible(false);
				setVisible(false);
				SecondSubject ss = new SecondSubject(0);
				ss.setVisible(true);

			}
		});
		majorbtn[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				majorbtn[1].setVisible(false);
				setVisible(false);
				SecondSubject ss = new SecondSubject(1);
				ss.setVisible(true);
			}
		});
		majorbtn[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				majorbtn[2].setVisible(false);
				setVisible(false);
				SecondSubject ss = new SecondSubject(2);
				ss.setVisible(true);
			}
		});
		try {
			String DBName = "MirimGuideBook";
			String dbURL = "jdbc:mysql://10.96.122.177:3306/" + DBName + "?autoReconnect=true&useSSL=false";
			String SQL = "select id, name_sub from subject where grade=2 and major='" + major[grade_num] + "';";
			System.out.println(SQL);
			Connection con = DriverManager.getConnection(dbURL, "root", "mirim546"); // ����
			System.out.println("��񿬰�Ϸ�");
			Statement stmt = con.createStatement();

			stmt.execute("use " + DBName + ";");
			ResultSet result = stmt.executeQuery(SQL);
			java.sql.ResultSetMetaData rsmd = result.getMetaData();
			result.last();
			row = result.getRow();
			result.beforeFirst();
			sub = new String[row];
			subjectBtn = new JButton[row];
			key = new int[row];
			while (result.next()) {
				id = result.getInt("id");
				sub[i] = result.getString("name_sub");
				subjectBtn[i] = new JButton(sub[i]);
				subjectBtn[i].setBounds(60, 75 * (3 + i), 200, 50);
				subjectBtn[i].setFont(new Font("KoPub����ü Medium", Font.PLAIN, 15));
				subjectBtn[i].setBackground(new Color(166, 165, 160));
				subjectBtn[i].addActionListener(this);
				subjectLabel.add(subjectBtn[i]);
				key[i] = id;
				i++;
			}
			result.close();
			stmt.close();
			con.close();

		} catch (SQLException sqle) {
			System.out.println("SQLException: " + sqle.getMessage());
			System.out.println("SQLState: " + sqle.getSQLState());
		}
	}

	// �� ��ư���� �̺�Ʈ����
	@Override
	public void actionPerformed(ActionEvent e) {
		for (int j = 0; j < row; j++)
			if (e.getSource() == subjectBtn[j]) {
				IntroSub is = new IntroSub(key[j], sub[j]);
				System.out.println(sub[j]);
				is.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				is.setTitle(subjectBtn[j].getText());
				is.addWindowListener(new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						is.setVisible(false);
						is.dispose();
					}
				});

			}
	}

	public void setBackbtn(JButton j) {

		j.setIcon(new ImageIcon(back_img));
		j.setBounds(5, 5, 100, 70);
		j.setBorderPainted(false);
		j.setContentAreaFilled(false);
		j.setFocusPainted(false);
		label.add(j);

		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				backbtn.setVisible(false);
				setVisible(false);
				MirimSubject ms = new MirimSubject();
				ms.setVisible(true);
			}
		});
	}

	public static void main(String[] args) {
	}

}