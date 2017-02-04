package java_poly_interface;
/*
 *  여기서 동물이 추가 될때마다 feed 메소드를 추가한다면 정말 귀찮은 일이 된다. 
 *  이를 해결하기 위해 인터페이스를 이용해보자. 
 *  
 *  이제는 predator라는 인터페이스로 대체 되었다. 
 *  tiger,lion은 각각 Tiger,Lion의 객체이기도 하지만 Predator 인터페이스 
 *  객체이기도 하기 때문에 이렇게 사용한다. 
 *  
 *  이와 같이 객체가 한 개 이상의 자료형 타입을 갖게되는 특성을 다형성이라고 한다. 
 *  
 *  근데 feed 메소드를 출력하면 무조건 'feed tiger'라는 문자열을 출력한다. 
 *  어떻게 해결하면 좋을까? 
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
	
	public void feed(Predator predator){ // 변경 후
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
