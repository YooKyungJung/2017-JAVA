import java.util.InputMismatchException;
import java.util.Scanner;

//170718

class NegetiveInputException extends Exception {
	//자바가 제공해주는 Exception을 상속
	//Exception이 java.lang에 있으니 import X
	private String reason;

	public NegetiveInputException() {
		super();
		reason="음수입력";
	}
	public String toString() {
		return "NegetiveInputException : " + reason;
	}
}

public class GradeInput {
	public static void main(String[] args) {
		try {
			int newGrade;
			Scanner scan=new Scanner(System.in);
			System.out.print("점수 입력 :");
			while(scan.hasNext()) { //다음 입력이 있는지 확인 -> 입력할때까지 무한루프
				newGrade = scan.nextInt();
				if(newGrade < 0) throw new NegetiveInputException();
				System.out.print("점수 입력 :");
			}
		}catch(InputMismatchException ime) {
			System.out.println(ime.toString());
		}catch(NegetiveInputException nie) {
			System.out.println(nie.toString());
		}
	}
}
//InputMismatchException