package ch14.sec06.exam02;

public class User2Thread extends Thread{
private Calulator calulator;
	
	public User2Thread () {
		setName("User2Thread"); //스레드 이름 지정 
	}
	
	public void setCalulator(Calulator calulator) {
		this.calulator = calulator;
	}
	@Override
	public void run() {
		calulator.setMemory2(50);
	}
	
}
