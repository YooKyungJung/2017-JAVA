package car;

class Delar{
	String name="����";
	int price=2000;
	int rest=10;
	int money=0;
	//���
	public void sell() {
		
		//������, �Ǹ��� ���
	}                                            
}

class Buyer {
	int money=5000;
	//�������
	public void buy() {
		//������ ���, ���� �� ���
	}
}

public class CarMainTest {
	public static void main(String[] args) {
		Delar p1=new Delar();
		Buyer p2=new Buyer();
		p1.sell();
	}
}
