package Ch07.sec08.exam01_0501;

public class CarExample {

	public static void main(String[] args) {
		Car mycar = new Car();
		
		mycar.tire = new KumhoTire(); //자동타입변환 
		mycar.run();
	}

}
