package ch14.sec06.exam02;

public class SynchronizedExample {

	public static void main(String[] args) {
		Calulator cal = new Calulator();
		
		User1Thread user1Thread = new User1Thread();
		user1Thread.setCalulator(cal);
		user1Thread.start();
		
		User2Thread user2Thread = new User2Thread();
		user2Thread.setCalulator(cal);
		user2Thread.start();
	}

}
