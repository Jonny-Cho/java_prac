package ch5;

import java.util.Arrays;

public class ArrayEx {
	public static void main(String[] args) {
		// �ߺ�����
		// (ī���� - �迭�� �̿��ؼ� �� ������ ������ ����)
		// 1. ī�������� �迭 numArr�� �������� �����Ͻÿ�.
		// (1,1,1,2,3,3,3,4,4,5,5,5,7)
		// 2. ī�������� �ߺ��� ������ ����� ����Ͻÿ�.
		// (1,2,3,4,5,7)
		
		
//		newArr[0]==1
//		newArr[1]==1
//		newArr[2]==1
//		newArr[3]==2
//		newArr[4]==3
//		newArr[5]==3
//		newArr[6]==3
//		newArr[7]==4
//		newArr[8]==4
//		newArr[9]==5
//		newArr[10]==5
//		newArr[11]==5
//		newArr[12]==7
// 1, 3����� / 2, 1����� ...
		
		
		int[] numArr = {1,2,4,4,1,3,3,1,3,5,7,5,5};
		int[] counter = new int[numArr.length];
			
		for(int i=0;i<numArr.length;i++){
			counter[numArr[i]]++;
		}
		
		for(int i=0;i<numArr.length-1;i++){
			for(int j=0;j<counter[i];j++){
				System.out.print(i);
			}
		}
		
		
		System.out.println();
		
		for(int i=0;i<numArr.length;i++){
			if(counter[i]!=0){
				System.out.print(i);
			}
		}
	}
}