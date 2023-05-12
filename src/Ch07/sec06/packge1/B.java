package Ch07.sec06.packge1;

public class B {
	//메소드
	public void method() {
		
		//클래스가 서로 같은 패키지에 있으면 가져다 쓸수 있다. 
		A a = new A();
		
		a.field = "value";
		a.method();
		
	}
}
