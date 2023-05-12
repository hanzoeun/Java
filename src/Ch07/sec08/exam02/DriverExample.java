package Ch07.sec08.exam02;

public class DriverExample {

	public static void main(String[] args) {
		Driver mydri = new Driver();
		
		Taxi taxi = new Taxi();
		
		mydri.driver(taxi);
		
		 Bus bus = new Bus();
		 
		 mydri.driver(bus);
	}

}
