package bank_1;

class Account {
	int balance; //잔액
	public Account() { //계좌 생성
		super();
		balance=0;
	}
	public void deposit(int amount) { //입금
		balance+=amount;
	}
	public void withdraw(int amount) { //출금
		balance-=amount;
	}
	public int getBalance() {
		return balance;
	}
}

public class Transaction implements Runnable{
	private Account acc; //계좌 보호
	public Transaction(Account acc) {
		super();
		this.acc = acc;
	}
	public static void main(String[] args) {
		Account acc=new Account();
		System.out.println("예금 전 잔액: "+acc.getBalance()+"원");
		Transaction tr=new Transaction(acc);
		Thread th1=new Thread(tr);
		th1.start(); //10000원 입금 => 스레드 동작
		tr.run(); //10000원 입금 => main 스레드 동작
		System.out.println("예금 후 잔액: "+acc.getBalance()+"원");
	}

	@Override
	public void run() {
		try {
			deposit(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void deposit(int i) throws InterruptedException {
		acc.deposit(i);
		Thread.sleep(1);
	}

}
