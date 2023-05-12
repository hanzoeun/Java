package ch04_While;

public class SunFrom1To100EXample {

	public static void main(String[] args) {
		int sum = 0;
		
		int i = 1;
		
		while(i<=100) {
			sum += i ; 
			
			System.out.println(i);
			i++;
		}
		
		System.out.println(sum);
	
	}

}
