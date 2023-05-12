package Ch07.sec09;

public class Student extends Parson {
	// 필드
	public int studentNo;
	
	public Student(int studentNo , String name) {
		super(name); // 부모클래스의 생성자 호출
		this.studentNo = studentNo;
		
	}
	
	public void study() {
		System.out.println("공부를 합니다.");
	}
}
