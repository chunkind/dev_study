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
		
		System.out.println("���� ���� �ܾ��� "+b.money+" �����Դϴ�.");
		System.out.println("���� �������� "+b.bonusPoint+" ���Դϴ�.");
	}
}

class Product{
	int price; // ��ǰ�� ����
	int bonusPoint; // ��ǰ ���� �� �����ϴ� ���ʽ� ���� 
	
	Product(int price){
		this.price = price;
		bonusPoint = price/10;
	}
}

class Tv extends Product{
	Tv(){
		// �θ� Ŭ������ ������ Product(int price)�� ȣ�� 
		super(100); // 100���� 
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

/*class Buyer{  // ������ 
	int money = 1000; // ���� �ݾ�
	int bonusPoint = 0; // ���ʽ� ���� 
	Product [] item = new Product[10]; 
	int i = 0; // Product �迭�� ���� ī���� 
	
	void buy(Product p){
		if(money < p.price){
			System.out.println("�ܾ��� �����Ͽ� ������ �� �����ϴ�.");
			return;
		}
		
		money -= p.price; 
		bonusPoint += p.bonusPoint;
		item[i++] = p; // ��ǰ�� product[] item�� ���� 
		System.out.println(p+" ��/�� �����Ͽ����ϴ�.");
	}
	
	void summary(){  // ������ ��ǰ�� ���� ������ ��� 
		int sum = 0; // ������ ��ǰ�� �����հ� 
		String itemList = ""; // ������ ��ǰ ��� 
		
		for(int i=0; i<item.length; i++){
			if(item[i]==null) break;
			sum += item[i].price;
			itemList += item[i]+", "; 
		}
		System.out.println("�����Ͻ� ��ǰ�� �� �ݾ��� "+ sum + " �����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� "+ itemList + "�Դϴ�.");
	}
}*/

// Product �迭�� ������ ��ǰ���� ������ �� �ֵ��� ������ �迭�� ũ�⸦ 10���� �߱� ������ 
// 10�� �̻��� ��ǰ�� ������ �� ���� ���� ������. 
// �̶� VectorŬ������ ����ϸ� �ȴ�. 
// VectorŬ������ ���������� Object Ÿ���� �迭�� ������ �־ �� �迭�� ��ü�� �߰��ϰų�
// ������ �� �ְ� �ۼ��Ǿ� �ִ�. �迭�� ũ�⸦ �˾Ƽ� �����ϱ� ������ ������ �ν��Ͻ� ������ �Ű澵 �ʿ� ����. 

class Buyer{  // ������ 
	int money = 1000; // ���� �ݾ�
	int bonusPoint = 0; // ���ʽ� ���� 
	Vector item = new Vector();
	
	void buy(Product p){
		if(money < p.price){
			System.out.println("�ܾ��� �����Ͽ� ������ �� �����ϴ�.");
			return;
		}
		
		money -= p.price; 
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p+" ��/�� �����Ͽ����ϴ�.");
	}
	
	void refund(Product p){
		if(item.remove(p)){ // ��ǰ�� Vector���� ���� 
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p+" �� ��ǰ�ϼ̽��ϴ�.");
		} else {	// ���ſ� ���� �� 
			System.out.println("�����Ͻ� ��ǰ �� �ش� ��ǰ�� �����ϴ�.");
		}
	}
	
	void summary(){  // ������ ��ǰ�� ���� ������ ��� 
		int sum = 0; // ������ ��ǰ�� �����հ� 
		String itemList = ""; // ������ ��ǰ ��� 
		
		if(item.isEmpty()){ // Vector�� ����ִ��� Ȯ�� 
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�.");
			return;
		}
		
		//�ݺ����� �̿��ؼ� ������ ��ǰ�� �� ���ݰ� ����� �����. 
		for(int i=0; i<item.size(); i++){
			Product p = (Product) item.get(i); // Vector�� i��°�� �ִ� ��ü�� ���´�.
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " + p;
		}
		
		System.out.println("�����Ͻ� ��ǰ�� �� �ݾ��� "+ sum + " �����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� "+ itemList + "�Դϴ�.");
	}
}




