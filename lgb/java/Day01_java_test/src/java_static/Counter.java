package java_static;

/* < static ���� ���� >
 * - static�� ����ϴ� �� �ϳ��� ������ ������ ����
 * static���� �����ϸ� �� �Ѱ��� �޸� �ּҸ� �ٶ󺸱� ������ static ������ ���� ����
 * �� ����Ʈ �湮�ø��� ��ȸ���� ������Ű�� Counter 
 * 
 * count �տ� static�� �ٿ����� count ���� �����Ǿ� �湮�� ���� �����ϰ� �ȴ�. 
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
 *  < static method ���� > 
 *  Ŭ���� �޼ҵ� �ȿ����� �ν��Ͻ� ���� ������ �Ұ����ϴ�.
 *  ������ count�� static �����̱� ������ Ŭ���� �޼ҵ忡 ������ ���� 
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