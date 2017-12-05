package string_test;

public class StringEx3 {

	public static void main(String[] args) {
		char ch='A';
		String str1="A";
		String str2; //선언, 출력 시 Error
		
		str2=String.valueOf(ch); //메모리 할당
		System.out.println(str1+str2);
		if(str1 == str2) { //참조
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}
		if(str1.equals(str2)) { //값 => 오버라이딩
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}
	}
}
