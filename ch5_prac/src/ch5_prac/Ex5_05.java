package ch5_prac;

public class Ex5_05 {

	public static void main(String[] args) {
		// 5-5 1��9 ������ �ߺ����� ���� 3�ڸ� ���ڸ� ����� ���α׷��̴�.
		// ���α׷��� �ϼ��Ͻÿ�

		int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] ball3 = new int[3];

		// �迭 ballArr �� ������ ��Ҹ� ��� ��ġ�� �ٲ۴�
		for (int i = 0; i < ballArr.length; i++) {
			int j = (int) (Math.random() * ballArr.length);
			int tmp = 0;
			// (1) . �˸��� �ڵ带 �־� �ϼ��Ͻÿ�
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
		}

		// �迭 ballArr �� �տ��� 3 ���� ���� �迭 ball3�� �����Ѵ�
		// (2)
		for (int i = 0; i < 3; i++) {
			ball3[i] = ballArr[i];
		}

		for (int i = 0; i < ball3.length; i++) {
			System.out.print(ball3[i]);
		}

	}

}