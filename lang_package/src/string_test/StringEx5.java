package string_test;

class NumToString{
	public static void translate(int number) {
		String str1;
		str1=String.valueOf(number); //String 변환
		//char>>char
		char[] data=str1.toCharArray();
		for(int i=0; i<data.length; i++) {
			System.out.println("data["+i+"] = "+data[i]);
		}
		/*
		for(int i=0; i<str1.length(); i++) {
		 System.out.println(str1.charAt(i)
		}
		*/
		
	}
}
public class StringEx5 {
	public static void main(String[] args) {
		NumToKorea.translate(2513); //일 없애기
	}
}