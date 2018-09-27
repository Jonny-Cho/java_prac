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

class Audio extends Product {
	Audio(){
		super(50);
	}
	public String toString() { return "Audio"; }
}

class Buyer { // ����
	int money = 1000;
	int bonusPoint = 0;
	Vector item = new Vector(); // ������ǰ �������� �迭
	int i = 0; // item�� ���� index
	
	void buy(Product p) { // ������ Tv�� ��ų�  Computer�� ��� �޼��� ����. buy�޼��� �ϳ��� ����ϱ� ���ؼ� ���� ������ Product�� ���������� �ν��Ͻ��� �ִ´�
		if(money<p.price) {
			System.out.println("�ݾ��� �����մϴ�.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p + "��/�� �����ϼ̽��ϴ�."); // toString ����
	}
	
	void refund(Product p) {
		if(item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "��/�� ��ǰ�ϼ̽��ϴ�.");
		} else {
			System.out.println("�����Ͻ� ��ǰ �� �ش� ��ǰ�� �����ϴ�.");
		}
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		if(item.isEmpty()) {
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�.");
			return;
		}
		
		for(int i=0; i<item.size();i++) {
			Product p = (Product)item.get(i);
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " + p;
		}
		
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� "+sum+"�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� "+itemList+"�Դϴ�.");
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

		
		System.out.println("���� ���� ���� "+ b.money + "�����Դϴ�.");
		System.out.println("���� ���ʽ������� "+ b.bonusPoint + "���Դϴ�.");
	}
}