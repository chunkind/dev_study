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
// Card�� ��ȣ�� �־��µ� �� ������ ����? 
// �ٷ� ���� �տ� final�� �پ��ִ�. 
// ������ ���Ǹ� ���� ������ �� ���� ����� �Ǹ�, �޼��忡 ���Ǹ� �������̵� �� �� ���� 
// Ŭ������ ���Ǹ� �ڽ� Ŭ������ ������ �� ����. 
public class FinalCardTest {
	public static void main(String[] args) {
		Card c = new Card();
		//c.NUMBER = 5;
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
	}
}
