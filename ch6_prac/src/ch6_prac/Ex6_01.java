package ch6_prac;

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true); // 1��
	}
	
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info() {
		return num + (isKwang ? "K" : "");
	}
	
}

public class Ex6_01 {

	public static void main(String[] args) {
		// SutdaCard
		
	}

}