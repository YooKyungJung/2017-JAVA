package shape3.summary;

//���+�������̽� => ����
class Shape3{ 
	//�Ӽ�
	String name;
	//������ �޼���
	public Shape3(String name) {
		this.name=name;
	}
}
interface getFunction{
	//�޼���
	//�������̽��� ����������X >> �ڵ�����  public, �������̽����� ��� ����
	//������ �޼��� X
	void getSurroundings();
	void getArea();
}

class Circle3 extends Shape3 implements getFunction{
	private double r;//�ܺ�(��������)���� ������ ���ٲٰ� private
	final double PI=3.14;
	//������ �޼���
	public Circle3(String name, double r) {
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
class Square3 extends Shape3 implements getFunction{
	private double w, h;
	//������ �޼���
		public Square3(String name, double w, double h) {
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
public class Shape3Test {
	public static void main(String[] args) {
		//�����ڵ�-����ڿ��� �������� �ڵ�
		Circle3 c3=new Circle3("�ﰢ��",5); //�����ſ��� ū�� ����ȯ �ڵ�!
		Square3 s3=new Square3("�簢��",5,4);
		
		c3.getSurroundings();c3.getArea();
		s3.getSurroundings();s3.getArea();
		
	}
}