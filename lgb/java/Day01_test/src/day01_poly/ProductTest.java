package day01_poly;

import java.util.Vector;

public class ProductTest {
	public static void main(String[] args){
		
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		
		b.buy(tv);
		b.buy(com);
		b.buy(tv);
		b.buy(com);
		/*b.buy(tv);
		b.buy(com);*/
		b.summary();
		System.out.println();
		b.refund(tv);
		b.refund(com);
		b.summary();
		
		System.out.println("현재 남은 잔액은 "+b.money+" 만원입니다.");
		System.out.println("현재 적립금은 "+b.bonusPoint+" 점입니다.");
	}
}

class Product{
	int price; // 제품의 가격
	int bonusPoint; // 제품 구매 시 제공하는 보너스 점수 
	
	Product(int price){
		this.price = price;
		bonusPoint = price/10;
	}
}

class Tv extends Product{
	Tv(){
		// 부모 클래스의 생성자 Product(int price)를 호출 
		super(100); // 100만원 
	}
	
	public String toString(){
		return "TV";
	}
}

class Computer extends Product{
	Computer(){
		super(80);
	}
	
	public String toString(){
		return "Computer";
	}
}

/*class Buyer{  // 구매자 
	int money = 1000; // 소유 금액
	int bonusPoint = 0; // 보너스 점수 
	Product [] item = new Product[10]; 
	int i = 0; // Product 배열에 사용될 카운터 
	
	void buy(Product p){
		if(money < p.price){
			System.out.println("잔액이 부족하여 구매할 수 없습니다.");
			return;
		}
		
		money -= p.price; 
		bonusPoint += p.bonusPoint;
		item[i++] = p; // 제품을 product[] item에 저장 
		System.out.println(p+" 을/를 구매하였습니다.");
	}
	
	void summary(){  // 구매한 물품에 대한 정보를 요약 
		int sum = 0; // 구입한 물품의 가격합계 
		String itemList = ""; // 구입한 물품 목록 
		
		for(int i=0; i<item.length; i++){
			if(item[i]==null) break;
			sum += item[i].price;
			itemList += item[i]+", "; 
		}
		System.out.println("구입하신 물품의 총 금액은 "+ sum + " 만원입니다.");
		System.out.println("구입하신 제품은 "+ itemList + "입니다.");
	}
}*/

// Product 배열로 구입한 제품들을 저장할 수 있도록 했지만 배열의 크기를 10으로 했기 때문에 
// 10개 이상의 제품을 구입할 수 없는 것이 문제다. 
// 이때 Vector클래스를 사용하면 된다. 
// Vector클래스는 내부적으로 Object 타입의 배열을 가지고 있어서 이 배열에 객체를 추가하거나
// 제거할 수 있게 작성되어 있다. 배열의 크기를 알아서 관리하기 때문에 저장할 인스턴스 개수에 신경쓸 필요 없다. 

class Buyer{  // 구매자 
	int money = 1000; // 소유 금액
	int bonusPoint = 0; // 보너스 점수 
	Vector item = new Vector();
	
	void buy(Product p){
		if(money < p.price){
			System.out.println("잔액이 부족하여 구매할 수 없습니다.");
			return;
		}
		
		money -= p.price; 
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p+" 을/를 구매하였습니다.");
	}
	
	void refund(Product p){
		if(item.remove(p)){ // 제품을 Vector에서 제거 
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p+" 을 반품하셨습니다.");
		} else {	// 제거에 실패 시 
			System.out.println("구입하신 제품 중 해당 제품은 없습니다.");
		}
	}
	
	void summary(){  // 구매한 물품에 대한 정보를 요약 
		int sum = 0; // 구입한 물품의 가격합계 
		String itemList = ""; // 구입한 물품 목록 
		
		if(item.isEmpty()){ // Vector가 비어있는지 확인 
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		
		//반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다. 
		for(int i=0; i<item.size(); i++){
			Product p = (Product) item.get(i); // Vector의 i번째에 있는 객체를 얻어온다.
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " + p;
		}
		
		System.out.println("구입하신 물품의 총 금액은 "+ sum + " 만원입니다.");
		System.out.println("구입하신 제품은 "+ itemList + "입니다.");
	}
}




