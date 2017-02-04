package parent;

public class Person {
	protected String name; 
	protected String address;
	protected int age;
	
	public Person(String name, String address, int age){
		
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	@Override
	public String toString() {
		 return name+ " " + address + " " + age;
	}
}
