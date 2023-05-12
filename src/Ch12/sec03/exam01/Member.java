package Ch12.sec03.exam01;

public class Member {
	public String id ;
	public Member(String id) {
		this.id =id;
	}
	
	
	public static void main(String[] args) {
		Member obj1 = new Member("블루");
		Member obj2 = new Member("블루");
		Member obj3 = new Member("레드");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지않습니다.");
		}
	}
	
}
