package math;
import java.util.Scanner;

//Ŭ���� �ּ� 3��
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
			System.out.print("0~100������ ���ڸ� �Է����ּ���>> ");
			int userNum=Scan.scan();
			cnt++;
			if(num>userNum) {
				System.out.println("�Է��� ������ �� Ů�ϴ�!"); continue;
			}
			else if(num<userNum) {
				System.out.println("�Է��� ������ �� �۽��ϴ�!"); continue;
			}
			else if(num==userNum) {
				System.out.println("�����մϴ�!"+cnt+"�� ���� ���߼̽��ϴ�!"); break;
			}
		} while(cnt<=7);
	}
	
}

public class ExIII_3_1 {
	public static void main(String[] args) {
		Compare.compare();
	}
}

//Math Ŭ���� ����(��ǥ)
//ExIII_1_1.java �缳��
//