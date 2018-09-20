package java1000;

import java.util.Scanner;

/*
[����3] ����2�� ������ �����ؼ�, ������ ���ߴ��� ���α׷��� ������� �ʰ� ���������� �����ֵ��� �ϼ���.
*/

public class WordScramble3 {

	
	 public static void main(String[] args) { 
         String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"}; 

         String answer = getAnswer(strArr); 
         String question = getScrambledWord(answer); 
         
         Game1 : while(true) { 
             System.out.println("Question :" + question); 
             System.out.print("Your answer is :"); 
             
             // 1. ȭ���� ���� ������� �Է��� �޴´�.(ScannerŬ���� ���)
             Scanner s = new Scanner(System.in);
             String input = s.nextLine();
             // 2. ����ڰ� q �Ǵ� Q�� �Է��ϸ� ���α׷��� �����Ѵ�.
             if(input.equalsIgnoreCase("q")){
            	 System.out.println("���α׷�����");
            	 System.exit(0);
             }
             // 3. ����ڰ� ������ ���⶧���� �ݺ��ϴٰ�
             if(input.equalsIgnoreCase(answer)){
                 System.out.println("�����Դϴ�. �� ������ Ǯ�����.");
            	 answer = getAnswer(strArr);
            	 question = getScrambledWord(answer);
            	 continue Game1;
             } else{
            	 System.out.println(input+"��/�� ������ �ƴմϴ�. �ٽ� �õ��غ�����.");
            	 continue Game1;
             }
             //     ����ڰ� ������ ���߸�, while���� ����������.

       } // while

   } // main 

   public static String getAnswer(String[] strArr) {
	   int idx = (int)(Math.random()*strArr.length);
	   return strArr[idx];
   } 
   
   public static String getScrambledWord(String str) { 
	   char[] chArr = str.toCharArray(); // String -> char�迭 
	   
	   for(int i=0;i<str.length();i++){
		   int idx = (int)(Math.random()*str.length());
		   
		   char tmp = chArr[i];
		   chArr[i] = chArr[idx];
		   chArr[idx] = tmp;
	   }
	   
	   return new String(chArr); // char�迭 -> String
   }

}