package Test_조건식;

public class Test_sec04 {

	public static void main(String[] args) {
		while (true) {

			
			int num1 = (int) (Math.random() * 6) + 1;  
			int num2 = (int) (Math.random() * 6) + 1;
			System.out.println(num1);
			System.out.println(num2);
			
			System.out.println("첫번째 주사위: " + num1 + "두번째 주사위: " + num2);

			if ((num1 + num2) == 5) {
				break;
			}

//			System.out.println("반복");
		}

	}

}
