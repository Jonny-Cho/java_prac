package ch4_prac;

public class Ex4_15 {

	public static void main(String[] args) {
		int number = 123454321;
		int tmp = number;
		int length = (int)(Math.log10(number)+1);
		int result =0; // number ���� �� �Ųٷ� ��ȯ�ؼ� ���� ����
		for(int i=0;i<length;i++){
			tmp = ((int)(number/(Math.pow(10, i))%10));
//				System.out.println(tmp);
			result += tmp*(int)(Math.pow(10, (length-1)-i));
		}
//		System.out.println(result);
		
		if(number == result)
			System.out.println( number + "�� ȸ���� �Դϴ�.");
		else
			System.out.println( number + "�� ȸ������ �ƴմϴ�.");
	}

}