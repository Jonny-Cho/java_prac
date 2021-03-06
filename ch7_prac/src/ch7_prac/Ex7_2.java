package ch7_prac;

/*
 * [7-2] 
 */

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
		int num = 0;
		for (int i = 0; i < CARD_NUM; i++) {
			boolean isKwang = false;
			num = num % 10 + 1;
			if (i < 9 && (num == 1 || num == 3 || num == 8))
				isKwang = true;
			cards[i] = new SutdaCard(num, isKwang);
		}
	}

	void shuffle() {
		for (int i = 0; i < CARD_NUM; i++) {
			int random = (int) (Math.random() * CARD_NUM);
			SutdaCard tmp = cards[i];
			cards[i] = cards[random];
			cards[random] = tmp;
		}
	}

	SutdaCard pick(int index) {
		return cards[index];
	}
	
	 SutdaCard pick(){
		 int random = (int)(Math.random()*CARD_NUM);
		 return cards[random];
	 }

}

//class SutdaCard {
//	int num;
//	boolean isKwang;
//
//	SutdaCard() {
//		this(1, true);
//	}
//
//	SutdaCard(int num, boolean isKwang) {
//		this.num = num;
//		this.isKwang = isKwang;
//	}
//
//	// info()대신 Object클래스의 toString()을 오버라이딩했다.
//	public String toString() {
//		return num + (isKwang ? "K" : "");
//	}
//}

public class Ex7_2 {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		
		deck.shuffle();
		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
		
		System.out.println();
		
		System.out.println(deck.pick(0));
	}

}
