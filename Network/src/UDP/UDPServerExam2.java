package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServerExam2 {

	public static void main(String[] args) throws IOException {
		DatagramSocket ds=new DatagramSocket(10);
		byte[] data=new byte[65508];
		
		DatagramPacket dp=new DatagramPacket(data, data.length);
		System.out.println("UDP���� ��� ��");
		
		ds.receive(dp);
		String msg=new String(dp.getData()).trim();
		
		System.out.println("���� �ּ�: "+dp.getAddress());
		System.out.println("���� �޽���: "+msg);

	}

}