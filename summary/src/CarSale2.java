package car;

class Person{
	int account;//�ڻ�
	}
interface PrintResult {
	public void ResultPrint();
}
class Dealer2 extends Person implements PrintResult{
	String carName; //�� �̸�
	int price; //�� ����
	int inventory=10; //���
	//int account=0; //����
	
	//�ʱ�ȭ �޼���(�����ڸ޼���)
	public Dealer2(String CarName,int price) {
		//super();
		this.carName=CarName;
		this.price=price;
	}
	
	public void carSale(int money) {
		account+=money;
		inventory-=1;
		
	}
	
	public void ResultPrint() {
		System.out.println("�Ǹ��� ���� >> ������� "+inventory+"��, "
				+ "�������� "+account+"��");
	}
}
class Buyer2 extends Person{
	private int money;
	private boolean own;
	public Buyer2(int money) {
	  	this.money=money;
	}
	public void buyCar(Dealer2 dealer, int price) {
		if(price<=account) {
		dealer.carSale(price); //�޼����н�-���ÿ� �Ͼ
		money-=price;
		own=true;
		} else{
			System.out.println("���� ������ �� �����ϴ�.");
		}
	} 
	public void ResultPrint() {
		System.out.println("������ ���� >> �����ܾ�: "+money+"����, "
				+ "������������: "+own);
	}
}
public class CarSale2 {
	public static void main(String args[]) {
		Dealer2 dealer1=new Dealer2("����",3500);
		Dealer2 dealer2=new Dealer2("�ƹݶ�",3500);
		Buyer2 buyer=new Buyer2(5000);
		buyer.buy  ��    Car(dealer1, 3500);
		buyer.ResultPrint();
		buyer.buyCar(dealer2, 3500);

		buyer.ResultPrint();
		dealer2.ResultPrint();
	}
}