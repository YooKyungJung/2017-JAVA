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
	public static void main(String[] args) //throws IOException <- ����ó�� {
		//throws => �ڱ⸦ ȣ���� ���� ����ó���� �ѱ�
		//�޼ҵ尡 ���ιۿ� ����. �ڱ� �ڽŹۿ� ������ JVM���� �Ѱ���
		FileReader fr=new FileReader("datar.txt"); //char������ �о����
		FileWriter fw=new FileWriter("dataw.txt"); //char������ ��
		int c;
		while((c=fr.read())!=-1) {
			fw.write(c);
		}
	}
}
*/