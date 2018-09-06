package ch7;

class Product{
	int price; // ��ǰ ����
	int bonusPoint; // ��ǰ���Ž� �����ϴ� ���ʽ� ����
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0); //���ʽ� ������ ��ǰ������ 10%
	}
} // ��ǰ Ŭ���� ����

class Tv extends Product {
	Tv() {
		// ����Ŭ������ ������ Product(int price)�� ȣ���Ѵ�.
		super(100); // Tv�� ������ 100�������� �Ѵ�.
	}

	// ObjectŬ������ toString()�� �������̵��Ѵ�.
	public String toString(){ return "Tv"; }
	
} // Product�� ����� ��ӹ��� Tv Ŭ���� ����

class Computer extends Product {
	Computer() {
		super(200); // ��ǻ�� ���� 200����
	}
	
	// �������̵�
	public String toString(){ return "Computer"; }
}

class Buyer { // ��ǰ�� �����ϴ� ���
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p){ //���� ���Ա�� �޼ҵ�. buy�ȿ� ********* '����'�� �Ű����� ���. p�� lv
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}
}

public class PolyArgumentTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		
		System.out.println("���� ���� ���� "+b.money+"�����Դϴ�.");
		System.out.println("���� ���ʽ������� "+b.bonusPoint+"���Դϴ�.");
	}

}