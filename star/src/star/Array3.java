package star;

public class Array3 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 1, 2, 3 };
		int cnt = 0;
		
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == arr2[i]) {
				cnt++;
			}
		}
		
		// ���� ���� ������ �迭�� ���̿� ���� ��.
		if (cnt==arr1.length) {
			System.out.println("�����ϴ�");
		} else {
			System.out.println("�ٸ��ϴ�.");
		}
	}

}