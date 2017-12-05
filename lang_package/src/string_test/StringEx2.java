package string_test;

public class StringEx2 {

	public static void main(String[] args) {
		String str1="I Love You";
		System.out.println(str1.length());
		//str1 을 만드는 순간  jvm 은 몇개의 중요한 속성을 같이 만듬
		
		System.out.println(str1.charAt(3)); //인덱스(0~9)
		System.out.println(str1.charAt(10)); 
		//Throws: 예외
		//StringIndexOutOfBoundsException 오류 발생 시 래퍼런스에 가면 알 수 있음
	}
}
