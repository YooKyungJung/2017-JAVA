package math;
import java.util.Scanner;

public class ExIII_3 {
	public static void main(String[] args) {
		int num=(int)(Math.random()*100);
		int userNum;
		int cnt=1; 
		Scanner sc=new Scanner(System.in);
		do {
			System.out.print("0~100까지의 숫자를 입력해주세요>> ");
			userNum=sc.nextInt();
			cnt++;
			if(num>userNum) {
				System.out.println("입력한 수보다 더 큽니다!"); continue;
			}
			else if(num<userNum) {
				System.out.println("입력한 수보다 더 작습니다!"); continue;
			}
			else if(num==userNum) {
				System.out.println("축하합니다!"+cnt+"번 만에 맞추셨습니다!"); break;
			}
		} while(cnt<=7);
		if(cnt>7) System.out.println("숫자 맞추기에 실패하였습니다");
	}
}
