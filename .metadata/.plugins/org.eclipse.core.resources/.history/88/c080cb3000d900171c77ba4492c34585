package byte_base;
import java.io.IOException;
import java.io.InputStream;

public class InputExam {
	public static void streamTest(InputStream is) {
		try {
			while(true) {
				int i=is.read(); //InputStream에서 한 바이트를 읽는다(int형태임)
				if(i==-1) break; 
				char c=(char)i;
				System.out.print(c);
			}
		} catch(IOException e) {
			System.err.print(e);
		}
		System.out.println();
		
	}
	public static void main(String[] args) throws IOException{
		streamTest(System.in);

	}
	
}