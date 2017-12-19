package UDP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPClientExam2 {

	public static void main(String[] args) throws IOException {
		while(true) {
			System.out.print("���� �޽���: ");
			BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
			String msg=in.readLine();
			
			DatagramPacket dp=new DatagramPacket(msg.getBytes(), msg.getBytes().length, InetAddress.getByName("10.96.122.197"), 10);
			
			DatagramSocket ds=new DatagramSocket();
			ds.send(dp);
		}
	}

}
