package byte_base;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamExam {
	public static void main(String[] args) throws IOException{
		byte[] b= new byte[1024];
		FileInputStream fis = new FileInputStream("tin.txt");
		FileOutputStream fos = new FileOutputStream("tout.txt");
		fis.read(b);
		fos.write(b);
		fis.close();
		fos.close();
	}

}
