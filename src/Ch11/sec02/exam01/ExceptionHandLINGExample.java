package Ch11.sec02.exam01;

public class ExceptionHandLINGExample {
	public static void printLength(String data) {
		try {
			int result = data.length(); //예외 발생 
			System.out.println("문자 수 :" + result);
			
		} catch (NullPointerException e) { //try 에서 발생된 에러를 잡는다 
//			System.out.println("에러가 밣생했습니다.");
			System.out.println(e.getMessage()); //예외가 발생한 이유를 리턴
			System.out.println(e.toString()); //예외의 종류를 리턴 
			e.printStackTrace(); //예외의 이유 , 종류, 어디서 발생했는지를 리턴 
		} finally {
			System.out.println("끝");
		}
		
	}

	public static void main(String[] args) {
		System.out.println("[프로그램시작]");
		printLength("THIS IS JAVA");
		printLength(null);
		System.out.println("[프로그램종료]");
	}

}
