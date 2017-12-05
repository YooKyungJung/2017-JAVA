package vo_data;

class Person extends Object /*모든클래스의 부모는 오브젝트*/{ 
	private String name;//이름
	private int age;//나이
	
	public Person(String name, int age) {//인스턴스 생성시 초기화
		super(); //Object의 생성자 메서드 호출
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {//변경
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {//변경
		this.age = age;
	}

	@Override
	public String toString() {//object가 가지고 있음
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
}

public class PersonTest {

	public static void main(String[] args) {
		Person p1=new Person("정유경",18);
		//System.out.println("이름: "+p1.getName()+",  나이: "+p1.getAge());
		System.out.println(p1);

	}

}
