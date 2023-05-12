package Ch09.sec04.exam01;

public class A {
	public A() {
		//로컬 클래스 
		class B {}
		
		B b = new B();
	}
	
	void method () {
		//로컬 클래스 
		class B {}
		
		B b = new B();
	}
}
