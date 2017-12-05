package exercise;
import java.io.*;

public class InExam {
	public static void main(String[] args) {
		try {
			String str1="", str2="";
			//메모리 할당 > 메모리가 안잡혀있어서 바로 값 못넣음 <메모리 초기화>
			int sum;
			double avg;
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("첫번째 수 입력>> "); str1=br.readLine();
			System.out.print("두번째 수 입력>> "); str2=br.readLine();
			int num1= Integer.parseInt(str1); int num2=Integer.parseInt(str2);
			sum=num1+num2; avg=sum/2.0; 
			System.out.println("합: "+sum); System.out.println("평균: "+avg);
			//integer.parseInt
		} catch(Exception e) {
			System.out.println("Error: "+e.toString());
		}

	}

}
