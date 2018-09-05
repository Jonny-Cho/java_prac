package ch6;

public class CardTest {

	public static void main(String[] args) {
		System.out.println("Card.width = "+ Card.width); // Ŭ������.Ŭ����������
		System.out.println("Card.height = "+ Card.height);
		
		Card c1 = new Card(); // ��ü ������ �ν��Ͻ� ����(iv) ��밡��
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card(); // ī��1�� ī��2�� �ٸ� �Ӽ��� ������ �����ϱ� iv�� ����
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println(c1.kind+","+c1.number);
		System.out.println(c2.kind+","+c2.number);
		
		c1.width = 50;
		c1.height = 80; // Ŭ���� ���� �� ����
		
		System.out.println(c1.width+","+c1.height);
		System.out.println(c2.width+","+c2.height); // c2���Ե� ������ ��
	}

}

class Card {
	String kind; // ������ �κ��� �ν��Ͻ� ������ ����(���� & ����)
	int number; // ��ü ������ ��밡��
	static int width = 100; // ����� �κ��� Ŭ���� ������ ���� (ī���� ũ��)
	static int height = 250;// Ŭ������.Ŭ�������������� ��밡��
}