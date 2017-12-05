package exercise;
import java.io.*;

public class BufferedInputExam {

	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		try {
			str=br.readLine();
		} catch(Exception ie) {
			System.out.println("Error: "+ie.toString());
		}
		System.out.println(str);

	}

}
