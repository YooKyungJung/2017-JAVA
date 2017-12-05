package stringBuffer;

import java.util.StringTokenizer;

public class DataValueExam {
	public static void main(String[] args) {
		String tmpStr="hong ¿ë»ê±¸ 10.5 20.5";
		StringTokenizer parse=new StringTokenizer(tmpStr);
		
		String name;
		String address;
		double math;
		double english;
		double total;
		double avg;
		
		name = parse.nextToken();
		address = parse.nextToken();
		math = Double.valueOf(parse.nextToken()).doubleValue();
		english = Double.valueOf(parse.nextToken());
		
		total=math+english;
		avg=total/2.0;
		System.out.println(name+"\t"+address+"\t"+math+"\t"+english+"\t"
				+total+"\t"+avg+"\t");

	}
}
