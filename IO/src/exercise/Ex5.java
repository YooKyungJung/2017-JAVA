package exercise;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

class writingText {
	int length;
	String[] name=new String[10];
	String[] address=new String[10];
	String[] phoneNumber=new String[10];
	//int[] teacher=new int[3];
	//int[] student=new int[3];
	
	public void writingData(String fname, boolean append) throws IOException {
		FileWriter fw=null;
		BufferedWriter bw=null;
		try {
			fw=new FileWriter(new File(fname));
			bw=new BufferedWriter(fw);
			for(int j=0; j<length; j++) {
				//z.write(name[j]+"\t"+address[j]+"\t"+phoneNumber[j]+
					//	"\t"+teacher[j]+"\t"+student[j]);*/
				bw.write(name[j]+"\t"+address[j]+"\t"+phoneNumber[j]);
				bw.newLine();
			}
			bw.close();
			fw.close();
		}catch(FileNotFoundException e) {
			System.out.println("잘못된 파일 이름을 입력했습니다");
		}
	}
	
	public void readingData(String fname) throws IOException {
		try{
			String csvStr="";
			String tmpStr="";
			FileReader fr=new FileReader(new File(fname));
			BufferedReader br=new BufferedReader(fr);
			do {
				tmpStr=br.readLine();
				if(tmpStr!=null) {
					csvStr+=tmpStr+"\t";
				}
			}while(tmpStr!=null);
			
			StringTokenizer parse=new StringTokenizer(csvStr,"\t");
			length=parse.countTokens()/3;
			for(int i=0; i<length; i++) {
				name[i]=parse.nextToken();
				address[i]=parse.nextToken();
				phoneNumber[i]=parse.nextToken();
				//teacher[i]=Integer.valueOf(parse.nextToken()).intValue();
				//student[i]=Integer.valueOf(parse.nextToken()).intValue();
			}//end of For
		}catch(FileNotFoundException e) {
			System.out.print("잘못된 파일 이름을 입력했습니다");
		}//End of Catch
	}
}


public class Ex5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writingText wt=new writingText();
		try {
			wt.readingData("ming.txt");
			wt.writingData("mingming.txt", false);
		}catch(IOException e) {
			e.printStackTrace();
		}//End of Catch
	}

}
