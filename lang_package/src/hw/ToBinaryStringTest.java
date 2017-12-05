package hw;
class ToBinary {
	public static void toBS(String s) {
		int num=Integer.parseInt(s); 
		StringBuffer sb=new StringBuffer();
		int rest;
		while(true) {
			rest=num%2;
			num=num/2;
			if(num==0) break;
			sb.append(rest);
		}
		System.out.println(sb.reverse());
		
	}
}

public class ToBinaryStringTest {
	public static void main(String[] args) {
		ToBinary.toBS("0");
		ToBinary.toBS("5");
	}
}
