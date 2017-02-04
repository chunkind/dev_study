package java_singleton;
/* < �̱��� ���� >
 * �̱����� �� �ϳ��� ��ü���� �����ϰ� �����ϴ� ����. 
 * �� Ŭ������ ���� ������ �� �ִ� ��ü�� �� �� ���� �ǵ��� ����� ���� �̱����̴�.
 * 
 *  �����ڸ� private���� ����� �ܺ� Ŭ�������� Singleton Ŭ������ 
 *  new�� ���� ������ �� ���� �ȴ�. 
 *  
 *  getInstance��� static �޼ҵ带 �̿��Ͽ� Singleton ��ü�� �������� �� �ִ�. 
 *  ������ getInstance�� ȣ���� ������ ���ο� ��ü�� �����ǰ� �ȴ�. 
 *  �̰��� �̱����� �ƴϴ�. 
 *  
 *  ���� getInstance�� ȣ��Ǹ� one�� null�̹Ƿ� new�� ���ؼ� ��ü�� ���������.
 *  �̷��� �ѹ� ������ �Ǹ� one�� static �����̱� ������ �� ���ķδ� null�� �ƴϰ� �ȴ�.
 *  �׷� �Ŀ� �ٽ� getInstance �޼ҵ尡 ȣ��Ǹ� one�� null�� �ƴϹǷ� 
 *  �̹� ������� �̱��� ��ü�� one�� �׻� ���� 
 */

class Singleton{
	private static Singleton one; // �߰� 
	private Singleton(){
	}
	
	public static Singleton getInstance(){
		if(one==null){
			one = new Singleton();
		}
		return one;
	}
}

public class SingletonTest {
	public static void main(String[] args) {
		//Singleton single = new Singleton();
		Singleton single1 = Singleton.getInstance();
		Singleton single2 = Singleton.getInstance();
		System.out.println(single1 == single2);
	}
}
