package ch02_sec13;

import java.util.Scanner;



public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("x 값 입력: ");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);

		System.out.print("y 값 입력: ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		

		int result = x + y;
		System.out.println("x + y: " + result);
		System.out.println();
		
//		while(true) {
//			System.out.println("입력 문자열: ");
//			String data = scanner.nextLine();
//			
//			//문자열을 비교할때는 equals라고 하는 함수를 사용한다
//			if(data.equals("q")) {
//				// data =="q" 
//				break;
//			}
//			
//			System.out.println("출력 문자열:" + data);
//		}
//		
//		System.out.println("종료");
	}
	

}
