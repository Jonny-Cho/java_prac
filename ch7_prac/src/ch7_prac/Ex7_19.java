package ch7_prac;

public class Ex7_19 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.summary();
	}
}

class Buyer {
	int money = 1000;
	Product[] cart = new Product[3]; // ������ ��ǰ�� �����ϱ� ���� �迭
	int i = 0; // Product�迭 cart�� ���� index

	void buy(Product p) {
		/*
		 * (1) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�. 
		 * 1.1 ���� ���� ������ ������ ���ؼ� ���� ���� ������ �޼��带 �����Ѵ�.
		 * 1.2 ���� ���� ����ϸ�, ��ǰ�� ������ ���� ������ ���� 
		 * 1.3 ��ٱ��Ͽ� ������ ������ ��´�.(add�޼��� ȣ��)
		 */
		if(money<p.price) {
			System.out.println("�ݾ��� �����մϴ�.");
			return;
		}
		money -= p.price;
		add(p);
		
	}

	void add(Product p) {
		/*
		 * (2) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�. 
		 * 1.1 i�� ���� ��ٱ����� ũ�⺸�� ���ų� ũ�� 
		 * 1.1.1 ������ ��ٱ��Ϻ��� 2�� ū ���ο� �迭�� �����Ѵ�. 
		 * 1.1.2 ������ ��ٱ����� ������ ���ο� �迭�� �����Ѵ�. 
		 * 1.1.3 ���ο� ��ٱ��Ͽ� ������ ��ٱ��ϸ� �ٲ۴�. 
		 * 1.2 ������ ��ٱ���(cart)�� �����Ѵ�. �׸��� i�� ���� 1 ������Ų��.
		 */
		
		if(i>=cart.length){
			Product[] tmp = new Product[cart.length*2];
			System.arraycopy(cart, 0, tmp, 0, cart.length);
//			for(int i=0;i<cart.length;i++){
//				tmp[i] = cart[i];
//			}
			cart = tmp;
		}
		cart[i++]=p;
		
	} // add(Product p)

	void summary() {
		String itemList ="";
		int sum = 0;
		
		for(int i=0; i< cart.length;i++){
			if(cart[i]==null)
				break;
			itemList += (i==0) ? "" + cart[i] : ", " + cart[i];
			sum += cart[i].price;
		}
		/*
		 * (3) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�. 
		 * 1.1 ��ٱ��Ͽ� ��� ���ǵ��� ����� ����� ����Ѵ�. 
		 * 1.2 ��ٱ��Ͽ� ��� ���ǵ��� ������ ��� ���ؼ� ����Ѵ�. 
		 * 1.3 ������ ��� ���� �ݾ�(money)�� ����Ѵ�.
		 */
		
		System.out.println("������ ����:"+itemList);
		System.out.println("����� �ݾ�:"+sum);
		System.out.println("���� �ݾ�:"+money);
		
	} // summary()
}

class Product {
	int price; // ��ǰ�� ����

	Product(int price) {
		this.price = price;
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}