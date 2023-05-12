package Ch07.sec06.packge2;

import Ch07.sec06.packge1.A;


//패키지가 달라도 상속은 가능하다. 
public class D extends A {
	//생성자 
	public D() {
		//부모클래스의 생성자를 호출한다. 
		super();
	}
	
	public void method1() {
		
		//부모클래스의 필드를 바꾼다
		this.field = "value";
		
		//부모클래스의 메소드를 호출한다.
		this.method();
		
		// => 이 모든게 가능한 이유는 protected 접근제한자는 상속관계일때 접근이 가능하게한다. 
		
	}
	
	
	public void method2 () {
		
		//protected일때  상속 상태여도 다른 패키지일때는 직접 객체 생성이 불가능하다. 
		A a = new A();
		a.field = "value";
		a.method();
	}
}
