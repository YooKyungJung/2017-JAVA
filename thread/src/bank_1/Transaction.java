package bank_1;

class Account {
	int balance; //�ܾ�
	public Account() { //���� ����
		super();
		balance=0;
	}
	public void deposit(int amount) { //�Ա�
		balance+=amount;
	}
	public void withdraw(int amount) { //���
		balance-=amount;
	}
	public int getBalance() {
		return balance;
	}
}

public class Transaction implements Runnable{
	private Account acc; //���� ��ȣ
	public Transaction(Account acc) {
		super();
		this.acc = acc;
	}
	public static void main(String[] args) {
		Account acc=new Account();
		System.out.println("���� �� �ܾ�: "+acc.getBalance()+"��");
		Transaction tr=new Transaction(acc);
		Thread th1=new Thread(tr);
		th1.start(); //10000�� �Ա� => ������ ����
		tr.run(); //10000�� �Ա� => main ������ ����
		System.out.println("���� �� �ܾ�: "+acc.getBalance()+"��");
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