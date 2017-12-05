package exercise;

import java.io.*;
import java.util.StringTokenizer;

public class Ex2 {
	public static void main(String[] args) throws FileNotFoundException {
		BufferedReader br1 = new BufferedReader(new FileReader("phonebook.data"));
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		String s;
		String brname; 
			
		String name[]=new String[5];
		String phonenumber[]=new String[10];
		String address[]=new String[10];	
		int i=0;
		try{
			System.out.print("찾고자 하는 대상의 이름을 입력하세요! ");
			brname=br2.readLine();
			
			while((s=br1.readLine())!=null){
				StringTokenizer na = new StringTokenizer(s); 
				name[i] = na.nextToken(" "); //이름
				address[i] = na.nextToken(" "); //주소 
				phonenumber[i] = na.nextToken(""); //번호
				if(brname.equals(name[i])) {
					System.out.println("주소:"+address[i]);
					System.out.println("번호:"+phonenumber[i]);
					break;
				}
				i++;
			}
		} catch(Exception e){}
	}
}