package ch04_Switch;

public class SwitchExample {

	public static void main(String[] args) {
		char grade = 'B';
		
		//String 사용가능 ""
		
		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("우수회원 입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("일반회원 입니다.");
			break;

		default:
			System.out.println("손님 입니다.");
			break;
		}
	}

}
