package ch03_Sec04;

public class AccuracyExample {

	public static void main(String[] args) {
			// 정확한 계산은 정수 연산으로 해야한다.
		
//		int apple = 1; // 사과 한 조각
//		double var1 = 0.1; // 10분의1
//		int number = 7;
//		
//		double result = apple - number * var1 ;
//		
//		System.out.println("사과 한개에서 남은양:" + result);
		
		int apple = 1; // 사과 한 조각
		int var1 = apple * 10; //10
		int number = 7;
		
		int result =   var1 - number ;
		
		System.out.println("사과 한개에서 남은양:" + result/10.0);
	}

}
