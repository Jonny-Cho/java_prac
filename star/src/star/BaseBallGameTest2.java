package star;

import static org.junit.Assert.*;

import org.junit.Test;

public class BaseBallGameTest2 {

	String check(String s1, String s2){
		int sCnt = 0; // 스트라이크 갯수
		int bCnt = 0; // 볼 갯수
		for(int i=0; i < s1.length(); i++){
			for(int j=0; j < s2.length(); j++){
				if(s1.charAt(i)==s2.charAt(j)){
					// 자리도 같고, 숫자도 같으면
					if(i==j){
						sCnt++;
					}
					// 자리는 다른데, 숫자는 같으면
					else {
						bCnt++;	
					}
				}
			}
		} 
		return (sCnt+"S"+bCnt+"B");
	}
	@Test public void test1() { assertTrue(check("123","234").equals("0S2B"));}
	@Test public void test2() { assertTrue(check("465","465").equals("3S0B"));}
	@Test public void test3() { assertTrue(check("759","758").equals("2S0B"));}
	@Test public void test4() { assertTrue(check("465","315").equals("1S0B"));}
	@Test public void test5() { assertTrue(check("123","231").equals("0S3B"));}
}
