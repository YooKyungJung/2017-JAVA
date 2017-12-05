package car;

class Delar{
	String name="레이";
	int price=2000;
	int rest=10;
	int money=0;
	//재산
	public void sell() {
		
		//재고상태, 판매자 재산
	}                                            
}

class Buyer {
	int money=5000;
	//보유대수
	public void buy() {
		//구매자 재산, 보유 차 대수
	}
}

public class CarMainTest {
	public static void main(String[] args) {
		Delar p1=new Delar();
		Buyer p2=new Buyer();
		p1.sell();
	}
}
