package ch4_prac;

public class Ex4_13 {

	public static void main(String[] args) {
		// ���ڿ��� �������� �Ǻ��ϴ� ���α׷�
		
		String value = "12o34";
		char ch = '0';
		boolean isNumber = true;
		// �ݺ����� charAt(int i)�� �̿��ؼ� ���ڿ��� ���ڸ�
		// �ϳ��� �о �˻��Ѵ�
		
		for(int i=0; i < value.length() ;i++) {
			int target = ((int)(value.charAt(i)))-ch;
//			System.out.println(target);
			if( 0<= target && target <=9 ){
				isNumber = true;
			} else {
				isNumber = false;
				break;
			}
		}
		
		if (isNumber) {
			System.out.println(value+"�� �����Դϴ�.");
		} else {
			System.out.println(value+"�� ���ڰ� �ƴմϴ�."); 
		}
	}

}