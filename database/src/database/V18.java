package database;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
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
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class V18 extends Frame implements ActionListener{
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();
	JPanel p4=new JPanel();
	JPanel p5=new JPanel();
	JPanel p6=new JPanel();
	
	
	JLabel lb_name=new JLabel("�� ��");
	TextField tf_name =new TextField(10);
	JButton bt_search=new JButton("�˻�");
	JLabel lb_birth=new JLabel("�� ��");
	Choice ch_month=new Choice();
	JLabel lb_month=new JLabel("��");
	Choice ch_day=new Choice();
	JLabel lb_day=new JLabel("��");
	CheckboxGroup g=new CheckboxGroup();
	Checkbox cb1=new Checkbox("���", g,true);
	Checkbox cb2=new Checkbox("����", g,false);
	JLabel lb_phone=new JLabel("��ȭ��ȣ:");
	TextField tf_phone=new TextField(30);
	
	JLabel lb_group = new JLabel("�� �� : "); //�׷� ��
	Checkbox cb_g1= new Checkbox("�� ��", true);
	Checkbox cb_g2 = new Checkbox("�� ��");
	Checkbox cb_g3 = new Checkbox("�� ��");
	Checkbox cb_g4 = new Checkbox("�� Ÿ");
	
	JButton bt_save=new JButton("����");
	JButton bt_delete=new JButton("����");
	JButton bt_modify=new JButton("����");
	JTextArea ta=new JTextArea(2,40);
	
	public V18(){
		super("ģ������");
		
		p1.add(lb_name);
		p1.add(tf_name);
		p1.add(bt_search);
		for(int i=1; i<=12; i++) {
			ch_month.addItem(Integer.toString(i));
		}
		for(int i=1; i<=31; i++) {
			ch_day.addItem(Integer.toString(i));
		}
		
		p2.add(lb_birth);
		p2.add(ch_month);
		p2.add(ch_day);
		p2.add(lb_day);
		p2.add(cb1);
		p2.add(cb2);
		p3.add(lb_phone);
		p3.add(tf_phone);
		p4.add(lb_group);
		p4.add(cb_g1); p4.add(cb_g2); p4.add(cb_g3); p4.add(cb_g4);
		p5.add(bt_save); p5.add(bt_delete); p5.add(bt_modify);
		p6.setLayout(new GridLayout(4,1));
		p6.setBackground(Color.yellow);
		
		p6.add(p2); p6.add(p3); p6.add(p4); p6.add(ta);
		add(p1,BorderLayout.NORTH);
		add(p6,BorderLayout.CENTER);
		add(p5,BorderLayout.SOUTH);
		
		setSize(350,250);
		setVisible(true);
		
		addWindowListener(new MyClass());
		bt_save.addActionListener(this);
		bt_delete.addActionListener(this);
		bt_search.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		String str_name = tf_name.getText();
		String str_month  =ch_month.getSelectedItem();
		String str_day = ch_day.getSelectedItem();
		String str_cb = null;
		
		
		if(cb1.getState())
			str_cb = cb1.getLabel();
		else 
			str_cb = cb2.getLabel();
		String str_phone = tf_phone.getText();
		String str_group ="";
		
		if(cb_g1.getState())
			str_group = str_group + cb_g1.getLabel();
		if(cb_g2.getState())
			str_group = str_group + cb_g2.getLabel();
		if(cb_g3.getState())
			str_group = str_group + cb_g3.getLabel();
		if(cb_g4.getState())
			str_group = str_group + cb_g4.getLabel();
			
		try{
			Class.forName("org.gjt.mm.mysql.Driver");
		}catch(ClassNotFoundException ee){
			System.out.println("DB ���� ����̹� ����");
		}
		
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/test?useSSL=false";
		String id = "root";
		String pw = "0903";
		try{
			conn = DriverManager.getConnection(url,id,pw);
		}catch(SQLException ee){
			System.err.println("DB ���� ���� ����");
		}
		Statement stmt = null;
		try{
			stmt = conn.createStatement();
		}catch(SQLException ee){
			System.out.println("�۾� ó�� ��ü ���� ����");
		}
		
		ResultSet rs = null;
		
		
		if(ae.getSource() == bt_search){
			cb1.setState(false);cb2.setState(false);
			cb_g1.setState(false);cb_g2.setState(false);
			cb_g3.setState(false);cb_g4.setState(false);
			
			try{
				rs = stmt.executeQuery("select * from t1 where name = '"+str_name+"'");
				if(rs.next()){
					ch_month.select(rs.getString("month"));
					ch_day.select(rs.getString("day"));
					if(rs.getString("birth_option").equals("���")){
						cb1.setState(true);
					}else{
						cb2.setState(true);
					}
					tf_phone.setText(rs.getString("phone"));
					if(rs.getString("group1").equals("1")){
						cb_g1.setState(true);
					}if(rs.getString("group2").equals("1")){
						cb_g2.setState(true);
					}if(rs.getString("group3").equals("1")){
						cb_g3.setState(true);
					}if(rs.getString("group4").equals("1")){
						cb_g4.setState(true);
					}
				}
			}catch(SQLException ee){
				System.err.println("�˻� ���ɾ� ���� ����" + ee.toString());
			}
		}else if(ae.getSource() ==bt_save){
			try{
				int num = stmt.executeUpdate("insert into t1 values('"+str_name + "'" + "," 
			+ str_month +"," + str_day + ",'" + str_cb + "','" + str_phone + "'," + cb_g1.getState() +"," + cb_g2.getState()
			+ "," + cb_g3.getState() + "," + cb_g4.getState() +")");
				ta.setText("���ԿϷ�!");
				System.out.println(num + "�� ���� ���� ");
			}catch(SQLException ee){
				System.err.println("���ɾ� ���� ����,,");
			}
		}else if(ae.getSource() == bt_modify){
			try{
				int num = stmt.executeUpdate("update t1 set month ="+str_month + ", day= " + str_day +", "
						+ "birth_option = ' " + str_cb+"'"+", phone = '" + str_phone+"'"  +",group1 = " + cb_g1.getState() + ", group2 = " + cb_g2.getState() +", group3 = " + cb_g3.getState()
						+", group4 = " + cb_g4.getState() + " where name = '" + str_name +"';");
				ta.setText("�����Ϸ�!");
				System.out.println(num +"���� ���� ����");
			}catch(SQLException ee){
				System.err.println("���ɾ� ���� ����,,");
			}
		}else if(ae.getSource() == bt_delete){
			try{
				int num = stmt.executeUpdate("delete from t1 where name = '" + str_name + "'");
				ta.setText("�����Ϸ�!");
				System.out.println(num +"���� ���� ����");
			}catch(SQLException ee){
				System.err.println("���ɾ� ���� ����,,");
			}
		}
		
		try{
			stmt.close();
			conn.close();
		}catch(SQLException ee){
			System.out.println("���� ���� ����,,");
		}
	}
	public static void main(String[] args) {
		new V18();
	}

}

class MyClass extends WindowAdapter{
	public void WindowClosing(WindowEvent e){
		System.exit(0);
	}
}