package textbook;

class SendMessage implements Runnable {
	String message;
	public SendMessage(String message) {
		super();
		this.message = message;
	}
	
	public void say() {
		System.out.print(message+"  ");
	}
	public void sayNtimes(int n) {
		for(int i=0; i<n; i++) {
			say();
		}
	}
	public void run() {
		sayNtimes(10);
	}
	
}
public class Laugh {
	public static void main(String[] args) {
		Thread t1=new Thread(new SendMessage("Ha"));
		Thread t2=new Thread(new SendMessage("Ho"+ ""));
		t1.start();
		t2.start();
		
		//run으로 호출하면 스레드X, 형태만 스레드
	}
}
