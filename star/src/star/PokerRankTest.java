package star;

import static org.junit.Assert.*;

import org.junit.Test;

public class PokerRankTest {
	
	@Test
	public void test1() {
		Card[] cards = {
				new Card(2,3),new Card(1,5),new Card(1,7),new Card(1,9),new Card(1,1),
		};
		assertTrue(rankCheck(cards).equals("NO RANK"));
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
				new Card(2,1),new Card(1,2),new Card(1,3),new Card(1,4),new Card(1,5),
		};
		assertTrue(rankCheck(cards).equals("STRAIGHT"));
	}

	@Test
	public void test6() {
		Card[] cards = {
				new Card(1,3),new Card(1,2),new Card(1,1),new Card(1,7),new Card(1,8),
		};
		assertTrue(rankCheck(cards).equals("FLUSH"));
	}

	
	@Test
	public void test7() {
		Card[] cards = {
				new Card(1,1),new Card(1,1),new Card(1,1),new Card(1,5),new Card(1,5),
		};
		assertTrue(rankCheck(cards).equals("FULL HOUSE"));
	}
	
	@Test
	public void test8() {
		Card[] cards = {
				new Card(1,1),new Card(1,1),new Card(1,1),new Card(1,1),new Card(1,5),
		};
		assertTrue(rankCheck(cards).equals("FOUR CARD"));
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
		
//		포커 족보(코드를 낮은곳에 배치해야 우선순위 높다) -> 되도록 boolean으로 작성하고 맨 밑에서 순서조절하자
//		탑
//		원페어
//		투페어
//		트리플
//		스트레이트
//		플러시
//		풀하우스
//		포카드
//		스트레이트 플러시
		
		int pairCnt = 0; // pair 카운트
		boolean isStraight = false;
		boolean isFlush = false;
		boolean isThreeCard = false;
		boolean isFourCard = false;
		
		// 1) 플러시 카운팅
		
		int[] flushCnt = new int [4]; // 0~4 flush 카운트 배열 (0 사용안함)
		for(int i=0;i<cArr.length;i++){
			flushCnt[cArr[i].kind]++;
		}
//		// 플러시 카운팅 체크
//		for(int i=0;i<flushCnt.length;i++){
//			System.out.printf("flushCnt[%d]=%d%n",i,flushCnt[i]);	
//		}
		
		// 2) number counting
		int[] cntArr = new int [14]; // 0~13 갯수 카운트 배열 (0 사용안함)
		for(int i=0;i<cArr.length;i++){
			cntArr[cArr[i].num]++;
		}
		
		// 숫자 카운팅 체크
//		for(int i=0;i<cntArr.length;i++){
//			System.out.printf("cntArr[%d]=%d%n",i,cntArr[i]);	
//		}
		
		// 스트레이트 판별
		
		for(int i=0;i<10;i++){ // i가 9일때 j가 9,10,11,12,13이다.
			int stCnt = 0; // straight 카운트
			if(cntArr[i]==1){ // 처음에 1을 발견하면 5개 반복
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
		
		// 플러시 판별
		for(int i=0;i<flushCnt.length;i++){
			if(flushCnt[i]==5){
				isFlush = true;
			}
		}

		// 페어 판별
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
		
		if(pairCnt==0 && isFlush==false){ result = "NO RANK"; } 
		if(pairCnt==1){ result = "ONE PAIR"; }
		if(pairCnt==2){ result = "TWO PAIR"; }
		if(isThreeCard){ result = "THREE CARD"; }
		if(isStraight){ result = "STRAIGHT";}
		if(isFlush){ result = "FLUSH";}
		if(isThreeCard && pairCnt ==1){ result = "FULL HOUSE"; }
		if(isFourCard){ result = "FOUR CARD"; }
		if(isStraight && isFlush){result = "STRAIGHT FLUSH";}
		
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
