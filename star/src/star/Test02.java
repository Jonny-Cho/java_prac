package star;

public class Test02 {

	public static void main(String[] args) {
		
		// 1~100 answer . ������ ������ ���� �� �� �����Ѵ�
		int answer = (int)(Math.random()*100)+1; // (1)
		int input = 0; // ������Է��� ������ ����
		int count = 0; // �õ�Ƚ���� �������� ����
		// Scanner ȭ������ ���� ������Է��� �ޱ� ���ؼ� Ŭ���� ���
		java.util.Scanner s = new java.util.Scanner(System.in);
		do {
		count++;
		System.out.print("1�� 100������ ���� �Է��ϼ��� :");
		input = s.nextInt(); // input �Է¹��� ���� ���� �� �����Ѵ�
		
			if(input<answer){
				System.out.println("�� Ů�ϴ�");
			} else if (input == answer ){
				System.out.println("����");
				System.out.println(count+"��");
			}
			else {
				System.out.println("�� �۽��ϴ�");
			}
			
		} while(true); // ���ѹݺ���
//		System.out.println(count);
	}
}