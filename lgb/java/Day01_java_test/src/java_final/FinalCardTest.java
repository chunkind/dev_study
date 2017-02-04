package java_final;

class Card{
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 250;
	
	Card(String kind,int num) {
		KIND = kind;
		NUMBER = num;
	}
	
	Card(){
		this("Heart",1);
	}

	@Override
	public String toString() {
		return "NUMBER =" + NUMBER + ", KIND =" + KIND;
	}
	
	
}
// Card에 번호를 넣었는데 왜 오류가 날까? 
// 바로 변수 앞에 final이 붙어있다. 
// 변수에 사용되면 값을 변경할 수 없는 상수가 되며, 메서드에 사용되면 오버라이딩 할 수 없고 
// 클래스에 사용되면 자식 클래스를 정의할 수 없다. 
public class FinalCardTest {
	public static void main(String[] args) {
		Card c = new Card();
		//c.NUMBER = 5;
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
	}
}
