package ch6_prac;

class MyPoint {
	int x;
	int y;
	
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 1) �ν��Ͻ��޼��� getDistance �ۼ�
	double getDistance(int x1, int y1) { // im
		double result = Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1)); 
		return result;
	}
	
}
	
class Ex6_07 {
	
	public static void main(String args[]) { //cm -> cm ȣ��
		MyPoint p = new MyPoint(1,2);
//		System.out.println(p.y);
		// p�� (2,2)�� �Ÿ��� ���Ѵ�
		System.out.println(p.getDistance(2,2));
	}
		
}
