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
			System.out.print("ã���� �ϴ� ����� �̸��� �Է��ϼ���! ");
			brname=br2.readLine();
			
			while((s=br1.readLine())!=null){
				StringTokenizer na = new StringTokenizer(s); 
				name[i] = na.nextToken(" "); //�̸�
				address[i] = na.nextToken(" "); //�ּ� 
				phonenumber[i] = na.nextToken(""); //��ȣ
				if(brname.equals(name[i])) {
					System.out.println("�ּ�:"+address[i]);
					System.out.println("��ȣ:"+phonenumber[i]);
					break;
				}
				i++;
			}
		} catch(Exception e){}
	}
}