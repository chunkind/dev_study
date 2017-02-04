package java_static;

/* < static 변수 사용법 >
 * 박씨 집안을 나타내는 HousePark 클래스이다. 
 * 위와 같은 클래스를 만들고 객체를 생성하면 객체마다 lastname을 저장하기 위한 
 * 메모리를 별도로 할당. 하지만 lastname은 어떤 객체이던지 동일한 '박'이어야 한다. 
 * 항상 값이 변하지 않는 경우라면 static 사용 시 메모리의 이점 얻을 수 있다. 
 * 
 * 
 */

public class HousePark {
	//String lastname = "박";
	static String lastname = "박";
// lastname 변수에 static 키워드를 붙이면 자바는 메모리 할당을 딱 한번만 한다. 
// 만약 lastname 값이 변경되지 않기를 바란다면 static 키워드 앞에  final이라는 키워드를 붙인다.	
		
	public static void main(String[] args) {
		HousePark pey = new HousePark();
		HousePark pes = new HousePark();
	}
}
