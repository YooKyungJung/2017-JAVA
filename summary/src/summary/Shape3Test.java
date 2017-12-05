package shape3.summary;

//상속+인터페이스 => 협업
class Shape3{ 
	//속성
	String name;
	//생성자 메서드
	public Shape3(String name) {
		this.name=name;
	}
}
interface getFunction{
	//메서드
	//인터페이스는 접근제어자X >> 자동으로  public, 인터페이스끼리 상속 가능
	//생성자 메서드 X
	void getSurroundings();
	void getArea();
}

class Circle3 extends Shape3 implements getFunction{
	private double r;//외부(직접접근)에서 반지름 못바꾸게 private
	final double PI=3.14;
	//생성자 메서드
	public Circle3(String name, double r) {
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
class Square3 extends Shape3 implements getFunction{
	private double w, h;
	//생성자 메서드
		public Square3(String name, double w, double h) {
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
public class Shape3Test {
	public static void main(String[] args) {
		//서비스코드-사용자에게 보여지는 코드
		Circle3 c3=new Circle3("삼각형",5); //작은거에서 큰거 형변환 자동!
		Square3 s3=new Square3("사각형",5,4);
		
		c3.getSurroundings();c3.getArea();
		s3.getSurroundings();s3.getArea();
		
	}
}