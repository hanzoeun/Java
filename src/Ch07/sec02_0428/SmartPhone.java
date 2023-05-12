package Ch07.sec02_0428;

public class SmartPhone extends Phone {
		//필드 생성
	public boolean wifi;
	
	//생성자 
	
	// 상속을 받으면 자식클래스에서 부모클래스에 있는 필드에 접근 할 수 있다. 
	public SmartPhone(String model, String color) {
		super(model, color);
		
		
		System.out.println("SmartPhone(String model, String color)생성자를 생성합니다.");
	}
	
	
	// 메소드 선언
	
	public void setwifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다.");
	}
	
	public void internet() {
		System.out.println("인터넷에 연결 했습니다.");
	}
}
