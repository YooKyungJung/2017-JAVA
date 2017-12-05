package car;

class Person{
	int account;//자산
	}
interface PrintResult {
	public void ResultPrint();
}
class Dealer2 extends Person implements PrintResult{
	String carName; //차 이름
	int price; //차 가격
	int inventory=10; //재고
	//int account=0; //수입
	
	//초기화 메서드(생성자메서드)
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
		System.out.println("판매자 상태 >> 현재재고 "+inventory+"대, "
				+ "재정상태 "+account+"원");
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
		dealer.carSale(price); //메세지패싱-동시에 일어남
		money-=price;
		own=true;
		} else{
			System.out.println("차를 구입할 수 없습니다.");
		}
	} 
	public void ResultPrint() {
		System.out.println("구매자 상태 >> 현재잔액: "+money+"만원, "
				+ "차량소유여부: "+own);
	}
}
public class CarSale2 {
	public static void main(String args[]) {
		Dealer2 dealer1=new Dealer2("레이",3500);
		Dealer2 dealer2=new Dealer2("아반떼",3500);
		Buyer2 buyer=new Buyer2(5000);
		buyer.buy  ㅓ    Car(dealer1, 3500);
		buyer.ResultPrint();
		buyer.buyCar(dealer2, 3500);

		buyer.ResultPrint();
		dealer2.ResultPrint();
	}
}