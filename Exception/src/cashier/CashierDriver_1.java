package cashier;

import java.util.Vector;

class Customer {
	String name;
	Customer(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}//Customer

class Queue {
	Vector q=new Vector(10);
	public boolean isEmpty() {
		return q.isEmpty();
	}
	public Object dequeue() throws QueueEmptyException {
		if(isEmpty()==true) {
			throw new QueueEmptyException();
		}
		Object obj=q.firstElement();
		q.removeElement(obj);
		return obj;
	}
	public void enqueue(Object obj) {
		q.addElement(obj);
	}
}

class QueueEmptyException extends Exception {
	public QueueEmptyException() {}
	public QueueEmptyException(String msg) {
		super(msg);
	}
}
class Cashier {
	Queue customerQueue=new Queue();
	public void addCustomer(Customer customer) {
		customerQueue.enqueue(customer);
	}
	public void getNextCustomer() {
		Customer cust;
		try {
			cust=(Customer)(customerQueue.dequeue());
			System.out.println(cust.getName()+"님이 계산하셨습니다.");
		} catch(QueueEmptyException e) {
			System.out.println("기다리는 고객이 없어서 계산할 수 없습니다.");
		}
	}

}


public class CashierDriver_1 {

	public static void main(String[] args) {
		Cashier cs=new Cashier();
		//줄서기
		cs.addCustomer(new Customer("고객1"));
		cs.addCustomer(new Customer("고객2"));
		cs.addCustomer(new Customer("고객3"));
		//서비스(계산)하기
		cs.getNextCustomer();
		cs.getNextCustomer(); 
		cs.getNextCustomer();
		cs.getNextCustomer(); //예외발생
	}

}
