package Ch15.sec03.exam02;

public class Member {
	public String name;
	public int age;
	
	public Member (String name ,int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() { // 객체의 주소를 출력 
		return name.hashCode() + age; //재정의 
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) { //obj 객체가 member 객체를 가지고있는지?
			Member target = (Member) obj; // 강제 타입변환 
			
			return target.name.equals(name) && (target.age==age);
		} else {
			return false;
		}
	}
	
	
}
