package Ch07.sec10.exam01_0502;
//추상 클래스
//1. 상속을 하기 위해 만들어진 클래스 
//2. 완전하지 않은 클래스이다.
public abstract class Phone {
	// 필드 
	String owner;
	
	//생성자
	Phone(String owner){
		this.owner = owner;
	}
	
	//메소드 선언 
	void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	void turnoff() {
		System.out.println("폰 전원을 끕니다");
	}
}
