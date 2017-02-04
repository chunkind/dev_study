package test;

public class AppTest1 {
	public static void main(String[] args) {
		Member m01 = new Member("김새봄",27);
		Member m02 = new Member(28);
		
		System.out.println(m01);
		System.out.println(m02);
	}
}
/*
 * class 
 * Access Modifier 클래스명 {}
 * 
 * Variable 
 * Access Modifier 타입 변수명; 
 * 
 * Constructor 
 * 클래스와 동일한 Access Modifier 클래스명() {}
 * 
 * method 
 * Access Modifier 타입 메서드명(){}
 * 		(타입이있다면 return;)
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
	
	// 오버로딩 사용... 같은 이름으로 순서,갯수,타입을 다르게 해서 정의 
	// 기본 생성자 인스턴스를 초기화 할 때 
	
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