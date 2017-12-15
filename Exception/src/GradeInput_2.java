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

public class GradeInput_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
