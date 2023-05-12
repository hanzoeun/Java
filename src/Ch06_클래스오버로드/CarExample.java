package Ch06_클래스오버로드;

public class CarExample {

	public static void main(String[] args) {
		//차량 4대 생산
	Car3 Car1 = new Car3();
	Car3 Car2 = new Car3("자가용");
	Car3 Car3 = new Car3("자가용", "빨간색");
	Car3 Car4 = new Car3("자가용", "빨간색" , 350 , 10 , 20);
	
	
	System.out.println("Car1.company: " + Car1.company);
	System.out.println("Car1.company: " + Car1.model);
	System.out.println("Car1.company: " + Car1.color);
	System.out.println("Car1.company: " + Car1.maxSpeed);
	
	
	System.out.println("===============================");
	System.out.println("Car2.company: " + Car2.company);
	System.out.println("Car2.company: " + Car2.model);
	System.out.println("Car2.company: " + Car2.color);
	System.out.println("Car2.company: " + Car2.maxSpeed);
	
	
	System.out.println("===============================");
	System.out.println("Car3.company: " + Car3.company);
	System.out.println("Car3.company: " + Car3.model);
	System.out.println("Car3.company: " + Car3.color);
	System.out.println("Car3.company: " 
	+ Car3.maxSpeed);
	
	
	System.out.println("===============================");
	System.out.println("Car4.company: " + Car4.company);
	System.out.println("Car4.company: " + Car4.model);
	System.out.println("Car4.company: " + Car4.color);
	System.out.println("Car4.company: " + Car4.maxSpeed);
	
	
	}

}
