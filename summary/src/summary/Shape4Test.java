package shape4.summary;
//추상클래스 + 상속
abstract class Shape4{ 
	//속성
	String name;
	//생성자 메서드
	public Shape4(String name) {
		this.name=name;
	}
	//메서드
	public abstract void getSurroundings();
	public abstract void getArea();
}

class Circle4 extends Shape4 {
	private double r;//외부(직접접근)에서 반지름 못바꾸게 private
	final double PI=3.14;
	//생성자 메서드
	public Circle4(String name, double r) {
		super(name);
		this.r=r;
	}
	//메서드 오버라이딩
	public void getSurroundings() {
		 System.out.println(name+"의 넓이: "+(PI*r*r));
	}
	public void getArea() {
		System.out.println(name+"의 둘레: "+(PI*2*r));
	}
}

class Square4 extends Shape4 {
	private double w, h;
	//생성자 메서드
		public Square4(String name, double w, double h) {
			super(name);
			this.w=w;
			this.h=h;
		}
	//메서드 오버라이딩
	public void getSurroundings() {
		System.out.println(name+"의 넓이는: "+(w*h));
	}
	public void getArea() {
		System.out.println(name+"의 둘레는: "+2*(w+h));
	}
}

class Control{ //캡슐화
	public void control(Shape4 s4){//파라미터 > reference변수
		//파라미터 > int a, String name
		//Shape4는 클래스 타입이면서도 데이터 타입!
		s4.getArea();//c4,s4>>Circle4,Square4>>Shape4
		s4.getSurroundings();
	}
}

public class Shape4Test {
	public static void main(String[] args) {
		//서비스코드-사용자에게 보여지는 코드
		Circle4 c4=new Circle4("삼각형",5); //작은거에서 큰거 형변환 자동!
		Square4 s4=new Square4("사각형",2,10);
		Control ctrl=new Control();
		ctrl.control(c4);
		ctrl.control(s4);
	}
}