package child;

import parent.Person;

public class Empolyee extends Person{
	
	private String dept; 
	
	public Empolyee(String name, String address, int age, String dept) {
		super(name, address, age);
		this.dept = dept;
	}

	@Override
	public String toString() {
		return super.toString()+" "+ dept;
	}
	
	public void planEducation(){
		System.out.println("���� ������ ��ȹ�Ѵ�..");
	}
	
}
