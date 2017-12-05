package shape4.summary;
//�߻�Ŭ���� + ���
abstract class Shape4{ 
	//�Ӽ�
	String name;
	//������ �޼���
	public Shape4(String name) {
		this.name=name;
	}
	//�޼���
	public abstract void getSurroundings();
	public abstract void getArea();
}

class Circle4 extends Shape4 {
	private double r;//�ܺ�(��������)���� ������ ���ٲٰ� private
	final double PI=3.14;
	//������ �޼���
	public Circle4(String name, double r) {
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

class Square4 extends Shape4 {
	private double w, h;
	//������ �޼���
		public Square4(String name, double w, double h) {
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

class Control{ //ĸ��ȭ
	public void control(Shape4 s4){//�Ķ���� > reference����
		//�Ķ���� > int a, String name
		//Shape4�� Ŭ���� Ÿ���̸鼭�� ������ Ÿ��!
		s4.getArea();//c4,s4>>Circle4,Square4>>Shape4
		s4.getSurroundings();
	}
}

public class Shape4Test {
	public static void main(String[] args) {
		//�����ڵ�-����ڿ��� �������� �ڵ�
		Circle4 c4=new Circle4("�ﰢ��",5); //�����ſ��� ū�� ����ȯ �ڵ�!
		Square4 s4=new Square4("�簢��",2,10);
		Control ctrl=new Control();
		ctrl.control(c4);
		ctrl.control(s4);
	}
}