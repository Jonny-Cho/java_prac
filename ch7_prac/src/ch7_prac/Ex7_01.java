package ch7_prac;

/*
 * [7-1] ����ī�� 20���� �����ϴ� ����ī�� �� ��(SutdaDeckŬ����)�� ������ ���̴�. ����ī�� 20���� ���
 * SutdaCard�迭�� �ʱ�ȭ�Ͻÿ�. ��, ����ī��� 1���� 10������ ���� �� ���� ī�尡 �� �־� �ְ�, ���ڰ� 1, 3, 8��
 * ��쿡�� �� ���� �� ���� ��(Kwang)�̾�� �Ѵ�. ��, SutdaCard�� �ν��Ͻ����� isKwang�� ���� true�̾��
 * �Ѵ�.
 */

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
//		�迭 SutdaCard�� ������ �ʱ�ȭ �Ͻÿ�.
//		�ʱ�ȭ �ؾߵǴ� �͵� -> num, isKwang
//		��� -> 1K,2,3K,4..8K,...10,1,2...10,
//		num -> 1~10,1~10 �ι� �ݺ��ǰ�
//		isKwang -> ù��° 1,3,8���� true
		int num = 0;
		boolean isKwang = false;
		for(int i=1;i<=CARD_NUM;i++){ // i = 1 ~ 20
			num = i % 10;
			isKwang = i<=10 && (i==1 || i==3 || i==8);
			
			cards[i] = new SutdaCard(num, isKwang);
		}
	}

}

class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	// info()��� ObjectŬ������ toString()�� �������̵��ߴ�.
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

public class Ex7_01 {
	public static void main(String[] args) {

	SutdaDeck deck = new SutdaDeck();
		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
	
	}
}