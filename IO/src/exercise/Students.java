package exercise;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Students {
	public static void main(String[] args) throws IOException {
		int number;
		String name="";
		String major="";
		
		Scanner scan=new Scanner(System.in);
		System.out.print("�й� �Է�>> "); number=scan.nextInt();
		System.out.print("�̸� �Է�>> "); name=scan.next();
		System.out.print("���� �Է�>> "); major=scan.next();
		
		FileOutputStream fos = new FileOutputStream("students.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeInt(number);
		dos.writeUTF(name);
		dos.writeUTF(major);
		
	}
}
