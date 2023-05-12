package Ch06_클래스오버로드;
//설계도
public class Car3 {
	//필드
	
	String company = "hyundai";
	String color;
	String model;
	int maxSpeed;
	int speed;
	
	//생성자 오버로드 : 생성자를 여러개 만든다.
	//오버로드시 매개변수의 타입, 갯수, 순서 중의 하나는 달라야 한다.
	Car3() {}
	Car3(String model) {
//		this.model = model;
		
		//this(); => 이 클래스(car클래스) 안에 있는 생성자를 호출
		this(model, "색상", 250 ,10 ,20); //28번 라인의 생성자를 호출 
	}
	Car3(String model, String color) {
//		this.model = model;
//		this.color = color;
		this(model, color, 250 ,10 ,20);  //28번 라인의 생성자를 호출 
	}
	
	
	 Car3(String model, String color , int maxSpeed , double width ,double height) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		
		
		
	}
}
