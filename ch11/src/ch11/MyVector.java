package ch11;

import java.util.ArrayList;

public class MyVector {

	// 1. Object�迭 objArr�� �ν��Ͻ� ������ ���� MyVector Ŭ������ ����
	Object[] objArr;
	
	// 2. MyVectorŬ������ ������ MyVector(int capacity)�� �⺻ ������(capacity=16)�� �߰��Ͻÿ�.

	int size; // ������ �����Ͱ� ���� ä���� ũ��
	
	MyVector(int capacity){
		objArr = new Object[capacity]; //��ü �ʱ�ȭ
	}
	
	MyVector(){
		this(5);
	}
	
	// 3. MyVectorŬ������ ��ü�迭�� ����� ��ü�� ������ �����ϱ� ���� �ν��Ͻ� ���� size�� �߰��ϰ�,
	// �� ������ ���� ��ȯ�ϴ� size()�� �迭 objArr�� ���̸� ��ȯ�ϴ� capacity(), �׸��� ��ü�迭�� ������� Ȯ���ϴ�
	// boolean isEmpty()�� �ۼ��Ͻÿ�.
	
	int size(){	return size; }
	int capacity(){	return objArr.length; }
	boolean isEmpty(){ return size==0; }
	
	// 4. ��ü�迭 objArr�� ��ü�� �߰��ϴ� �޼��� void add(Object obj)�� �ۼ��Ͻÿ�.
	// v.add(new Integer(4));
	
	void add(Object obj){
		// ���������� ����, ����������? �����ø��� ����
		
		if(size<objArr.length){
			objArr[size++] = obj;
		} else {
			// 1. ���ο� ��ü �迭 ����
//			System.out.println(objArr.length*2);
			Object[] tmp = new Object[objArr.length*2]; // ���ο� ��ü �迭 ����
			
//			System.out.println(tmp.length);
			// 2. ����
			for(int i=0;i<size;i++){
				tmp[i] = objArr[i];
			}
			// 3. �������� ��(�ּ�) ����
			objArr = tmp;
			
			// 4. ��ü�����ϰ� ������ ����
			objArr[size++] = obj;
			
		}
	}
	
	// 5. ��ü�迭 objArr�� ����� ��ü�� ��ȯ�ϴ� Object get(index)�� �ۼ��Ͻÿ�.
	// v.get(0) �ϸ� 0��° �ִ� ���� ��ȯ�ϴ� �Լ������ 
	
	Object get(int index){
		return objArr[index];
	}
	
	// 6. toString()
	// 7. MyVectorŬ������ ��ü�迭 objArr���� ������ ��ü�� ����Ǿ� �ִ� ��ġ(index)�� ��ȯ�ϴ� 
	// int indexOf(Object obj)�� �ۼ��Ͻÿ�.
	
	int indexOf(Object obj){
		for(int i=0;i<size;i++){
			if(obj.equals(objArr[i])) // ==�� �ּҰ� ��
				return i;
		}
		return -1;
	}
	
	boolean remove(Object obj){
		for(int i=0; i< size; i++){
			if(obj.equals(objArr[i])){
				remove(i);
				return true;
			}
		}
		return false;
	}
	
	Object remove(int index){
		Object oldObj = null;
		
		if(index < 0 || index >= size)
			throw new IndexOutOfBoundsException("������ ������ϴ�.");
		oldObj = objArr[index];
		
		if(index != size-1){
			System.arraycopy(objArr, index+1, objArr, index, size-index-1);
		}
		
		objArr[size-1] = null;
		size--;
		
		return oldObj;
	}
	
}