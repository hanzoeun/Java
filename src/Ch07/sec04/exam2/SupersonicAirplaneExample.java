package Ch07.sec04.exam2;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane Super = new SupersonicAirplane();
		
		Super.takeOff();
		Super.fly();
		
		System.out.println();
		
		//정적필드 호출 => 클래스명. 상수 
		Super.flyMode = SupersonicAirplane.SUPERSONIC;
		
		Super.fly();
		
		System.out.println();
		
		Super.flyMode = SupersonicAirplane.NORMAL;
		
		Super.fly();
		
		Super.land();
		
		
	}

}
