package Ch06_클래스그룹;

public class Calculator {
	
	
	//인스턴스 필드
	
	//정적 (static) 필드: 프로그램 전체의 영역을 확장
	 static double pi = 3.14;
	
	//인스턴스 메소드 
	 //(static)을 붙이면 정적 메소드로 변환   (정적) 프로그램 전체의 영향을 끼침
	static int plus(int x , int y) {
		return x + y;
	}
	
	
	static int minus (int x, int y ) {
		return x - y;
		
	}
	
	void printPi () {
		System.out.println(pi);
	}
}


