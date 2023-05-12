package Ch07.sec04.exam01;

public class Computer extends Calculator {

	// 메소드 선언

	// 오버라이딩 : 리턴타입 , 메소드 이름 , 매개변수는 다 같고 내부 실행코드는 다르다.
	@Override
	public double areaCirCle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r ;
		
	}


}
