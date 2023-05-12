ackage Ch06_Void메소드;

public class CarExample {

	public static void main(String[] args) {
		// 인스턴스 생성될때 생성자가 실행된다.
		Car myCar = new Car();
		//gas: 5
		
		
		// 가스를 넣어준다. 
		myCar.setGas(5);
		
		
		if(myCar.isLeftgas()) {
			//가스가 있을때
			System.out.println("출발하니다.");
			myCar.run();
		}
		
		System.out.println("gas를 주입하세요");
		
		
		System.out.println(myCar.gas);
		
		
		
		
		
		
		
	}

}
