package ch5;

public class Counting {

	public static void main(String[] args) {
		int[] numArr = {1,2,4,4,1,3,3,1,3,5,7,5,5};
		int[] cntArr = new int[10];
		
		//ī����
		for(int i=0;i<numArr.length;i++){
			cntArr[numArr[i]]++;
		}
		
		//ī���� ��� ���
		for(int i=0;i<cntArr.length;i++){
			System.out.printf("cntArr[%d]=%d%n", i, cntArr[i]);
		}
		
		//�������� ����
		for(int i=0;i<cntArr.length;i++){
			for(int j=0;j<cntArr[i];j++){
				System.out.print(i);
			}
		}
		System.out.println();
		//�ߺ�����
		for(int i=0;i<cntArr.length;i++){
			if(cntArr[i]!=0){
				System.out.print(i);
			}
		}
	}

}