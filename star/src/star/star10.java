package star;

public class star10 {

	public static void main(String[] args) {
		
//        for(int i=1; i<=3; i++) {
//        	for(int j=1; j<=5; j++){
//        		if(j-i>0 && i+j<6){
//        			System.out.print(" ");	
//        		}
//        		else {
//        			System.out.print("*");	
//        		}
//        	}
//        	System.out.println();
//        }
//        for(int i=1; i<=2; i++) {
//        	for(int j=1; j<=5; j++){
//        		if(i+j>3 && j-i<3){
//        			System.out.print(" ");	
//        		}
//        		else {
//        			System.out.print("*");	
//        		}
//        	}
//        	System.out.println();
//        }
		
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if((j-i<=0) && (j+i<=6) || (j-i>=0) && (i+j>=6)){
					System.out.print("*");	
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
