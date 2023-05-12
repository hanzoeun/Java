package Ch06_sec11.exam01;

public class Korea {
	
	//인스턴스 final 필드 
  final String nation = "대한민국";
  final String ssn; // final은 초기값을 줘야하고 생성자에서도 줄수 있다.
  
  //인스턴스 필드 
  String name;
  
  
  public Korea(String name) { // 생성자
	  this.ssn = "123456-1234567";
	  this.name = name;
	
  }
}
