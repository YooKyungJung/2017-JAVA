//170718 p.149
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExam {
	public static void main(String[] args) {
		try {
			FileReader fr=new FileReader("datar.txt"); 
			FileWriter fw=new FileWriter("dataw.txt"); 
			int c;
			while((c=fr.read())!=-1) {
				fw.write(c);
			}
		}catch(Exception e) {
				System.out.println(e.toString());
		}
	}
}

/*
public class FileExam {
	public static void main(String[] args) //throws IOException <- 예외처리 {
		//throws => 자기를 호출한 곳에 예외처리를 넘김
		//메소드가 메인밖에 없다. 자기 자신밖에 없으니 JVM에게 넘겨줌
		FileReader fr=new FileReader("datar.txt"); //char단위로 읽어오고
		FileWriter fw=new FileWriter("dataw.txt"); //char단위로 씀
		int c;
		while((c=fr.read())!=-1) {
			fw.write(c);
		}
	}
}
*/