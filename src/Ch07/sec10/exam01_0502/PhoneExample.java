package Ch07.sec10.exam01_0502;

public class PhoneExample {
	public static void main(String[] args) {
		//추상 클래스트는 객체로 생성할 수 없다.
//		Phone phone = new Phone();
		
		SmartPhone smartphone = new SmartPhone("홍길동");
		smartphone.internetSearch();
		smartphone.turnoff();
		smartphone.turnOn();
	}
}
