package day01_poly;

public class BindingTest {
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		System.out.println(p.age);
		System.out.println(c.age);
		p.mehtod();
		c.mehtod();
		c.work();
	}
}

class Parent{
	int age = 50;
	
	void mehtod(){
		System.out.println("Parent Method");
	}
	
	Parent(int age){
		this.age = age;
	}
	
	Parent(){}
	
	void age(){
		System.out.println(age+"살");
	}
}

class Child extends Parent{
	int age = 30;
	
	Child(){}
	
	Child(int age) {
		super(age);
	}
	
	Child(String work){
		this.work();
	}
	
	void mehtod(){
		System.out.println("age :"+age);
		System.out.println("super.age :"+super.age);
		System.out.println("this.age :"+this.age);
	}
	
	void work(){
		System.out.println("워커홀릭");
	}
	
	void age(){
		System.out.println(age+"살");
	}
}