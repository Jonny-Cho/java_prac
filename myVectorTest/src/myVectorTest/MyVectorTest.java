package myVectorTest;

class MyVector{
	Object[] objArr; // iv
	int size;
	
	MyVector(){
		this(16);
	}
	
	MyVector(int capacity){
		if(capacity < 0) 
			throw new IllegalArgumentException("capacity can't be zero or nagative.");
		objArr = new Object[capacity]; // ��ü�迭 �ʱ�ȭ
	}
	
	int size(){
		return size;
	}
	
	boolean isEmpty(){
		return size==0;
	}
	
	Object get(int index){
		if(index < 0)
			throw new IllegalArgumentException("index must not be negative.");
		return objArr[index];
	}
	
	void clear(){
		for(int i=0;i<objArr.length;i++){
			objArr[i] = null;
		}
		size = 0;
	}
	
	boolean add(Object obj){
		// ���� �����ϸ�
		if(size == objArr.length){
			// 1. ũ�� 2�� ����
			Object[] newObjArr = new Object[objArr.length*2];
			// 2. ���� ���뺹��
			System.arraycopy(objArr, 0, newObjArr, 0, size);
			// 3. �������� ����
			objArr = newObjArr;
		} 
		// obj(���� ��)�� objArr�� �߰�
		objArr[size++] = obj;
		return true;
	}
	
	int indexOf(Object obj){
		for(int i=0; i<size; i++){
			if(objArr==obj || obj.equals(objArr[i])){
				return i;
			}
		}
		return -1;
	}
	
	Object remove(Object obj){
		int idx = indexOf(obj);
		
		if(idx==-1) return null;
		
		Object oldObj = objArr[idx];
		
		// 1. ������ ��ġ �Ʒ��� ��Ҹ� �ϳ��� ����
		// ������ ����� ���(idx�� size-1�� ���) ������ �ʿ䰡 ����.
		if(idx!=size-1)
			System.arraycopy(objArr, idx+1, objArr, idx, size-idx-1);
		// 2. ������ ��� null��
		// 3. size--;
		objArr[--size] = null;
		
		return oldObj;
	}
}

public class MyVectorTest {
	public static void main(String[] args) {
		MyVector v = new MyVector(5);
		v.add("111");
		v.add("222");
		v.add("333");
		v.add("444");
		v.add("555");
		v.add("666");
	}
}