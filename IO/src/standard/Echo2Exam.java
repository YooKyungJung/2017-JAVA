package standard;

import java.io.IOException;

public class Echo2Exam {
	public static void main(String args[]) throws IOException /*������ ������ JVM���� �ñ�ڴ�*/{
		int bt;
		try {
			while((bt=System.in.read())!=-1) {
				System.out.print((char)bt);
			}
		} catch(IOException e) {
			System.err.println(e);
		}
	}
}
