package exercise;
import java.io.*;

public class StudentsData {

	public static void main(String[] args) {
		int number;
		String name;
		String major;
		
		
		try {
			FileInputStream fis=new FileInputStream("students.dat");
			DataInputStream dis=new DataInputStream(fis);
			
			number=dis.readInt();
			System.out.println("학번: "+ number);
			name=dis.readUTF();
			System.out.println("이름: "+ name);
			major=dis.readUTF();
			System.out.println("전공: "+ major);
			
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
