package textbook;

import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;

public class V_7 extends Frame{
	public V_7() {
		super("리스트");
		Panel p=new Panel();
		List list1=new List(7, false);
		list1.add("월");
		list1.add("화");
		list1.add("수");
		list1.add("목");
		list1.add("금");
		list1.add("토");
		list1.add("일");
		p.add(list1);
		add(p);
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new V_7();
	}

}
