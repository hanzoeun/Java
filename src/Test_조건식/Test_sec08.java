package Test_조건식;

public class Test_sec08 {

	public static void main(String[] args) {
		for (int i=1; i<=5; i++) {
			for (int j=1; j <= i; j++) {
				System.out.print("*");
				
				if (j == i) {
					System.out.println();
				}
				
			}
			
		} 
	} 

}
