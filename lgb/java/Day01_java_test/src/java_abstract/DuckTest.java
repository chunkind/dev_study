package java_abstract;
	 
	abstract class Bird{
		// �߻� �޼ҵ�� ������ ���� �޼ҵ��̴�.�� ������ ���� ���� �޼ҵ� 
		// �߻� �޼ҵ�� �ν��Ͻ��� ������ �� ����. 
		public abstract void sing(); 
		
		public void fly(){
			System.out.println("����");
		}
	}
	
	 class Duck extends Bird {

		@Override
		public void sing() {
			System.out.println("�в�");
		}
		
	}
	
public class DuckTest {
	public static void main(String[] args) {
		Duck duck = new Duck();
		duck.fly();
		duck.sing();
	}
}