package ch5_prac;

public class Ex5_07 {

	public static void main(String[] args) {
		// run->run configulations ���� arguments�� 3120 �Է��ϱ�
		
		if(args.length!=1) {
			System.out.println("USAGE: java Exercise5_7 3120");
			System.exit(0);
		}
		
//		 ���ڿ��� ���ڷ� ��ȯ�Ѵ� �Է��� ���� ���ڰ� �ƴ� ��� ���ܰ� �߻��Ѵ�
		
		int money = Integer.parseInt(args[0]);
	
		System.out.println("money="+money);
		
		int[] coinUnit = {500, 100, 50, 10 }; // ������ ����
		
		int[] coin = {5, 5, 5, 5}; // ������ ������ ����
		
		/* (1) . �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�
		1. �ݾ�(money)�� ���������� ������ �ʿ��� ������ ����(coinNum)�� ���Ѵ�
		2. �迭 coin ���� coinNum ��ŭ�� ������ ����
		(���� ����� ������ ���ٸ� coin �迭�� �ִ� ��ŭ�� ����)
		3. �ݾ׿��� ������ ����(coinNum)�� ���������� ���� ���� ���� 
		 */

		for(int i=0;i<coinUnit.length;i++) {
			int coinNum = 0;
		
			//(1)
			coinNum = money / coinUnit[i];

			//(2)
			if(coin[i]-coinNum >= 0){
				coin[i] -= coinNum;
			} else {
				coin[i] -= coin[i];
			}
			
			//(3)
			money = money - (coinNum* coinUnit[i]);
			
			System.out.printf("%d��: %d%n", coinUnit[i], coinNum);
		}
		
		if(money > 0) {
			System.out.println("�Ž������� �����մϴ�.");
			System.exit(0); // . ���α׷��� �����Ѵ�
		}
		
		System.out.println("= ���� ������ ���� =");
		
		for(int i=0;i<coinUnit.length;i++) {
			System.out.println(coinUnit[i]+"��: "+coin[i]);
		}
	}

}