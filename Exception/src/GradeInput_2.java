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

public class GradeInput_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
