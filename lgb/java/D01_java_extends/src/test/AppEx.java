package test;

import child.Empolyee;
import child.Student;
import parent.Person;

public class AppEx {

	public static void main(String[] args) {
		
//1. person 타입의 배열을 생성 
//2. Employee 생성자 , Student 생성자 두 개 person 배열 안에 넣자 
	Person[] p = {
			new Empolyee("고기리", "논현", 29,"영업부"),
			new Student("김시습", "잠실", 22,503) 
		};
//3. 배열 안에 있는 객체들의 정보를 콘솔창으로 출력.. 	for문 사용... 
//   p 배열안에 있는 값을 모두 뽑아내기 	
	for(int i=0; i<p.length; i++){
		System.out.println(p[i]);
		
//4. instanceof	 
// 앞과 뒤의 데이터 타입이 같으면 true 리턴 아니면 false
		if(p[i] instanceof Empolyee){
			Empolyee emp = (Empolyee)p[i];
			emp.planEducation();
		}
	 }
	
   }
}
