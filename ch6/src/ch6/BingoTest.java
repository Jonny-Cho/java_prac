package ch6;

import static org.junit.Assert.*;

import org.junit.Test;

public class BingoTest {

	int bingoCheck(int[][] board){
		int bingoCnt = 0;
		int cnt1 = 0; // ���� ī��Ʈ
		int cnt2 = 0; // ���� ī��Ʈ
		int cnt3 = 0; // �밢��1 ī��Ʈ
		int cnt4 = 0; // �밢��2 ī��Ʈ
		
		for(int i=0;i<board.length;i++){
			cnt1 = 0; cnt2 =0;
			for(int j=0;j<board[i].length;j++){
				if(board[i][j]==1){cnt1++;};
				if(board[j][i]==1){cnt2++;};
				if(i==j && board[i][j]==1){cnt3++;};
				if(i+j==4 && board[i][j]==1){cnt4++;};
			}
			if(cnt1==5){bingoCnt++;};
			if(cnt2==5){bingoCnt++;};
		}
		if(cnt3==5){bingoCnt++;};
		if(cnt4==5){bingoCnt++;};
		
		return bingoCnt;
}

	@Test
	public void test() {
		int[][] board = {
				{1,1,1,1,1},
				{1,1,1,1,1},
				{1,1,1,1,1},
				{1,1,1,1,1},
				{1,1,1,1,1}
		};
		assertTrue(bingoCheck(board)==12);
	}
	
	@Test
	public void test2() {
		int[][] board = {
				{1,1,1,1,1},
				{1,0,0,0,0},
				{1,0,0,0,0},
				{1,0,0,0,0},
				{1,0,0,0,0}
		};
		assertTrue(bingoCheck(board)==2);
	}
	
	@Test
	public void test3() {
		int[][] board = {
				{1,1,1,1,1},
				{1,1,0,1,0},
				{1,0,1,1,1},
				{1,1,0,1,1},
				{1,0,0,0,1}
		};
		assertTrue(bingoCheck(board)==4);
	}
	
	@Test
	public void test4() {
		int[][] board = {
				{1,1,1,1,1},
				{1,1,0,1,0},
				{1,1,1,1,1},
				{1,1,0,1,1},
				{1,0,0,0,1}
		};
		assertTrue(bingoCheck(board)==5);
	}
	
	@Test
	public void test5() {
		int[][] board = {
				{1,1,1,1,1},
				{1,1,1,1,1},
				{1,1,1,1,1},
				{1,1,1,1,1},
				{1,0,1,0,1}
		};
		assertTrue(bingoCheck(board)==9);
	}
	
	

}