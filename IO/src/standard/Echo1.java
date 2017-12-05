package standard;

import java.io.IOException;

public class Echo1 {
	public static void main(String args[]) throws IOException /*에러가 나오면 JVM에게 맡기겠다*/{
		int bt;
		try {
			bt=System.in.read();
			System.out.print((char)bt);
		} catch(IOException e) {
			System.err.println(e);
		}
	}
}
