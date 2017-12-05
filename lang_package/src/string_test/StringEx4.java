package string_test;

class NumToKorea{
	public static void translate(int number) {
		if(number>0&&number<=9999999) {
			String[] korea={"","��","��","��","��","��","��","ĥ","��","��"};
			String[] unit={"","��","��","õ","��","�ʸ�","�鸸"};
			
			String str=String.valueOf(number);//int>>String
			char[] data=str.toCharArray();//String�ɰ��� char�迭��
			for(int i=0; i<data.length; i++) {
				if(data[i]!='0') {///0�϶� ���X
					System.out.print(korea[data[i]-'0']);//����
					//data���� char���̴ϱ� -'0'����
					System.out.print(unit[data.length-(i+1)]);//����
					//length�� �迭ó�� 0���� ����X
					}
			}
		}
			else System.out.println("���ڸ� �ٽ� �Է��ϼ��� (�ִ� ����: �鸸)");
	}
}
public class StringEx4 {
	public static void main(String[] args) {
		NumToKorea.translate(1254);
		NumToKorea.translate(1030);
	}
}