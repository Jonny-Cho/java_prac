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
		// ����Ŭ���� ������ ȣ��
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

class Buyer { // ����
	int money = 1000;
	int bonusPoint = 0;
	Product[] item = new Product[10]; // ������ǰ �������� �迭
	int i = 0; // item�� ���� index
	
	void buy(Product p) { // ������ Tv�� ��ų�  Computer�� ��� �޼��� ����. buy�޼��� �ϳ��� ����ϱ� ���ؼ� ���� ������ Product�� ���������� �ν��Ͻ��� �ִ´�
		if(money<p.price) {
			System.out.println("�ݾ��� �����մϴ�.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p;
		System.out.println(p + "��/�� �����ϼ̽��ϴ�."); // toString ����
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
		
		System.out.println("���� ���� ���� "+ b.money + "�����Դϴ�.");
		System.out.println("���� ���ʽ������� "+ b.bonusPoint + "���Դϴ�.");
	}
}*/