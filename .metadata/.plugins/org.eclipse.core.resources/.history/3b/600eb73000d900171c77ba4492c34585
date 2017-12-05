package IO_PRO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

interface result{
	public void sum(int length, double kor[], double math[], double java[], double cplus[]);
	public void avg(int length, double total[]);
	public void rank(int length, double avg[]);
	public void readData(String filename);
	public void printData(int length, String major[], String number[], String name[], double kor[], double math[], double java[], double cplus[], double total[], double avg[],int rank[]);
}

class Handler1{
	String filename;
	public void ctr(Score s){
		s.readData(filename);
	}
}

class Score implements result{
	String major[] = new String[10];
	String number[] = new String[10];
	String name[] = new String[10];
	double kor[] = new double[10];
	double math[] = new double[10];
	double java[] = new double[10];
	double cplus[] = new double[10];
	double[] total = new double[10];
	double[] avg = new double[10];
	int rank[] = new int[10];
	String filename;
	int length;
	public Score(String filename){
		super();
		this.filename = filename;
	}
	public void readData(String filename){
		try {
			String tmpStr="", csvStr="";
			FileReader fr = new FileReader("student.txt");
			BufferedReader br = new BufferedReader(fr);
			do{
				tmpStr=br.readLine();
				if(tmpStr!=null){
					csvStr+=tmpStr+"\t";
				}
			}while(tmpStr!=null);
			StringTokenizer parse=new StringTokenizer(csvStr,"\t");
			length=parse.countTokens()/7;
			for(int i=0;i<length;i++){
			major[i] = parse.nextToken();
			number[i] = parse.nextToken();
			name[i] = parse.nextToken();
			kor[i] = Double.valueOf(parse.nextToken()).doubleValue();
			math[i] = Double.valueOf(parse.nextToken()).doubleValue();
			java[i] = Double.valueOf(parse.nextToken()).doubleValue();
			cplus[i] = Double.valueOf(parse.nextToken()).doubleValue();
			}
			sum(length, kor, math, java, cplus);
			avg(length, total);
			rank(length,avg);
			printData(length, major, number, name, kor, math, java, cplus, total, avg, rank);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void sum(int length, double kor[], double math[], double java[], double cplus[]){
		for(int i=0;i<length;i++){
			total[i]=kor[i]+math[i]+java[i]+cplus[i];
		}
	}
	
	public void avg(int length, double total[]){
		for(int i=0;i<length;i++){
			avg[i]=total[i]/4.0;
		}
		
	}
		
	public void rank(int length, double avg[]) {
		for(int i=0; i<length; i++) rank[i]=1;
		for(int i=0; i<length; i++) {
			for(int j=0; j<length; j++) if (total[i] < total[j]) rank[i]++;
		}		
	}
	public void printData(int length, String major[], String number[], String name[], double kor[], double math[], double java[], double cplus[], double total[], double avg[], int rank[]) {
		System.out.println("학과\t학번\t이름\t국어\t수학\t자바\tC++\t총점\t평균\t등수");
		int k=0;
		for(int i=0; i<length; i++) {
			k++;
			for(int j=0; j<length; j++) {
				if(rank[j]==k) {
					System.out.print(major[j] + "\t");
					System.out.print(number[j] + "\t");
					System.out.print(name[j] + "\t");
					System.out.print(kor[j] + "\t");
					System.out.print(math[j] + "\t");
					System.out.print(java[j] + "\t");
					System.out.print(cplus[j] + "\t");
					System.out.print(total[j] + "\t");
					System.out.print(avg[j] + "\t");
					System.out.println(rank[j]);
				}
			}//for j
		}//for i
	}
}

public class GradeMain {
	public static void main(String[] args) {
		Score s = new Score("student.txt");
		Handler1 h1 = new Handler1();
		h1.ctr(s);
	}
}