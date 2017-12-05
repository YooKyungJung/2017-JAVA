package exercise;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class V18 extends JFrame implements ActionListener, ItemListener{
	JPanel p1=new JPanel(new FlowLayout());
	JPanel p2=new JPanel(new FlowLayout());
	JPanel p3=new JPanel(new FlowLayout());
	JPanel p4=new JPanel(new FlowLayout());
	JPanel p5=new JPanel(new FlowLayout());
	JPanel p6=new JPanel(new FlowLayout());
	
	JTextArea result =new JTextArea(10,20);
	
	JLabel namelabel = new JLabel("이  름"); //이름 라벨
	JTextField name = JTextField(10); //이름
	JButton namebutton = new JButton("검색"); //이름 검색
	
	JLabel birthlabel = new JLabel(); //생일 라벨
	Choice month=new Choice();
	Choice day = new Choice();
	
	JLabel monthlabel = new JLabel("월 ");
	JLabel daylabel = new JLabel("일 ");
	
	JRadioButton NotLunar = new JRadioButton("양력", true); //양력 체크박스
	JRadioButton Lunar = new JRadioButton("음력", true); //음력 체크박스
	
	JLabel tellabel = new JLabel("전화번호 : "); //전화번호 라벨
	JTextField tel = new JTextField(20); //전화번호

	JLabel group = new JLabel("그룹 : "); //그룹 라벨
	JCheckBox school = new JCheckBox("학교");
	JCheckBox academy = new JCheckBox("학원");
	JCheckBox around = new JCheckBox("동네");
	JCheckBox some = new JCheckBox("기타");
	
	JButton save;
	JButton del;
	JButton resave;
	
	
	public V18(){
		
		super("친구정보");
		setLayout(new FlowLayout());
		p1=new JPanel();
		namelabel=new JLabel("이  름");
		name=new JTextField(10);
		namebutton=new JButton("검색");

		p1.add(namelabel);
		p1.add(name);
		p1.add(namebutton);
		add(p1);
		
		p2=new JPanel();
		birthlabel=new JLabel("생  일 : ");
		for(int a=1; a<=12; a++){
			month.addItem(Integer.toString(a));
		}
		p2.add(month);

		day = new Choice();
		monthlabel = new JLabel("월 ");
		
		for(int a=1; a<=31; a++){
			day.addItem(Integer.toString(a));
		}
		p2.add(day);
		daylabel = new JLabel("일 ");
		
		NotLunar = new JRadioButton("양력");
		Lunar = new JRadioButton("음력");
		
		p2.add(birthlabel);
		p2.add(month);
		p2.add(monthlabel);
		p2.add(day);
		p2.add(daylabel);
		p2.add(NotLunar);
		p2.add(Lunar);
		add(p2);
		
		p3=new JPanel();
		tellabel=new JLabel("전화번호 : ");
		tel=new JTextField(10);
		
		p3.add(tellabel);
		p3.add(tel);
		add(p3);
		
		p4=new JPanel();
		group=new JLabel("그  룹 : ");
		school=new JCheckBox("학교");
		academy=new JCheckBox("학원");
		around=new JCheckBox("동네");
		some=new JCheckBox("기타");
		p4.add(group);
		p4.add(school);
		p4.add(academy);
		p4.add(around);
		p4.add(some);
		
		add(p4);
		
		p5=new JPanel();
		result=new JTextArea(3,20);
		p5.add(result);
		add(p5);
	
		
		p6=new JPanel();
		save=new JButton("저장");
		del=new JButton("삭제");
		resave=new JButton("수정");
		p6.add(save);
		p6.add(del);
		p6.add(resave);
		add(p6);
		
		setSize(320,340);
		setVisible(true);
		
		save.addActionListener(this); //this인 이유 - implements 자기 자신이 액션리스너를 구현하기 때문에
		
	}
//	public JTextField getName() {
//		return name;
//	}
	public void setName(JTextField name) {
		this.name = name;
	}
	public Choice getMonth() {
		return month;
	}
	public void setMonth(Choice month) {
		this.month = month;
	}
	public Choice getDay() {
		return day;
	}
	public void setDay(Choice day) {
		this.day = day;
	}
	public JRadioButton getNotLunar() {
		return NotLunar;
	}
	public void setNotLunar(JRadioButton notLunar) {
		NotLunar = notLunar;
	}
	public JRadioButton getLunar() {
		return Lunar;
	}
	public void setLunar(JRadioButton lunar) {
		Lunar = lunar;
	}
	public JTextField getTel() {
		return tel;
	}
	public void setTel(JTextField tel) {
		this.tel = tel;
	}
	public JCheckBox getSchool() {
		return school;
	}
	public void setSchool(JCheckBox school) {
		this.school = school;
	}
	public JCheckBox getAcademy() {
		return academy;
	}
	public void setAcademy(JCheckBox academy) {
		this.academy = academy;
	}
	public JCheckBox getAround() {
		return around;
	}
	public void setAround(JCheckBox around) {
		this.around = around;
	}
	public JCheckBox getSome() {
		return some;
	}
	public void setSome(JCheckBox some) {
		this.some = some;
	}
	private JTextField JTextField(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args) {
		new V18();

	}
	@Override
	 public void actionPerformed(ActionEvent e) 
	 { 
	   if(e.getSource() == save) 
	   { 
	     result.setText(""+name); //결과 라벨에 계산후 저장            
	  } 
	}
	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}