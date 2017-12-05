package shape2.summary;
//추상클래스 + 상속
abstract class Shape2{ 
	//속성
	String name;
	//생성자 메서드
	public Shape2(String name) {
		this.name=name;
	}
	//메서드
	public abstract void getSurroundings();
	public abstract void getArea();
}

class Circle2 extends Shape2 {
	private double r;//외부(직접접근)에서 반지름 못바꾸게 private
	final double PI=3.14;
	//생성자 메서드
	public Circle2(String name, double r) {
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
class Square2 extends Shape2 {
	private double w, h;
	//생성자 메서드
		public Square2(String name, double w, double h) {
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
public class Shape2Test {
	public static void main(String[] args) {
		//서비스코드-사용자에게 보여지는 코드
		Circle2 c2=new Circle2("삼각형",5); //작은거에서 큰거 형변환 자동!
		Square2 s2=new Square2("사각형",2,10);
		c2.getSurroundings();c2.getArea();
		s2.getSurroundings();s2.getArea();
		
	}
}