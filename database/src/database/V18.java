package database;
import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class V18 extends JFrame implements ActionListener, ItemListener{
	String name="",m="",d="",c="sol",p="";
	boolean g1=false,g2=false,g3=false,g4=false;
	JPanel p1=new JPanel();
	JPanel p2=new JPanel(new FlowLayout());
	JPanel p3=new JPanel();
	
	JLabel lb_name=new JLabel("이 름 ");
	JTextField tf_name=new JTextField(10);
	JButton bt_search=new JButton("검색");
	JLabel lb_birthday=new JLabel("생 일: ");
	
	Choice ch_month=new Choice();
	Choice ch_day=new Choice();
	JLabel lb_month=new JLabel("월 ");
	JLabel lb_day=new JLabel("일 ");
	
	CheckboxGroup b=new CheckboxGroup();
	Checkbox ra_solar=new Checkbox("양력",b,true);
	Checkbox ra_lunar=new Checkbox("음력",b,false);
	
	JLabel lb_phonenum=new JLabel("전화번호: ");
	JTextField tf_phonenum=new JTextField(20);
	JLabel lb_group=new JLabel("그 룹: ");
	JCheckBox ck_school=new JCheckBox("학 교");
	JCheckBox ck_academy=new JCheckBox("학 원");
	JCheckBox ck_town=new JCheckBox("동 네");
	JCheckBox ck_etc=new JCheckBox("기 타");
	
	JTextArea ta_info=new JTextArea(3,25);
	JScrollPane scrollPane = new JScrollPane(ta_info,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	
	JButton bt_save=new JButton("저장");
	JButton bt_del=new JButton("삭제");
	JButton bt_change=new JButton("수정");
	JButton bt_clean=new JButton("초기화");
	
	
	public V18(){
		for(int a=1;a<=12;a++){
			ch_month.addItem(Integer.toString(a));
		}
		for(int a=1;a<=31;a++){
			ch_day.addItem(Integer.toString(a));
		}
		ta_info.setEditable(false);
		
		p1.add(lb_name);
		p1.add(tf_name);
		p1.add(bt_search);
		
		p2.add(lb_birthday);
		p2.add(ch_month);
		p2.add(lb_month);
		p2.add(ch_day);
		p2.add(lb_day);
		p2.add(ra_solar);
		p2.add(ra_lunar);
		p2.add(lb_phonenum);
		p2.add(tf_phonenum);
		p2.add(lb_group);
		p2.add(ck_school);
		p2.add(ck_academy);
		p2.add(ck_town);
		p2.add(ck_etc);
		p2.add(scrollPane);
		
		p3.add(bt_save);
		p3.add(bt_del);
		p3.add(bt_change);
		p3.add(bt_clean);
		
		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.CENTER);
		add(p3,BorderLayout.SOUTH);
		
		setSize(330,270);
		setVisible(true);
		
		bt_search.addActionListener(this);
		ra_solar.addItemListener(this);
		ra_lunar.addItemListener(this);
		bt_save.addActionListener(this);
		bt_del.addActionListener(this);
		bt_change.addActionListener(this);
		bt_clean.addActionListener(this);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new V18();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getStateChange()==ItemEvent.SELECTED){
			if(e.getItem().equals("양력")){
				c="sol";
			}
			else if(e.getItem().equals("음력")){
				c="lun";
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {		
		// TODO Auto-generated method stub
		name=tf_name.getText();
		m=ch_month.getSelectedItem();
		d=ch_day.getSelectedItem();
		p=tf_phonenum.getText();
		g1=false;
		g2=false;
		g3=false;
		g4=false;
		
		if(ck_school.isSelected())
			g1=true;
		if(ck_academy.isSelected())
			g2=true;
		if(ck_town.isSelected())
			g3=true;
		if(ck_etc.isSelected())
			g4=true;
		
		try{
			Class.forName("org.gjt.mm.mysql.Driver");
		}catch(ClassNotFoundException ee){
			System.err.println("DB 연결 드라이버가 없음");
		}
		
		Connection conn=null;
		String url="jdbc:mysql://127.0.0.1:3306/test?useSSL=false";
		String id="root";
		String pw="0903";
		try{
			conn=DriverManager.getConnection(url,id,pw);
		}catch(SQLException ee){
			System.err.println("DB 서버 연결 실패");
		}
		
		Statement stmt=null;
		try{
			stmt=conn.createStatement();
		}catch(SQLException ee){
			System.err.println("작업 처리 객체 생성 실패");
		}
		
		ResultSet rs=null;
		
		if(e.getSource().equals(bt_search)){
			ra_lunar.setState(false);
			ra_solar.setState(false);
			ck_school.setSelected(false);
			ck_academy.setSelected(false);
			ck_town.setSelected(false);
			ck_etc.setSelected(false);
			
			try{
				rs=stmt.executeQuery("select *from t1 where name='"+name+"'");
				if(rs.next()){
					ch_month.select(rs.getString("month"));
					ch_day.select(rs.getString("day"));
					if(rs.getString("birth_option").equals("sol")){
						ra_solar.setState(true);
					}else{
						ra_lunar.setState(true);
					}
					tf_phonenum.setText(rs.getString("phone"));
					if(rs.getString("group1").equals("1")){
						ck_school.setSelected(true);
					}if(rs.getString("group2").equals("1")){
						ck_academy.setSelected(true);
					}if(rs.getString("group3").equals("1")){
						ck_town.setSelected(true);
					}if(rs.getString("group4").equals("1")){
						ck_etc.setSelected(true);
					}
					ta_info.setText("검색 완료");
				}
			}catch(SQLException se){
				System.err.println("검색 명령어 전송 실패"+se.toString());
			}
		}else if(e.getSource().equals(bt_save)){
			try{
				int num=stmt.executeUpdate("insert into t1 values('"+name+"','"+
											m+"','"+d+"','"+c+"','"+p+"',"+g1+","+g2+","+g3+","+g4+")");
				ta_info.setText(num+"개 저장완료");
			}catch(SQLException se){
				System.err.println("명령어 전송 실패");
			}
		}else if(e.getSource().equals(bt_del)){
			try{
				int num=stmt.executeUpdate("delete from t1 where name='"+name+"'");
				ta_info.setText(num+"개 삭제완료");
			}catch(SQLException se){
				System.err.println("명령어 전송 실패");
			}
		}else if(e.getSource().equals(bt_change)){
			try{
				int num=stmt.executeUpdate("update t1 set month='"+
						m+"',day='"+d+"',birth_option='"+c+"',phone='"+p+"',group1="+g1+",group2="+g2+",group3="+g3+",group4="+g4+" where name='"+name+"'");
				ta_info.setText(num+"개 수정완료");
			}catch(SQLException se){
				System.err.println("명령어 전송 실패");
			}
		}else if(e.getSource().equals(bt_clean)){
			tf_name.setText("");
			ch_month.select(0);
			ch_day.select(0);
			ra_solar.setState(true);
			tf_phonenum.setText("");
			ck_school.setSelected(false);
			ck_academy.setSelected(false);
			ck_town.setSelected(false);
			ck_etc.setSelected(false);
			ta_info.setText("");
		}
	}

}