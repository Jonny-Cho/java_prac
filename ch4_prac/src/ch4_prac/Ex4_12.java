package ch4_prac;

public class Ex4_12 {

	public static void main(String[] args) {
	// 구구단 3자리 출력
		
		for(int i=2;i<=9;i++){
			for(int j=1;j<=3;j++){
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println("\t");
		}
	}

}
