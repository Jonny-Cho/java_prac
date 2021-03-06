package ch7;

import java.util.*;

class Product {
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0); 
	}
}

class Tv extends Product{
	Tv(){ 
		// 조상클래스 생성자 호출
		super(100);
	}
	public String toString() { return "Tv"; }
}

class Computer extends Product{
	Computer(){
		super(200);
	}
	public String toString() { return "Computer"; }
}

class Audio extends Product {
	Audio(){
		super(50);
	}
	public String toString() { return "Audio"; }
}

class Buyer { // 고객
	int money = 1000;
	int bonusPoint = 0;
	Vector item = new Vector(); // 구입제품 저장위한 배열
	int i = 0; // item에 사용될 index
	
	void buy(Product p) { // 고객이 Tv를 사거나  Computer를 사는 메서드 구현. buy메서드 하나만 사용하기 위해서 공통 조상인 Product의 참조변수를 인스턴스로 넣는다
		if(money<p.price) {
			System.out.println("금액이 부족합니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p + "을/를 구입하셨습니다."); // toString 생략
	}
	
	void refund(Product p) {
		if(item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "을/를 반품하셨습니다.");
		} else {
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		if(item.isEmpty()) {
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		
		for(int i=0; i<item.size();i++) {
			Product p = (Product)item.get(i);
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " + p;
		}
		
		System.out.println("구입하신 물품의 총금액은 "+sum+"만원입니다.");
		System.out.println("구입하신 제품은 "+itemList+"입니다.");
	}
}

class PolyArgumentTest3 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		Audio audio = new Audio();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();

		
		System.out.println("현재 남은 돈은 "+ b.money + "만원입니다.");
		System.out.println("현재 보너스점수는 "+ b.bonusPoint + "점입니다.");
	}
}