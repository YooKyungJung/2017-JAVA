import java.util.InputMismatchException;
import java.util.Scanner;

//170718

class NegetiveInputException extends Exception {
	//�ڹٰ� �������ִ� Exception�� ���
	//Exception�� java.lang�� ������ import X
	private String reason;

	public NegetiveInputException() {
		super();
		reason="�����Է�";
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
			System.out.print("���� �Է� :");
			while(scan.hasNext()) { //���� �Է��� �ִ��� Ȯ�� -> �Է��Ҷ����� ���ѷ���
				newGrade = scan.nextInt();
				if(newGrade < 0) throw new NegetiveInputException();
				System.out.print("���� �Է� :");
			}
		}catch(InputMismatchException ime) {
			System.out.println(ime.toString());
		}catch(NegetiveInputException nie) {
			System.out.println(nie.toString());
		}
	}
}
//InputMismatchException