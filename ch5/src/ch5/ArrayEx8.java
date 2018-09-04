package ch5;

public class ArrayEx8 {
	public static void main(String[] args) {
		// 45�� ũ���� �迭 ����
		int[] ball = new int[45];
		
		// �迭�� 1~45���� ���� ä���
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}
		
		// �ٲ� �� �ʿ��� temp ����
		int temp = 0;
		// ���� �迭�� �����ϱ� ���� j ����
		int j = 0;
		
		// �迭�� i��° ��ҿ� ������ ��ҿ� ����� ���� �ٲ۴�
		for(int i=0; i<6;i++){
			j = (int)(Math.random()*45);
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
		}
		
		// �迭�� �տ������� 6�� ��Ҹ� ���
		for(int i=0;i<6;i++){
			System.out.printf("ball[%d]=%d%n", i, ball[i]);
		}
	}
}