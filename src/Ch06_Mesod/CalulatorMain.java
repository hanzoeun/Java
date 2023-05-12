package Ch06_Mesod;

public class CalulatorMain {
	
	public static void poweron() {
		System.out.println("전원을 켭니다.");
		
		return; // 생략을 해도 상관이 없다.
	}

	public static int plus(int x , int y) {
		int result = x + y;
		
		return result;
		
		
		
	}
	
	
	public static void main(String[] args) {
			//리턴 값이 없는 메소드
		poweron();
		
		int result = plus(10, 20);
		
		System.out.println(result);
	}

}
