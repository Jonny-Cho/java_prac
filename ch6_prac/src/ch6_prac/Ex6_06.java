package ch6_prac;

class Ex6_06 {
	// (x,y) (x1,y1) . �� �� �� ���� �Ÿ��� ���Ѵ�
	//Math.sqrt

	static double getDistance(int x, int y, int x1, int y1) { // cm
		double result = Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1)); 
		return result;
		
	}
	
	public static void main(String args[]) { //cm -> cm ȣ��
		System.out.println(getDistance(1,1,2,2));
	}
		
}
