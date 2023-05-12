package Test_조건식;

public class Test__sec06 {

	public static void main(String[] args) {

		for (int i = 1; i <= 6; i++) {
			for (int v = 1; v <= 6; v++) 
			
			if (v + i == 6) {

				System.out.println("첫번째 주사위: " + v + "두번째주사위: " + i + "합" + (v + i));

			}

		}
	}

}
