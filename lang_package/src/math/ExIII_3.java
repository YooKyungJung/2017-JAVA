package math;
import java.util.Scanner;

public class ExIII_3 {
	public static void main(String[] args) {
		int num=(int)(Math.random()*100);
		int userNum;
		int cnt=1; 
		Scanner sc=new Scanner(System.in);
		do {
			System.out.print("0~100������ ���ڸ� �Է����ּ���>> ");
			userNum=sc.nextInt();
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
		if(cnt>7) System.out.println("���� ���߱⿡ �����Ͽ����ϴ�");
	}
}
