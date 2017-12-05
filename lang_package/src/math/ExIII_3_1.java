package math;
import java.util.Scanner;

//클래스 최소 3개
class Scan {
	public static int scan() {
		Scanner sc=new Scanner(System.in);
		return sc.nextInt();
	}
}
class Random {
	public static int random() {
		return (int)(Math.random()*100);
	}
}
class Compare {
	public static void compare() {
		int num=Random.random();
		int cnt=1;
		do {
			System.out.print("0~100까지의 숫자를 입력해주세요>> ");
			int userNum=Scan.scan();
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
	}
	
}

public class ExIII_3_1 {
	public static void main(String[] args) {
		Compare.compare();
	}
}

//Math 클래스 정리(발표)
//ExIII_1_1.java 재설계
//