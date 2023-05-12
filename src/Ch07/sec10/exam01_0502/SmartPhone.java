package Ch07.sec10.exam01_0502;

public class SmartPhone extends Phone{

	SmartPhone(String owner) {
		
		//중요. 추상클래스가 부모일땐 반드시 부모클래스의 생성자를 호출해야 한다. 
		super(owner);
		// TODO Auto-generated constructor stub
	}
	
	//메소드 
	void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}

}
