package ch04_Continue;

public class ContinueExample {

	public static void main(String[] args) {
		
		
		//짝수만 구하는
		for(int i=1; i<=10; i++) {
			if((i%2) !=0) {
				continue; //홀수면 바로중단
			} 
			System.out.println(i%2);
		}
	}

}
