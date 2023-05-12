package Ch06_클래스;

public class CarExample {

	public static void main(String[] args) {
		
		//인스턴스 : new로 생성한 자동차(객체)
		Car myCar = new Car();
		
		//필드에 접근 => 인스턴스명. 필드명
		System.out.println("모뎅명: " + myCar.model);
		System.out.println("최고속력: " + myCar.maxspeed);
		System.out.println("속도: " + myCar.speed);
		System.out.println("회사: " + myCar.company);
		System.out.println("차 색상: " + myCar.color);
		System.out.println(myCar);
		//필드 값 변경 => 인스턴스명.필드명 = 값
		myCar.speed = 60;
		
		System.out.println("현재 속도: " + myCar.speed);
		
		
		Car myCar2 = new Car();
		myCar2.speed = 70;
		myCar2.company = "기아";
		System.out.println(myCar2);
		
		System.out.println("myCar2 회사: " + myCar2.company);
		System.out.println("수정된 속도: " + myCar2.speed);
		
		Car myCar3 = new Car();
		
		
		myCar3.company = "넥서스";
		myCar3.speed = 90; 
		
		System.out.println("myCar3 회사: " + myCar3.company);
		System.out.println("수정된 속도: " + myCar3.speed);
		System.out.println(myCar3);
		
	}

}
