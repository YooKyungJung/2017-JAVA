package string_test;

public class StringEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abc";
		String str2 = "abc";
		
		if(str1 == str2) { //참조
			System.out.println("같다.");
		}
		else {
			System.out.println("다르다");
		}
		
		if(str1.equals(str2)) { //값 => 오버라이딩
			System.out.println("같다.");
		}
		else {
			System.out.println("다르다");
		}
		
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		
		if(str3 == str4) {
			System.out.println("같다.");
		}
		else {
			System.out.println("다르다");
		}
		
		if(str3.equals(str4)) {
			System.out.println("같다.");
		}
		else {
			System.out.println("다르다");
		}
	}

}
