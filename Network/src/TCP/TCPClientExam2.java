package TCP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.Buffer;

public class TCPClientExam2 {
	public static void main(String[] args) throws IOException {
		InetAddress ia=InetAddress.getByName("10.96.122.169");
		
		Socket so=new Socket(ia,6000);
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br=new BufferedReader(new InputStreamReader(so.getInputStream()));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(so.getOutputStream()));
		
		while(true) {
			System.out.print("보낼 메시지: ");
			String send_msg=in.readLine();
			bw.write(send_msg+"\n");
			bw.flush();
			
			System.out.println(">>>>> 서버의 메시지를 기다리는 중 <<<<<");
			String get_msg=br.readLine();
			System.out.println("보낸 내용: "+get_msg);
			if(get_msg.equals("exit")) {
				so.close();
				bw.close();
				System.exit(0);
			}
		}
	}
}
