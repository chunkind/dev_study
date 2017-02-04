package java_singleton;
/* < 싱글톤 패턴 >
 * 싱글톤은 단 하나의 객체만을 생성하게 강제하는 패턴. 
 * 즉 클래스를 통해 생성할 수 있는 객체는 단 한 개만 되도록 만드는 것이 싱글톤이다.
 * 
 *  생성자를 private으로 만들어 외부 클래스에서 Singleton 클래스를 
 *  new를 통해 생성할 수 없게 된다. 
 *  
 *  getInstance라는 static 메소드를 이용하여 Singleton 객체를 돌려받을 수 있다. 
 *  하지만 getInstance를 호출할 때마다 새로운 객체가 생성되게 된다. 
 *  이것은 싱글톤이 아니다. 
 *  
 *  최초 getInstance가 호출되면 one이 null이므로 new에 의해서 객체가 생서오딘다.
 *  이렇게 한번 생성이 되면 one은 static 변수이기 때문에 그 이후로는 null이 아니게 된다.
 *  그런 후에 다시 getInstance 메소드가 호출되면 one은 null이 아니므로 
 *  이미 만들어진 싱글톤 객체인 one을 항상 리턴 
 */

class Singleton{
	private static Singleton one; // 추가 
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
