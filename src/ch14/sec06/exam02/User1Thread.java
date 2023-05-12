package ch14.sec06.exam02;

public class User1Thread extends Thread{
	private Calulator calulator;
	
	public User1Thread () {
		setName("User1Thread"); //스레드 이름 지정 
	}
	
	public void setCalulator(Calulator calulator) {
		this.calulator = calulator;
	}
	@Override
	public void run() {
		calulator.setMemory1(100);
	}

}
