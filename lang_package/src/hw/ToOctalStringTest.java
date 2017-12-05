package hw;
class ToOctal {
	public static void toOS(String s) {
		int num=Integer.parseInt(s); 
		int rest;
		StringBuffer sb=new StringBuffer("0");
		while(num!=0) {
			sb.deleteCharAt(0);
			rest=num%8;
			num=num/8;
			sb.append(rest);
		}
		System.out.println(sb.reverse());
	}
}

public class ToOctalStringTest {
	public static void main(String[] args) {
		ToOctal.toOS("9");
	}
}