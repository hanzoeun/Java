package Ch07.sec10.exam02;

public class AbstractMethodExample {

	public static void main(String[] args) {
			Cat cat = new Cat();
			cat.sound();
			
			
			Dog dog = new Dog();
			dog.sound();
			
			//다양성
			animalsound(new Dog()); //자동타입변환
			animalsound(new Cat());
			
	}
	
	//메소드 매개변수를 이횽한 다양성 구현 
	public static void animalsound(Animal animal) {
		animal.sound(); // 오버라이드된 메소드를 출력한다. 
	}

}
