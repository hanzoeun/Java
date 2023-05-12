package ch04_While;

import java.util.Scanner;

public class KeyControlExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 입력 받기 위한 객체 
		
		boolean run = true; // 현재상태확인 
		
		int speed = 0;
		
		while(run) {
			System.out.println();
			System.out.println("1.중속 2.감속 3.중지");
			System.out.println();
			
			
			//사용자에게 입력받음
			System.out.println("선택:");
			String strNum = scanner.nextLine();
			
			if (strNum.equals("1")) {
				speed++;
				System.out.println("현재속도:" + speed);
				
			} else if (speed <= 30) {
				System.out.println("멈춥니다");
				break;
			}
			
			else if (strNum.equals("2")) {
				speed--;
				System.out.println("현재속도:" + speed);
			} else if (strNum.equals("3")) {
				run = false; // 중지
			}
		}
		
		System.out.println("프로그램 종료");
	}

}
