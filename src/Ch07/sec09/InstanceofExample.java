package Ch07.sec09;

public class InstanceofExample {
	
	//main 메소드에서 바로 호출하기 위해서 static을 사용
	public static void personInfo(Parson person) {
		System.out.println(person.name);
		
		person.walk();
		
		//person이 참조하는 객체가 student인지 확인
		
		//parson person = new Student();인지 확인
		
		if(person instanceof Student) {
			//강제 타입변환
						
			Student student = (Student)person;
			
			//자식 클래스가 가지고 있는 고유의 메소드, 필드 사용가능
			System.out.println(student.studentNo);
			student.study();
			
			
			student.name = "우우우";
			student.walk();
		}
		
		
	}
	public static void main(String[] args) {
		Parson myper = new Parson("홍길동");
		
		
		
//		personInfo(myper);
//		
//		System.out.println();
		
	Parson myper2 = new Student(10 ,  "홍길동");
		
		personInfo(myper2);
		
		System.out.println();
		
		
	}

}
