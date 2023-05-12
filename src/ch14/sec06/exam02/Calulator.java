package ch14.sec06.exam02;

public class Calulator {
//필드 생성 
	private int memory;

	
	
	public int getMemory() {
		return memory;
	}

	
	public synchronized void  setMemory1(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000); //2초간 정지
		} catch (Exception e) {
			System.out.println("띵띵");
		}
	}
	
	public void setMemory2(int memory) {
		synchronized (this) {
		this.memory = memory;
		try {
			Thread.sleep(2000); //2초간 정지
		} catch (Exception e) {
			System.out.println("E띵띵");
		}
		}
	}
	
	
}
