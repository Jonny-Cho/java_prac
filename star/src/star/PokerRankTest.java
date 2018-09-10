package star;

import static org.junit.Assert.*;

import org.junit.Test;

public class PokerRankTest {

	@Test
	public void test() {
		Card[] cards = {
				new Card(2,1),new Card(1,2),new Card(1,3),new Card(1,4),new Card(1,5),
		};
		assertTrue(rankCheck(cards).equals("STRAIGHT"));
	}
	
	@Test
	public void test2() {
		Card[] cards = {
				new Card(2,1),new Card(1,1),new Card(1,3),new Card(1,4),new Card(1,5),
		};
		assertTrue(rankCheck(cards).equals("ONE PAIR"));
	}
	
	@Test
	public void test3() {
		Card[] cards = {
				new Card(2,1),new Card(1,1),new Card(1,3),new Card(1,3),new Card(1,5),
		};
		assertTrue(rankCheck(cards).equals("TWO PAIR"));
	}
	
	@Test
	public void test4() {
		Card[] cards = {
				new Card(2,1),new Card(1,1),new Card(1,1),new Card(1,3),new Card(1,5),
		};
		assertTrue(rankCheck(cards).equals("THREE CARD"));
	}
	
	@Test
	public void test5() {
		Card[] cards = {
				new Card(1,1),new Card(1,1),new Card(1,1),new Card(1,1),new Card(1,5),
		};
		assertTrue(rankCheck(cards).equals("FOUR CARD"));
	}
	
	@Test
	public void test6() {
		Card[] cards = {
				new Card(1,1),new Card(1,1),new Card(1,1),new Card(1,5),new Card(1,5),
		};
		assertTrue(rankCheck(cards).equals("FULL HOUSE"));
	}
	
	@Test
	public void test7() {
		Card[] cards = {
				new Card(1,3),new Card(1,2),new Card(1,1),new Card(1,7),new Card(1,8),
		};
		assertTrue(rankCheck(cards).equals("FLUSH"));
	}
	
	@Test
	public void test8() {
		Card[] cards = {
				new Card(2,3),new Card(1,5),new Card(1,7),new Card(1,9),new Card(1,1),
		};
		assertTrue(rankCheck(cards).equals("NO RANK"));
	}
	
	@Test
	public void test9() {
		Card[] cards = {
				new Card(1,3),new Card(1,4),new Card(1,5),new Card(1,6),new Card(1,7),
		};
		assertTrue(rankCheck(cards).equals("STRAIGHT FLUSH"));
	}
	
	String rankCheck(Card[] cArr){
		String result = "";
		
//		��Ŀ ����(�ڵ带 �������� ��ġ�ؾ� �켱���� ����) -> �ǵ��� boolean���� �ۼ��ϰ� �� �ؿ��� ������������
//		ž
//		�����
//		�����
//		Ʈ����
//		��Ʈ����Ʈ
//		�÷���
//		Ǯ�Ͽ콺
//		��ī��
//		��Ʈ����Ʈ �÷���
		
		
		// 1) �÷��� ī����
		
		int[] flushCnt = new int [4]; // 0~4 flush ī��Ʈ �迭 (0 ������)
		for(int i=0;i<cArr.length;i++){
			flushCnt[cArr[i].kind]++;
		}
//		// �÷��� ī���� üũ
//		for(int i=0;i<flushCnt.length;i++){
//			System.out.printf("flushCnt[%d]=%d%n",i,flushCnt[i]);	
//		}
		
		// 2) number counting
		int[] cntArr = new int [14]; // 0~13 ���� ī��Ʈ �迭 (0 ������)
		for(int i=0;i<cArr.length;i++){
			cntArr[cArr[i].num]++;
		}
		
		// ���� ī���� üũ
//		for(int i=0;i<cntArr.length;i++){
//			System.out.printf("cntArr[%d]=%d%n",i,cntArr[i]);	
//		}
		
		// ��Ʈ����Ʈ �Ǻ�
		
		boolean isStraight = false;
		for(int i=0;i<10;i++){ // i�� 9�϶� j�� 9,10,11,12,13�̴�.
			int stCnt = 0; // straight ī��Ʈ
			if(cntArr[i]==1){ // ó���� 1�� �߰��ϸ� 5�� �ݺ�
				for(int j=i;j<=i+4;j++){ // i=0 -> j=0~4, i=1 -> j=1~5 ..
					if(cntArr[j]==1){
						stCnt++;
					}
					if(stCnt==5){
						isStraight = true;
						break;
					}
				}
			}
		}
		
		// �÷��� �Ǻ�
		boolean isFlush = false;
		for(int i=0;i<flushCnt.length;i++){
			if(flushCnt[i]==5){
				isFlush = true;
			}
		}

		
//		System.out.println(result);
		
		// ��� �Ǻ�
		int pairCnt = 0; // pair ī��Ʈ
		boolean isThreeCard = false;
		boolean isFourCard = false;
		
		for(int i=0;i<cntArr.length;i++){
			if(cntArr[i]==2){
				pairCnt++;
			} else if(cntArr[i]==3) {
				isThreeCard = true;
			}
			else if(cntArr[i]==4){
				isFourCard = true;
			}
		}
		
		if(pairCnt==0 && isStraight==false && isFlush==false){ result = "NO RANK"; } 
		if(pairCnt==1){ result = "ONE PAIR"; }
		if(pairCnt==2){ result = "TWO PAIR"; }
		if(isThreeCard == true){ result = "THREE CARD"; }
		if(isStraight==true){ result = "STRAIGHT";}
		if(isFlush==true){ result = "FLUSH";}
		if(isThreeCard == true && pairCnt ==1){ result = "FULL HOUSE"; }
		if(isFourCard == true){ result = "FOUR CARD"; }
		if(isStraight==true && isFlush==true){result = "STRAIGHT FLUSH";}
		
		System.out.println(result);
		return result;
	}
}

class Card {
	int kind;
	int num;
	
	Card(int kind, int num){
		this.kind = kind;
		this.num = num;
	}
	
	public String toString(){
		return "kind = " + kind + ", num = "+ num;
	}
}