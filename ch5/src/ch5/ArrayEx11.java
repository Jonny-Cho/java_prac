package ch5;

import java.util.Arrays;

public class ArrayEx11 {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		// ���ڰ� ��� ��Ÿ������ Ȯ���ϴ� �迭
		int[] counter = new int[10];
		
		// �������� 10���� ���� numArr �迭�� �ֱ�
		for(int i=0; i<numArr.length;i++){
			numArr[i] = (int)(Math.random()*10);
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		// �ѹ� ���� 0~9 �� � �ִ��� counter[0]�� ����Ѵ� 
		for(int i=0; i<numArr.length;i++){
			counter[numArr[i]]++;
		}
		
		for(int i=0; i<numArr.length;i++){
			System.out.println(i+"�� ���� : "+counter[i]);
		}		
	}
}