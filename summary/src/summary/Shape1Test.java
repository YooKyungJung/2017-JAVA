package shape1.summary;
//���
class Shape1 {
	//�Ӽ�
	String name;
	//������ �޼���
	public Shape1(String name) {
		this.name=name;
	}
	//�޼���
	public void getSurroundings() {
		System.out.println(name+"�� ���� "); //�ٵ���� Ŭ���� = �߻�Ŭ����
	}
	public void getArea() {
		System.out.println(name+"�� �ѷ� ");
	}
}
class Circle1 extends Shape1 {
	private double r;//�ܺ�(��������)���� ������ ���ٲٰ� private
	final double PI=3.14;
	//������ �޼���
	public Circle1(String name, double r) {
		super(name);
		this.r=r;
	}
	//�޼��� �������̵�
	public void getSurroundings() {
		 System.out.println(name+"�� ����: "+(PI*r*r));
	}
	public void getArea() {
		System.out.println(name+"�� �ѷ�: "+(PI*2*r));
	}
}
class Square1 extends Shape1 {
	private double w, h;
	//������ �޼���
		public Square1(String name, double w, double h) {
			super(name);
			this.w=w;
			this.h=h;
		}
	//�޼��� �������̵�
	public void getSurroundings() {
		System.out.println(name+"�� ���̴�: "+(w*h));
	}
	public void getArea() {
		System.out.println(name+"�� �ѷ���: "+2*(w+h));
	}
}
public class Shape1Test {
	public static void main(String[] args) {
		//�����ڵ�-����ڿ��� �������� �ڵ�
		Circle1 c1=new Circle1("�ﰢ��",5); //�����ſ��� ū�� ����ȯ �ڵ�!
		Square1 s1=new Square1("�簢��",5,4);
		
		c1.getSurroundings();c1.getArea();
		s1.getSurroundings();s1.getArea();
		
	}
}

/*
package shape1.summary;
class Shape1 {
	String name; 
	void getSurroundings() {
	
	}
	void getArea() {
	
	}
}
class Circle1 extends Shape1 {
	double r;
	public Circle1(String name, double r) {
		this.name=name;
		this.r=r;
	}
	void getSurroundings() {
	//	return 3.14*2*r;
	}
	void getArea() {
		//return 3.14*r*r;
	}
}
class Square1 extends Shape1 {
	int w, h;
	public Square1(String name, int w, int h) {
		this.name=name;
		this.w=w;
		this.h=h;
	}
	void getSurroundings() {
		//2*(w+h);
		System.out.println(name+"�� ���̴� ")
	}
	void getArea() {
		//w*h;
	}
}
public class Shape1Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle1 c1=new Circle1();
		c1.getSurroundings();
		c1.
		//Square1 s1=new Square1("�簢��",5,4);
		
	}
}*/