package exercise;
import java.io.*;
import java.util.*;

class Writing {
	void tab_w() {
		try {
			FileReader fr=new FileReader("writing_tab.txt");
			BufferedReader br=new BufferedReader(fr);
			String s;
			String[] school=new String[10];
			String[] address=new String[10];
			String[] phonenumber=new String[10];
			String[] teacher=new String[10];
			String[] student=new String[10];
			do {
				s=br.readLine();
				StringTokenizer parse=new StringTokenizer(s,"\t");
				int length=parse.countTokens()/7;
				for(int i=0; i<length; i++) {
					school[i]=parse.nextToken();
					address[i]=parse.nextToken();
					phonenumber[i]=parse.nextToken();
					teacher[i]=parse.nextToken();
					student[i]=parse.nextToken();
				}//end of For
				for(int i=0; i<length; i++) {
					System.out.print(school[i]+"\t"+address[i]+"\t"+phonenumber[i]+"\t"
							+teacher[i]+"\t"+student[i]);
					System.out.println("");
				}
			}while(s!=null);
			fr.close();
			br.close();	
		} catch(Exception e) { }
	}
}

public class Exx5 {
	public static void main(String[] args) {
		Writing w=new Writing();
		w.tab_w();
	}
}
