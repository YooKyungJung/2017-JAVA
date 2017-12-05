package string_test;

class NumToKorea{
	public static void translate(int number) {
		if(number>0&&number<=9999999) {
			String[] korea={"","일","이","삼","사","오","육","칠","팔","구"};
			String[] unit={"","십","백","천","만","십만","백만"};
			
			String str=String.valueOf(number);//int>>String
			char[] data=str.toCharArray();//String쪼개서 char배열에
			for(int i=0; i<data.length; i++) {
				if(data[i]!='0') {///0일때 출력X
					System.out.print(korea[data[i]-'0']);//숫자
					//data에는 char형이니까 -'0'해줌
					System.out.print(unit[data.length-(i+1)]);//단위
					//length는 배열처럼 0부터 시작X
					}
			}
		}
			else System.out.println("숫자를 다시 입력하세요 (최대 단위: 백만)");
	}
}
public class StringEx4 {
	public static void main(String[] args) {
		NumToKorea.translate(1254);
		NumToKorea.translate(1030);
	}
}