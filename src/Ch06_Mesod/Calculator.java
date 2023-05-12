package Ch06_Mesod;

public class Calculator {
	// 필드: 있든 없든 상관이없다.
	// 생성자: 디폴드 생성자가 붙는다. => Calculator() {}
	
	//객체 = 속성(필드) + 기능(메소드)
	void poweron() {
		System.out.println("전원을 켭니다.");

		return; // 생략을 해도 상관이 없다.
	}
	
	
	void powerof() {
		System.out.println("전원을 끕니다..");
		
		return; // 생략을 해도 상관이 없다.
	}

	int plus(int x , int y) {
		int result = x + y;
		
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x / y;
		
		return result;
	}
}
