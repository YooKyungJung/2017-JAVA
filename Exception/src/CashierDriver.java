
import java.util.Vector;

class FirstElementException extends Exception {
	String reason;
	public FirstElementException() {
		super();
		reason="���� �����ϴ�.";
	}
	public String toString() {
		return "FirstElementException : " + reason;
	}
}//FirstElementException

class Cashier {
	Vector line = new Vector(10);
	void deleteCustomer() {
		line.remove(0);//ù��° ����
	}
	void getNextCustomer() {
		try {
			if(line.isEmpty()) throw new FirstElementException();
			System.out.println(line.elementAt(0)+"�� ���Ǿ����ϴ�.");
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
		
		cs.addCustomer(new Customer("��1"));
		cs.addCustomer(new Customer("��2"));
		cs.addCustomer(new Customer("��3"));
		
		cs.getNextCustomer();
		cs.getNextCustomer();
		cs.getNextCustomer();
		cs.getNextCustomer();
	}
}//CashierDriver