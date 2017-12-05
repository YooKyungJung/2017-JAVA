package wrapper;
//점.
//이름점. (점상속)
//거리를 구하다(인터페이스) -able
interface distanceGettable {
	void getDistance(Point p);
}
class Point {
	double x, y;
	
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

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}

class NamePoint extends Point implements distanceGettable{
	String name;
	
	public NamePoint(double x, double y, String name) {
		super(x, y);
		this.name = name;
	}

	@Override
	public String toString() {
		return "점 "+name+": "+"("+x+", "+y+")";
	}

	@Override
	public void getDistance(Point p) {
		double dist=Math.sqrt(Math.pow(x-p.x, 2)+Math.pow(y-p.y, 2));
		System.out.println("두 점 사이의 거리: "+dist);
		
	}

	
	
}
public class Phyta_Point_Test {
	public static void main(String[] args) {
		NamePoint p1=new NamePoint(0,0,"점1");
		NamePoint p2=new NamePoint(3,4,"점2");
		p1.getDistance(p2);
	}
}
