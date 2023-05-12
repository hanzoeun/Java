package Ch06_메소드오버로드;

public class Calculator {
 // 메소드 오버로딩: 같은 이름을 가진 메소드가 여러개 
	
	// => 기능은 값지만 메소드 안에 잇는 코드가 달라야 할때 
	// 1. 메소드 이름은 무조건 같아야 한다.
	// 2. 단 , 타입 갯수 순서 중 하나는 달라야 한다. 
	
	double areaRectangle(double width) {
		return width * width; // 사각형의 너비 구하기 
	}
	
	// 직사각형의 너비 구하기 
	double areaRectangle(double width, double height) {
		return width * height;
	}
}
