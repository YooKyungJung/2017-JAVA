package string_test;

public class StringEx3 {

	public static void main(String[] args) {
		char ch='A';
		String str1="A";
		String str2; //����, ��� �� Error
		
		str2=String.valueOf(ch); //�޸� �Ҵ�
		System.out.println(str1+str2);
		if(str1 == str2) { //����
			System.out.println("����.");
		} else {
			System.out.println("�ٸ���.");
		}
		if(str1.equals(str2)) { //�� => �������̵�
			System.out.println("����.");
		} else {
			System.out.println("�ٸ���.");
		}
	}
}
