package byte_base;
import java.io.*;

public class LineNumber {
	public static void main(String[] args) {
		try {
			FileReader fr=new FileReader(args[0]);
			BufferedReader br=new BufferedReader(fr);
			int num=1;
			String lyrics;
			while(true) {
				lyrics=br.readLine();
				if(lyrics!=null) break;
				System.out.println(num+" "+lyrics);
				num++;
			}
				

		}catch(IOException ie) { }
	}
}
