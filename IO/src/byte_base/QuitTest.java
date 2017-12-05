package byte_base;
import java.io.*;
public class QuitTest {

	public static void main(String[] args) {
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			FileWriter fw=new FileWriter("QuitTest.txt");
			while(true) {
				String str=br.readLine();
				if(str.equalsIgnoreCase("q")) break;
				// (str.toUpperCase()).matches("Q")
				fw.write(str);
				fw.flush();
			}
		}catch(IOException e) { }
	}

}
