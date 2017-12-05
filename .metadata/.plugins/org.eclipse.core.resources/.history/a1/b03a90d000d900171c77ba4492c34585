package exercise;

class SendMessage extends Thread {
	String message;
	public SendMessage(String message) {
		super();
		this.message = message;
	}
	
	public void say() {
		System.out.print(message+"  ");
	}
	public void sayNtimes(int n) throws InterruptedException {
		for(int i=0; i<n; i++) {
			say();
			Thread.sleep(1000);
		}
	}
	public void run() {
		try {
			sayNtimes(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
public class Laugh {
	public static void main(String[] args) {
		SendMessage s1=new SendMessage("Ha");
		SendMessage s2=new SendMessage("Ho");
		s1.start();
		s2.start();
		//겨ㅜ
		//run으로 호출하면 스레드X, 형태만 스레드
	}
}
