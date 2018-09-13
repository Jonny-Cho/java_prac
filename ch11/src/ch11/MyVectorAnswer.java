package ch11;

public class MyVectorAnswer {
	Object[] objArr; //객체배열
	int size;
	
	MyVectorAnswer(int capacity){
		if(capacity < 0)
			throw new IllegalArgumentException("유효하지 않은 값입니다.");
		
		objArr = new Object[capacity];
	}
	
	MyVectorAnswer(){
		this(10);
	}
	
	int size(){ return size; }
	int capacity() { return objArr.length; }
	boolean isEmpty() { return size==0; }
	
	void clear() {
		for(int i=0; objArr.length; i++){
			objArr[i] = null;
		// 모든 값을 null로 바꾼다
		size = 0;
		// size를 0으로 바꾼다
		}
	}
	
	Object get(int index) {
		if(index < 0 || index >= size)
			throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
		
		return objArr[index];
	}
	
	int indexOf(Object obj){ // 순차검색
		for(int i=0;i<size;i++)
			if(objArr[i].equals(obj))
				return i;
		
		return -1;
	}
	
	void setCapacity(int capacity){
		Object[] tmp = new Object[capacity];
		System.arraycopy(objArr, 0, tmp, 0, Math.min(size,  capacity)); // objArr 0번째를 tmp 0번째로 ~만큼 복사
		
		objArr = tmp; // 참조변수 변경
	}
	
	void ensureCapacity(int minCapacity){
		if(minCapacity > objArr.length)
			setCapacity(minCapacity);
	}
	
	Object remove(int index) {
		if(index < 0 || index >= size)
			throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
		
		Object oldObj = objArr[index];
		
		if(index!=size-1)
			System.arraycopy(objArr, index+1, objArr, index, size-1-index);
//		objArr[size-1]=null;
//		size--;
		objArr[--size]=null;
		
		return oldObj;
	}
	
	boolean add(Object obj){
		ensureCapacity(size+1);
		objArr[size] = obj;
		size++;
		return true;
	}
	
	public String toString() {
		String tmp = "[";
		for(int i=0;i<size;i++)
			tmp += objArr[i] + ",";
		
		return tmp + "]";
	}
	
}
