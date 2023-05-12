package Ch06_클래스그룹;

public class CalculatorExample {

	public static void main(String[] args) {
		
		
		Calculator.pi = 4;
		
		int result3 = Calculator.plus(10, 5);
		
		int result4 = Calculator.minus(10,5);
		
		
		
		// 객체는 각각 다르지만 static이 붙은 필드는 각 객체에서 공유해서 사용한다.
		// 객체는 각각 다르지만 static이 붙은 메소드는 각 객체에서 공유해서 사용한다.
		Calculator mycal = new Calculator();
											
		System.out.println("my cal.pi1: " + mycal.pi);
											
		System.out.println(result3 + result4);	
										
		Calculator myca2 = new Calculator();
										
		System.out.println("my cal.pi2: " + mycal.pi);
										
		Calculator myca3 = new Calculator();
		
		System.out.println("my cal.pi3: " + mycal.pi);
										
		}
//		Calculator mycal2 = new Calculator() {
//			
//		};
//	}

}
