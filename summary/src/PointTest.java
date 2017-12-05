package test_1;

class Point {
	double x,y; //��ǥ��
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public String toString() { 
		//toString�� ���������� public ����Ÿ���� String
		//������Ʈ�� ����մ�  toString�� �������̵�, ������Ʈ�� ����Ÿ���� String���� �Ǿ�����
		return "�� (" + x + ", y=" + y + ")";
	}
}

interface Distance {
	public void getDistance(Point p);
}

class NamePoint extends Point implements Distance{
	//Point��� Distance����
	String name;
	public NamePoint(String name, double x, double y) {
		super(x, y);//super�� 1�� ���ο� �;���
		this.name = name;
	}
	public void getDistance(Point p) {
		double dist;
		dist=Math.sqrt(Math.pow(x-p.x, 2)+(y-p.y)*(y-p.y));
		//sqrt=��Ʈ pow=����
		System.out.println("�� �� ������ �Ÿ�: "+dist);
	}
	public String toString() { 
		return "����" + name + "�� ��ǥ(" + x + ", "+y+")";
	}
}

public class PointTest {
	public static void main(String[] args) {
		NamePoint p1=new NamePoint("��1",2,3);
		System.out.println(p1);
		NamePoint p2=new NamePoint("��2",4.2,5.7);
		System.out.println(p2);
		p1.getDistance(p2);
	}
}
