package ch04_Break;

public class BreakExample {
	public static void main(String[] args) {
		while(true) {
			
			//1부터 6개의 숫자 (1~6)
			int num = (int)(Math.random()*6) +1;
			System.out.println(num);
			
			if(num ==6) {
				break;
			}
			
			System.out.println("반복");
		}
		
	}
}
