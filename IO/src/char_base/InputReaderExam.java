package char_base;
import java.io.*;

public class InputReaderExam {
	public static void main(String[] args) {
		Reader reader=new InputStreamReader(System.in); //Reader는 추상클래스
		//Reader가 상위클래스이기때문에 가능
		try {
			while(true) {
				int i=reader.read();
				if(i==-1) break;
				char c=(char)i;
				System.out.print(c);
			}//endOfWhile
		}catch(IOException e) {
			System.err.print(e);
		}//endOfTry
	}
}
