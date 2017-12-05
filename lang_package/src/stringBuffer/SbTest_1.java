package stringBuffer;

public class SbTest_1 {
	String str;
	public SbTest_1(String str) {
		this.str=str;
	}
	public static void main(String[] args) {
		StringBuffer buff = new StringBuffer("Àç¹Õ´Â");
	    Object obj = "ÀÚ¹Ù";
	    System.out.println(buff.append(obj));

	}

}
