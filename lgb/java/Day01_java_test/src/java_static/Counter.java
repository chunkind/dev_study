package java_static;

/* < static 변수 사용법 >
 * - static을 사용하는 또 하나의 이유는 공유의 개념
 * static으로 설정하면 단 한곳의 메모리 주소만 바라보기 때문에 static 변수의 값을 공유
 * 웹 사이트 방문시마다 조회수를 증가시키는 Counter 
 * 
 * count 앞에 static을 붙였더니 count 값이 공유되어 방문자 수가 증가하게 된다. 
*/

/*public class Counter {
	//int count = 0;
	static int count = 0;
	Counter(){
		this.count++;
		System.out.println(this.count);
	}
	
	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
	}
}*/

/*
 *  < static method 사용법 > 
 *  클래스 메소드 안에서는 인스턴스 변수 접근이 불가능하다.
 *  하지만 count는 static 변수이기 때문에 클래스 메소드에 접근이 가능 
 */

public class Counter {
	static int count = 0;
	Counter(){
		this.count++;
	}
	
	public static int getCount(){
		return count;
	}
	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		
		System.out.println(Counter.getCount());
	}
}