package ch8;

public class FinallyTest3 {

	public static void main(String[] args) {
		// method1()�� STATIC�޼����̹Ƿ� �ν��Ͻ� �������� ���� ȣ���� �����ϴ�.
		FinallyTest3.method1();
		System.out.println("method1()�� ������ ��ġ�� main�޼���� ���ƿԽ��ϴ�.");
	}
	
	static void method1(){
		try {
			System.out.println("method1()�� ȣ��Ǿ����ϴ�.");
			return; //return���־ finally���� ���� �� �޼��� ����
		} catch (Exception e) {
			System.out.println("���� �߻�");
		} finally {
			System.out.println("method1()�� finally������ ����Ǿ����ϴ�.");
		}
	}

}