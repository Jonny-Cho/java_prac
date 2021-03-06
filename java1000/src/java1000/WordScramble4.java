package java1000;

import java.util.Scanner;

/*
[문제4] 실행결과를 잘 보고, 다음의 예제의 getHint메서드를 완성하세요.

String getHint(String answer, char[] hint) - 문제의 답의 일부를 보여주는 메서드
한번 틀릴 때마다 한글자씩 더 보여준다.
*/

import java.util.*; 

class WordScramble4 { 

      public static void main(String[] args) { 
            String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"}; 

            while(true) { 
                  String answer = getAnswer(strArr); 
                  String question = getScrambledWord(answer); 
                  char[] hint = new char[answer.length()];

                  // hint를 '_'로 초기화 한다. 정답이 LOVE라면 hint는 "____"이 된다.
                  for(int i=0;i < hint.length;i++) { 
                        hint[i] = '_';
                  }

                  while(true) { 
                        System.out.println("Question :" + question); 
                        System.out.print("Your answer is :"); 

                        Scanner s = new Scanner(System.in);
                        String input = s.nextLine(); 

                        if(input.equalsIgnoreCase("q")) 
                              System.exit(0); 

                        if(input.equalsIgnoreCase(answer)) { 
                              System.out.println("정답입니다."); 
                              System.out.println(); 
                              break; 
                        } else { 
                              System.out.println(input+"은/는 정답이 아닙니다. 다시 시도해보세요.");       
                              System.out.println("Hint:"+getHint(answer,hint)); 
                        } 
                  } // while 
            } // outer while 
      } // main 

      public static String getAnswer(String[] strArr) { 
            int idx = (int)(Math.random()*strArr.length); 
            return strArr[idx]; 
      } 
      
      public static String getScrambledWord(String str) { 
   	   char[] chArr = str.toCharArray(); // String -> char배열 
   	   
   	   for(int i=0;i<str.length();i++){
   		   int idx = (int)(Math.random()*str.length());
   		   
   		   char tmp = chArr[i];
   		   chArr[i] = chArr[idx];
   		   chArr[idx] = tmp;
   	   }
   	   
   	   return new String(chArr); // char배열 -> String
      }

      public static String getHint(String answer, char[] hint) { 
    	  	
            int count = 0; // 힌트에 포함된 '_'의 개수

           // 1. 반복문을 이용해서 hint에 포함된 '_'의 개수를 센다.
            for(int i=0;i<hint.length;i++){
            	if(hint[i]=='_')
            		count++;
            }
            
           // 2. count의 값이 2보다 클 때만 정답의 한 글자를 hint에 넣는다.
           //    '_' 찍혀 있다면 넣고 아니면 다른 곳에 넣는다
            
/*           
 			while(true){
            	int idx = (int)(Math.random()*hint.length);
            	if(count>2){
        			if(hint[idx]=='_'){
        				hint[idx] = answer.charAt(idx);
        				count--;
        				break;
        			} else {
        				continue;
        			}
        		} 
            	break;
			}
			for0~길이까지
				result += hint[i];
			return result;
*/
            
            if(count>2){
            	while(true){
            		int idx = (int)(Math.random()*hint.length);
            		if(hint[idx]=='_'){
        				hint[idx] = answer.charAt(idx);
        				break;
        			}
            	}
            }
    		
            return new String(hint);
           //    [주의] 반드시 이전 힌트 보다 한글자를 더 보여줘야함.
           //    예를 들어 정답이 "LOVE"이고 이전 힌트가 "L___"이었다면
           //    그 다음 힌트는 "L__E"또는 "L_V_" 와 같은 식이어야 한다.
           //    Math.random()을 사용해서 정답의 한 글자를 골라서 힌트에 넣으면 된다.

      } // getHint() 
}
