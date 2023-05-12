package Ch07.sec07.exam02;

public class ChildExample {

	public static void main(String[] args) {
//		Child child = new Child();
//		
//		//자동 타입 변환
//		
//		Parents parent = child;

		// 자동 타입 변환2

		Parents parent1 = new Child();

		parent1.parentsfield1 = 10;

		// 자동타입 변환시 자식클래스에 오버라이딩 된 메소드가 있으면
		// 오버라이딩 된 메소드가 호출된다.
		parent1.method1();
		parent1.method2();
		
		
		//강제 타입변환시 부모클래스, 자식클래스에 있는 필드,생성자,메소드 모두 사용가능하다. 
		Child child = (Child) parent1;

		
		// 부모 클래스에서 선언된 필드와 메소드만 접근이 가능하다.
		child.method3();
		child.childfield = 20;
		child.parentsfield1 = 10;
	}

}
