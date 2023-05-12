package ch06.sec14;

public class CarExample {

	public static void main(String[] args) {
		Car mycar = new Car();
		
//		mycar.speed = 10;
		
		mycar.setSpeed(10);
		System.out.println(mycar.getSpeed());
		
		
		mycar.setStop(true);
		System.out.println(mycar.isStop());
		
	}

}
