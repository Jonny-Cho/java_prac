package ch6;

class Math {
	long add(long a, long b){
		long result = a + b;
		return result;
	}
	
	//�޼���-> �߰����� ��ȯ -> �������� ���� �� ��� �� ��ȯ
	int tmp = 0;
	int mid(int x, int y, int z){
		//
		if(x>y){
			tmp = x;
			x = y;
			y = tmp;
		}
		if(y>z){
			tmp = y;
			y = z;
			z = tmp;
		}
		if(x>y){
			tmp = x;
			x = y;
			y = tmp;
		}
		return y;
	}
}

class MyMath {
	public static void main(String[] args) {
		Math mm = new Math();
		long result = mm.add(1,2);
		System.out.println(result);
		
		long midresult = mm.mid(1,4,3);
		System.out.println(midresult); //3
		System.out.println(mm.mid(1, 2, 3)); //2
		System.out.println(mm.mid(5, 6, 4)); //5
		System.out.println(mm.mid(6, 1, 4)); //4
		System.out.println(mm.mid(4, 7, 6)); //6
	}
}