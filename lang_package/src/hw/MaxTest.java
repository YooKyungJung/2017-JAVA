package hw;

public class MaxTest {
	public static void max(int...num) {
		int number;
		for(int i=0; i<=num.length-1; i++) {
			if(num[i]> num[i+1]) num[i]=num[i];
			else num[i]=num[i+1];
			System.out.println(num[i]);
		}
	}
	public static void main(String[] args) {
		MaxTest.max(4,5,7);
	}
}
