package test;

import child.Empolyee;
import child.Student;
import parent.Person;

public class AppEx {

	public static void main(String[] args) {
		
//1. person Ÿ���� �迭�� ���� 
//2. Employee ������ , Student ������ �� �� person �迭 �ȿ� ���� 
	Person[] p = {
			new Empolyee("��⸮", "����", 29,"������"),
			new Student("��ý�", "���", 22,503) 
		};
//3. �迭 �ȿ� �ִ� ��ü���� ������ �ܼ�â���� ���.. 	for�� ���... 
//   p �迭�ȿ� �ִ� ���� ��� �̾Ƴ��� 	
	for(int i=0; i<p.length; i++){
		System.out.println(p[i]);
		
//4. instanceof	 
// �հ� ���� ������ Ÿ���� ������ true ���� �ƴϸ� false
		if(p[i] instanceof Empolyee){
			Empolyee emp = (Empolyee)p[i];
			emp.planEducation();
		}
	 }
	
   }
}
