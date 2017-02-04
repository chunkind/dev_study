package java_poly_interface;
/*
 *  ���⼭ ������ �߰� �ɶ����� feed �޼ҵ带 �߰��Ѵٸ� ���� ������ ���� �ȴ�. 
 *  �̸� �ذ��ϱ� ���� �������̽��� �̿��غ���. 
 *  
 *  ������ predator��� �������̽��� ��ü �Ǿ���. 
 *  tiger,lion�� ���� Tiger,Lion�� ��ü�̱⵵ ������ Predator �������̽� 
 *  ��ü�̱⵵ �ϱ� ������ �̷��� ����Ѵ�. 
 *  
 *  �̿� ���� ��ü�� �� �� �̻��� �ڷ��� Ÿ���� ���ԵǴ� Ư���� �������̶�� �Ѵ�. 
 *  
 *  �ٵ� feed �޼ҵ带 ����ϸ� ������ 'feed tiger'��� ���ڿ��� ����Ѵ�. 
 *  ��� �ذ��ϸ� ������? 
 */
public class ZooKeeper {
	
	/*public void feed(Tiger tiger){
		System.out.println("feed tiger");
	}
	
	public void feed(Lion lion){
		System.out.println("feed lion");
	}*/
	
	public void run(Predator predator){
		System.out.println("run "+predator.getName());
	}
	
	public void feed(Predator predator){ // ���� ��
		System.out.println("feed "+ predator.getName());
	}
	
	public static void main(String[] args){
		
		Tiger tiger = new Tiger();
		tiger.setName("tiger");
		
		Lion lion = new Lion();
		lion.setName("lion");
		
		ZooKeeper zoo = new ZooKeeper();
		zoo.feed(tiger);
		zoo.feed(lion);
		zoo.run(lion);
		zoo.run(tiger);
	}
}
