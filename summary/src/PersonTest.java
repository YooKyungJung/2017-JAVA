package vo_data;

class Person extends Object /*���Ŭ������ �θ�� ������Ʈ*/{ 
	private String name;//�̸�
	private int age;//����
	
	public Person(String name, int age) {//�ν��Ͻ� ������ �ʱ�ȭ
		super(); //Object�� ������ �޼��� ȣ��
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {//����
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {//����
		this.age = age;
	}

	@Override
	public String toString() {//object�� ������ ����
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
}

public class PersonTest {

	public static void main(String[] args) {
		Person p1=new Person("������",18);
		//System.out.println("�̸�: "+p1.getName()+",  ����: "+p1.getAge());
		System.out.println(p1);

	}

}
