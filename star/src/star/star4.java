package star;

public class star4 {

	public static void main(String[] args) {

		// i : 1~5
		for(int i=1;i<=5;i++){
			//
			for(int j=1;j<=5;j++){
				if(i+j == 6 || i==j){
					System.out.print("*");	
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
