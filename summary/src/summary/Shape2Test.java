package shape2.summary;
//�߻�Ŭ���� + ���
abstract class Shape2{ 
	//�Ӽ�
	String name;
	//������ �޼���
	public Shape2(String name) {
		this.name=name;
	}
	//�޼���
	public abstract void getSurroundings();
	public abstract void getArea();
}

class Circle2 extends Shape2 {
	private double r;//�ܺ�(��������)���� ������ ���ٲٰ� private
	final double PI=3.14;
	//������ �޼���
	public Circle2(String name, double r) {
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
class Square2 extends Shape2 {
	private double w, h;
	//������ �޼���
		public Square2(String name, double w, double h) {
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
public class Shape2Test {
	public static void main(String[] args) {
		//�����ڵ�-����ڿ��� �������� �ڵ�
		Circle2 c2=new Circle2("�ﰢ��",5); //�����ſ��� ū�� ����ȯ �ڵ�!
		Square2 s2=new Square2("�簢��",2,10);
		c2.getSurroundings();c2.getArea();
		s2.getSurroundings();s2.getArea();
		
	}
}