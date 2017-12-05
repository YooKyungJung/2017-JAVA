package poly;
import java.util.Scanner;

class Student {
	String major;
	public Student(String major) {
		super();//object의 생성자 메서드 
		this.major = major;
	}
	public void performTask() {
		System.out.println("과제를 수행합니다.");
	}
}

class Inter extends Student{
	public Inter(String major) {
		super(major); //상위클래스의 생성자메서드 호출
		//super(major)는 메서드 호출 super.major는 참조변수호출/ .앞에는 참조변수만 옴//cf)super.major
	}
	public void performTask() {//오버라이딩
		System.out.println("개인 프로젝트를 수행합니다.");
	}
}

class Design extends Student {
	public Design(String major) {
		super(major);
	}
	public void performTask() {
		System.out.println("편집 디자인 작업을 수행합니다.");
	}
}

class Solu extends Student {
	public Solu(String major) {
		super(major);
	}
	public void performTask() {
		System.out.println("팀 프로젝트를 수행합니다.");
	}
}

public class Poly_Test {
	public static void main(String[] args) {
		/*Inter s1=new Inter("인터랙티브미디어과");
		Design s2=new Design("뉴미디어디자인과");
		Solu s3=new Solu("뉴미디어솔루션과");*/
		/*switch(num) {
		case 1: s1.performTask(); break;
		case 2: s2.performTask();  break;
		case 3: s3.performTask(); break;
		}*/
		Student st=null; //세 개를 통합할 수 있는 클래스 타입>상위는 하위를 참조할수있다. 반대는 X
		
		while(true) {
		System.out.println("학과를 선택해주세요, 인터=> 1 디자인=> 2 솔루션=> 3: 프로그램 종료=> 4");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		switch(choice){
			case 1:st=new Inter("인터랙티브미디어과"); break;
			case 2:st=new Design("뉴미디어디자인과"); break;
			case 3:st=new Solu("뉴미디어솔루션과"); break;
			case 4:System.out.println("프로그램을 종료합니다"); return;
			default: System.out.println("학과 선택이 잘못되었습니다.");
			}
		st.performTask();//과가 변해도 이 문장은 안변한다..!!
		}
	}
}