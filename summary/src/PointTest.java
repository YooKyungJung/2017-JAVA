package test_1;

class Point {
	double x,y; //좌표값
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public String toString() { 
		//toString은 접근제어자 public 리턴타입은 String
		//오브젝트에 들어잇는  toString을 오버라이딩, 오브젝트에 리턴타입이 String으로 되어있음
		return "점 (" + x + ", y=" + y + ")";
	}
}

interface Distance {
	public void getDistance(Point p);
}

class NamePoint extends Point implements Distance{
	//Point상속 Distance구현
	String name;
	public NamePoint(String name, double x, double y) {
		super(x, y);//super는 1번 라인에 와야함
		this.name = name;
	}
	public void getDistance(Point p) {
		double dist;
		dist=Math.sqrt(Math.pow(x-p.x, 2)+(y-p.y)*(y-p.y));
		//sqrt=루트 pow=제곱
		System.out.println("두 점 사이의 거리: "+dist);
	}
	public String toString() { 
		return "점의" + name + "의 좌표(" + x + ", "+y+")";
	}
}

public class PointTest {
	public static void main(String[] args) {
		NamePoint p1=new NamePoint("점1",2,3);
		System.out.println(p1);
		NamePoint p2=new NamePoint("점2",4.2,5.7);
		System.out.println(p2);
		p1.getDistance(p2);
	}
}
