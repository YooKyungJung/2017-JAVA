package object_test;

class Value {
	int number;
	public Value(int number) {
		super();
		this.number = number;
	}
}

public class EqualsEx1 {
	public static void main(String[] args) {
		Value n1=new Value(5); //���������� primitive �ƴ� int n=5; ��   primitive
		Value n2=new Value(5);
		
		if(n1.equals(n2)) {//���� �������ִ� equals�� �������� ��			
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
			}
		System.out.println(n1.toString());
		System.out.println(n2.toString());
		
		n1=n2;
		
		if(n1.equals(n2)) {//���� �������ִ� equals�� �������� ��			
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
			}
		System.out.println(n1.toString());
		System.out.println(n2.toString());		
	}	
}