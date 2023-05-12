package Ch06_Mesod;

public class CalulatorExample {

	public static void main(String[] args) {
		
		//인스턴스(객체) 생성
		Calculator myCalc = new Calculator();
		
		//인스턴스명, 메소드명
		myCalc.poweron();
		
		int result1 = myCalc.plus(5, 6);
		
		System.out.println(result1);
		
		int x = 10 , y = 4 ;
		
		double result2 = myCalc.divide(x, y);
		
		System.out.println(result2);
		
		myCalc.powerof();
		
		
		
		Calculator myCalc2 = new Calculator();
		
	}

}
