package string_test;

class delChar {
	public static String delete(String str, String str_d) {
		StringBuffer sb=new StringBuffer(str); 
		StringBuffer sb_d=new StringBuffer(str_d);

		for(int i=0; i<sb.length(); i++) {
			for(int j=0; j<sb_d.length(); j++) {
				if(sb.charAt(i)==sb_d.charAt(j)) {
					sb.delete(i, i+1);
					i--;//StringBuffer�� ������ �����ؼ� �پ������Ƿ� �ٽ� ���ϱ�
					break;
				}//if
			}//for j
		}//for i

		return sb.toString();
	}
}
public class DelCharTest {
	public static void main(String[] args) {
		System.out.println(delChar.delete("123!45@"," !@"));
	}
}
