
import java.util.Vector;

class FirstElementException extends Exception {
	String reason;
	public FirstElementException() {
		super();
		reason="고객이 없습니다.";
	}
	public String toString() {
		return "FirstElementException : " + reason;
	}
}//FirstElementException

class Cashier {
	Vector line = new Vector(10);
	void deleteCustomer() {
		line.remove(0);//첫번째 삭제
	}
	void getNextCustomer() {
		try {
			if(line.isEmpty()) throw new FirstElementException();
			System.out.println(line.elementAt(0)+"님 계산되었습니다.");
			deleteCustomer();
		}catch(FirstElementException fee) {
			System.out.println(fee.toString());
		}
	}
	void addCustomer(Customer customer) {
		line.addElement(customer.name);
	}
}//Cashier

class Customer {
	String name;
	Customer(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}//Customer

public class CashierDriver {
	public static void main(String[] args) {
		Cashier cs=new Cashier();
		
		cs.addCustomer(new Customer("고객1"));
		cs.addCustomer(new Customer("고객2"));
		cs.addCustomer(new Customer("고객3"));
		
		cs.getNextCustomer();
		cs.getNextCustomer();
		cs.getNextCustomer();
		cs.getNextCustomer();
	}
}//CashierDriver