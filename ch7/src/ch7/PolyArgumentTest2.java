/*package ch7;

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

class Buyer { // 고객
	int money = 1000;
	int bonusPoint = 0;
	Product[] item = new Product[10]; // 구입제품 저장위한 배열
	int i = 0; // item에 사용될 index
	
	void buy(Product p) { // 고객이 Tv를 사거나  Computer를 사는 메서드 구현. buy메서드 하나만 사용하기 위해서 공통 조상인 Product의 참조변수를 인스턴스로 넣는다
		if(money<p.price) {
			System.out.println("금액이 부족합니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p;
		System.out.println(p + "을/를 구입하셨습니다."); // toString 생략
	}
}

class PolyArgumentTest2 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Computer());
		
		System.out.println("현재 남은 돈은 "+ b.money + "만원입니다.");
		System.out.println("현재 보너스점수는 "+ b.bonusPoint + "점입니다.");
	}
}*/