package Test_조건식;

public class Test_sec09 {

	public static void main(String[] args) {
			// 1~100사의 임의의 값을 얻어서 answer에 저장한다.
		
		int answer = (int)(Math.random()*100)+1; 
		int input = 0; //사용자 입력을 저장할 공간
		int count = 0; //시도횟수를 세기위한 변수
		
		//화면으로 부터 사용자 압력을 받기 위해서 Scanner 클래스 사용
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		
		do {
			count++;
			System.out.println("1과 100사이의 값을 입력하세요 :");
			input = s.nextInt(); // 입력받은 값을 int타입으로 input에 저장한다.
			if (answer > input) {
				System.out.println("큰수를 입력하세요");
				
			} else if (answer < input) {
				System.out.println("작은수를 입력하세요");
			} else {
				System.out.println("정답입니다.");
				System.out.println("시도횟수는" + count + "번입니다.");
				break;
			}
		
		} while (true) ;
	}
}
