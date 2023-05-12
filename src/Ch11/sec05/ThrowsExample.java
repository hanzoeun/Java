package Ch11.sec05;

public class ThrowsExample {
	
	//main에 Throw를 하면 jvm에서 알아서 예외처리해준다.
	 public static void main(String[] args) throws ClassNotFoundException {
		
			findClass(); //예외를 던지면 메소그가 실행되는 곳에서 처리해줘야한다.
		
	}
	 public static void findClass() throws ClassNotFoundException {
		 Class.forName("java.lang.String2");
	 }
}
