package ch4_prac;

public class Ex4_05 {

	public static void main(String[] args) {
		// 1+(-2)+3+(-4)+...  �� ���� ������ ��� ���س����� ��, ����� ���ؾ�
		// ������ 100 �̻��� �Ǵ��� ���Ͻÿ�
		int sum = 0;
		int i = 0;
		for(i=1;true;i++){
			if(i%2==0){
				sum -= i;
			} else {
				sum += i;
			}
			if(sum >= 100){
				System.out.println(i+"�� ° �϶�");
				System.out.println("���� : "+sum);
				break;
			}
		}
	}

}