package string_test;

public class StringEx2 {

	public static void main(String[] args) {
		String str1="I Love You";
		System.out.println(str1.length());
		//str1 �� ����� ����  jvm �� ��� �߿��� �Ӽ��� ���� ����
		
		System.out.println(str1.charAt(3)); //�ε���(0~9)
		System.out.println(str1.charAt(10)); 
		//Throws: ����
		//StringIndexOutOfBoundsException ���� �߻� �� ���۷����� ���� �� �� ����
	}
}
