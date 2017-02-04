package test;

public class AppTest1 {
	public static void main(String[] args) {
		Member m01 = new Member("�����",27);
		Member m02 = new Member(28);
		
		System.out.println(m01);
		System.out.println(m02);
	}
}
/*
 * class 
 * Access Modifier Ŭ������ {}
 * 
 * Variable 
 * Access Modifier Ÿ�� ������; 
 * 
 * Constructor 
 * Ŭ������ ������ Access Modifier Ŭ������() {}
 * 
 * method 
 * Access Modifier Ÿ�� �޼����(){}
 * 		(Ÿ�����ִٸ� return;)
 */
class Member{
	String name;
	int age;
	
	/*
	 * Access Modifier 
	 * public 
	 * protected 
	 * default 
	 * private 
	 * 
	 */
	
	// �����ε� ���... ���� �̸����� ����,����,Ÿ���� �ٸ��� �ؼ� ���� 
	// �⺻ ������ �ν��Ͻ��� �ʱ�ȭ �� �� 
	
	Member(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Member(int age){
		this.age = age;
	}
	
	Member(){}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
	
}