package TCP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.Buffer;

public class TCPClientExam {
	public static void main(String[] args) throws IOException {
		InetAddress ia=InetAddress.getByName("127.0.0.1");
		Socket so=new Socket(ia,5000);
		System.out.print("보낼 메시지: ");
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String msg=in.readLine();
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(so.getOutputStream()));
		bw.write(msg+"\n");
		bw.flush();
		bw.close();
	}
}
