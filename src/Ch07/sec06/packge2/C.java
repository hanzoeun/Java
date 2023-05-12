package Ch07.sec06.packge2;


import Ch07.sec06.packge1.A;

public class C {
	
	//클래스가 서로 다른 패키지에 있으면 접근할 수 없다. 
	A a = new A();
	
	a.field = "value";
	a.method();
}
