package ch11;

public class MyVectorTest {

	public static void main(String[] args) {
		MyVector v = new MyVector();
		
//		v.add("0"); // 4. �̰� �ž� �ϴ� �Լ� add �����
//		v.add("1"); // ������ �ʰ��ص� ������ ���� �ʰ� �ڵ����� �迭 ũ�⸦ �÷���� �Ѵ�.
//		v.add("2");
//		v.add("3");
//		v.add("4");
//		v.add("5");
//		v.add("6");

		for(int i=0;i<15;i++){
			v.add(i+"");
		}
		
		for(int i=0;i<20;i++){
			System.out.println(v.get(i));
		}
		
		System.out.println(v.indexOf("5")); // "5"�� �ִ� ��ġ5��ȯ
		
		v.remove("1");
		v.remove("5");
		
		for(int i=0;i<20;i++){
			System.out.println(v.get(i));
		}
	}

}