package poly;
import java.util.Scanner;

class Student {
	String major;
	public Student(String major) {
		super();//object�� ������ �޼��� 
		this.major = major;
	}
	public void performTask() {
		System.out.println("������ �����մϴ�.");
	}
}

class Inter extends Student{
	public Inter(String major) {
		super(major); //����Ŭ������ �����ڸ޼��� ȣ��
		//super(major)�� �޼��� ȣ�� super.major�� ��������ȣ��/ .�տ��� ���������� ��//cf)super.major
	}
	public void performTask() {//�������̵�
		System.out.println("���� ������Ʈ�� �����մϴ�.");
	}
}

class Design extends Student {
	public Design(String major) {
		super(major);
	}
	public void performTask() {
		System.out.println("���� ������ �۾��� �����մϴ�.");
	}
}

class Solu extends Student {
	public Solu(String major) {
		super(major);
	}
	public void performTask() {
		System.out.println("�� ������Ʈ�� �����մϴ�.");
	}
}

public class Poly_Test {
	public static void main(String[] args) {
		/*Inter s1=new Inter("���ͷ�Ƽ��̵���");
		Design s2=new Design("���̵������ΰ�");
		Solu s3=new Solu("���̵��ַ�ǰ�");*/
		/*switch(num) {
		case 1: s1.performTask(); break;
		case 2: s2.performTask();  break;
		case 3: s3.performTask(); break;
		}*/
		Student st=null; //�� ���� ������ �� �ִ� Ŭ���� Ÿ��>������ ������ �����Ҽ��ִ�. �ݴ�� X
		
		while(true) {
		System.out.println("�а��� �������ּ���, ����=> 1 ������=> 2 �ַ��=> 3: ���α׷� ����=> 4");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		switch(choice){
			case 1:st=new Inter("���ͷ�Ƽ��̵���"); break;
			case 2:st=new Design("���̵������ΰ�"); break;
			case 3:st=new Solu("���̵��ַ�ǰ�"); break;
			case 4:System.out.println("���α׷��� �����մϴ�"); return;
			default: System.out.println("�а� ������ �߸��Ǿ����ϴ�.");
			}
		st.performTask();//���� ���ص� �� ������ �Ⱥ��Ѵ�..!!
		}
	}
}