package shape1.summary;
//상속
class Shape1 {
	//속성
	String name;
	//생성자 메서드
	public Shape1(String name) {
		this.name=name;
	}
	//메서드
	public void getSurroundings() {
		System.out.println(name+"의 넓이 "); //바디없는 클래스 = 추상클래스
	}
	public void getArea() {
		System.out.println(name+"의 둘레 ");
	}
}
class Circle1 extends Shape1 {
	private double r;//외부(직접접근)에서 반지름 못바꾸게 private
	final double PI=3.14;
	//생성자 메서드
	public Circle1(String name, double r) {
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
class Square1 extends Shape1 {
	private double w, h;
	//생성자 메서드
		public Square1(String name, double w, double h) {
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
public class Shape1Test {
	public static void main(String[] args) {
		//서비스코드-사용자에게 보여지는 코드
		Circle1 c1=new Circle1("삼각형",5); //작은거에서 큰거 형변환 자동!
		Square1 s1=new Square1("사각형",5,4);
		
		c1.getSurroundings();c1.getArea();
		s1.getSurroundings();s1.getArea();
		
	}
}

/*
package shape1.summary;
class Shape1 {
	String name; 
	void getSurroundings() {
	
	}
	void getArea() {
	
	}
}
class Circle1 extends Shape1 {
	double r;
	public Circle1(String name, double r) {
		this.name=name;
		this.r=r;
	}
	void getSurroundings() {
	//	return 3.14*2*r;
	}
	void getArea() {
		//return 3.14*r*r;
	}
}
class Square1 extends Shape1 {
	int w, h;
	public Square1(String name, int w, int h) {
		this.name=name;
		this.w=w;
		this.h=h;
	}
	void getSurroundings() {
		//2*(w+h);
		System.out.println(name+"의 넓이는 ")
	}
	void getArea() {
		//w*h;
	}
}
public class Shape1Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle1 c1=new Circle1();
		c1.getSurroundings();
		c1.
		//Square1 s1=new Square1("사각형",5,4);
		
	}
}*/