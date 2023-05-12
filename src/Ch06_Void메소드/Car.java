package Ch06_Void메소드;

public class Car {
		//필드
	
	int gas;  // 가스의 총량 
	
		//생성자 Car() {} 인스턴스가 실행될때 한번만 실행
//	Car(int gas) {
//		System.out.println("생성자 실행");
//		this.gas = gas;
//	}
	
	
		//메소드 메소드는 여러번 실행이 가능하다.
	void setGas(int gas) { // 가스를 채워넣는다.
		this.gas += gas;
	}
	
	boolean isLeftgas() { // 가스 잔량을 확인.
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			
			return false; // 메소드 종료 
		} 
		
		 System.out.println("gas가 있습니다.");
		 
		 return true; //메소드 종료
	}
	
	void run() { // 자동차가 달린다(가스 소모)
		while(true) {
			if (gas > 0) { // 가스가 있는 상태
				System.out.println("달립니다. gas잔량 : " + gas);
				gas -= 1; // 1씩 가스 소모
			} else { // 가스가 없는 상태
				System.out.println("멈춥니다. gas잔량 :" + gas);
				
				return; // 메소드 종료 
			}
		}
	}
	
}
