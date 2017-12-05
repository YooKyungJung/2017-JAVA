package object_test;

class Value {
	int number;
	public Value(int number) {
		super();
		this.number = number;
	}
}

public class EqualsEx1 {
	public static void main(String[] args) {
		Value n1=new Value(5); //참조변수임 primitive 아님 int n=5; 가   primitive
		Value n2=new Value(5);
		
		if(n1.equals(n2)) {//원래 가지고있는 equals는 참조변수 비교			
			System.out.println("같다");
		} else {
			System.out.println("다르다");
			}
		System.out.println(n1.toString());
		System.out.println(n2.toString());
		
		n1=n2;
		
		if(n1.equals(n2)) {//원래 가지고있는 equals는 참조변수 비교			
			System.out.println("같다");
		} else {
			System.out.println("다르다");
			}
		System.out.println(n1.toString());
		System.out.println(n2.toString());		
	}	
}