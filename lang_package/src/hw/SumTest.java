package hw;
//가변길이 인자, 배열array
public class SumTest {
	public static void sum(int...num) {
		int sum=0;
		for(int i=0; i<=num.length-1; i++) {
			sum+=num[i];
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		SumTest.sum(4,5,7);
	}
}
