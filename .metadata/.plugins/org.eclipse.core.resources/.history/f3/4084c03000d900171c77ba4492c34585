package exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

class sungDataRWExam {
	int length;
	String[] name=new String[10];
	String[] address=new String[10];
	double[] math=new double[10];
	double[] english=new double[10];
	double[] total=new double[10];
	double[] avg=new double[10];
	public void writingData(String fname, boolean append) throws IOException {
		FileWriter fw=null;
		BufferedWriter bw=null;
		try {
			fw=new FileWriter(new File(fname));
			bw=new BufferedWriter(fw);
			for(int j=0; j<length; j++) {
				bw.write(name[j]+"\t"+address[j]+"\t"+math[j]+"\t"+english[j]+"\t"+total[j]+"\t"+avg[j]);
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
			length=parse.countTokens()/4;
			for(int i=0; i<length; i++) {
				name[i]=parse.nextToken();
				address[i]=parse.nextToken();
				math[i]=Double.valueOf(parse.nextToken()).doubleValue();
				english[i]=Double.valueOf(parse.nextToken()).doubleValue();
				total[i]=math[i]+english[i];
				avg[i]=total[i]/2.0;
			}//end of For
		}catch(FileNotFoundException e) {
			System.out.print("잘못된 파일 이름을 입력했습니다");
		}//End of Catch
	}
}

public class WritingDatasMain {
	public static void main(String[] args) {
		sungDataRWExam wd=new sungDataRWExam();
		try {
			wd.readingData("writied.txt");
			wd.writingData("writing.txt", false);
		}catch(IOException e) {
			e.printStackTrace();
		}//End of Catch

	}
}