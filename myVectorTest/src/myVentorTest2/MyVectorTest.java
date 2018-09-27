package myVentorTest2;

class MyVector {
	Object[] objArr;
	int size;

	MyVector() {
		this(16);
	}

	MyVector(int capacity) {
		// ��ü �ʱ�ȭ
		objArr = new Object[capacity];
	}

	int size() {
		return size;
	}

	int capacity() {
		return objArr.length;
	}

	boolean isEmpty() {
		return size == 0;
	}

	Object get(int index) {
		return objArr[index];
	}

	void add(Object obj) {
		if (size == objArr.length) {
			// 1. �迭 2��
			Object[] tmp = new Object[objArr.length * 2];
			// 2. ����
			System.arraycopy(objArr, 0, tmp, 0, size);
			// 3. �������� ����
			objArr = tmp;
		}

		objArr[size++] = obj;
	}

	int indexOf(Object obj) {
		for (int i = 0; i < size; i++) {
			if (obj.equals(objArr[i])) {
				return i;
			}
		}
		return -1;
	}

	Object remove(Object obj) {
		// 1. indexOf ã��
		int idx = indexOf(obj);

		// ������ ��ü �����
		Object oldArr = objArr[idx];
		
		
		// 2. ����� ĭ�� ���� ������
		System.arraycopy(objArr, idx+1, objArr, idx, size-idx-1);
		// 3. �� ���� null(�� ���� ������ ���� ����)
		if(idx!=size-1)
			objArr[size-1] = null;
		// 4. size--;
		size--;
		
		return oldArr; // ��ü ����
	}

	public String toString() {
		String tmp = "[";
		for (int i = 0; i < size; i++)
			tmp += objArr[i] + ",";
		return tmp + "]";
	}
}

public class MyVectorTest {
	public static void main(String[] args) {
		MyVector v = new MyVector(3);
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		v.add(6);
		v.add(7);
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		v.remove(5);
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println(v.indexOf(7));
	}
}