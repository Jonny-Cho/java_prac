package star;
import java.util.Arrays;
import java.util.Scanner;

public class BaseBallGame {

	public static void main(String[] args) {
		int[] arr1 = new int[3]; //{ 4, 3, 7 };
		int[] arr2 = new int[3];
		int sCnt = 0; // ��Ʈ����ũ ����
		int bCnt = 0; // �� ����
		
		// 1. �迭�� ���� 3�� �ߺ����� ä���
		
		int[] numArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		for(int i=0;i<numArr.length*5;i++){
			int n = (int)(Math.random()*8)+1;
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		for(int i=0;i<3;i++){
			arr1[i] = numArr[i];
		}
		
//		System.out.println(Arrays.toString(arr1));
		
		// �¸��Ҷ����� �ݺ�
		while(sCnt!=3){
			sCnt = 0;
			bCnt = 0;
			
			// 2. ����ڿ��� 3���� ���ڸ� �Է¹޾� arr2 �迭�� �ֱ�
			
			Scanner scan = new Scanner(System.in);
			System.out.print("3�ڸ� ���ڸ� �Է��ϼ���");
			String input = scan.nextLine();
			int num;
			num = Integer.parseInt(input);
		
//			���ڰ� �ƴ� ���� �Է����� �� ������� �ϰ��;����� ����
//			try {
//				num = Integer.parseInt(input);
//			} catch (NumberFormatException e) {
//				// TODO Auto-generated catch block
//				System.out.print("���ڰ� �ƴմϴ�. 3�ڸ� ���ڸ� �Է����ּ���");
//				input = scan.nextLine();
//			}
			
			if(!(0 <= num && num <=999)){
				//���� �ʰ��� ����� ����� ���Է�
				System.out.print("������ �ʰ��Ͽ����ϴ�. 3�ڸ� ���ڸ� �Է����ּ���");
				input = scan.nextLine();
			}
				
			for(int i=0;i<3;i++){
				arr2[i] = ((int)((num/Math.pow(10, 2-i))%10));
			} 
				
			System.out.println(Arrays.toString(arr2));
					
			// 3. �� �迭�� ���ؼ� ��Ʈ����ũ�� ���� ������ ���
			for(int i=0; i < arr1.length; i++){
				for(int j=0; j< arr2.length; j++){
					if(arr1[i]==arr2[j]){
						// �ڸ��� ����, ���ڵ� ������
						if(i==j){
							sCnt++;	
						} 
						// �ڸ��� �ٸ���, ���ڴ� ������
						else {
							bCnt++;	
						}
					}
				}
			}
			System.out.println(sCnt+"S"+bCnt+"B");
		}	//end while
		System.out.println("�¸�");
	} //end main
}