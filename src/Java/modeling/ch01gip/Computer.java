package Java.modeling.ch01gip;

public class Computer {
	//합성관계 : 전체가 사라지면 부분도 사라진다.
	
	
	//필드생성
	 private MainBoard mb;
	 private Cpu c;
	 private Memory m;
	 private PowerSupply ps;
	 
	 
	 //생성자 
	 public Computer() {
		 //합성관계는 필드의 객체를 생성한다. , 필드에 값을 넣어준다. 
		 this.mb = new MainBoard();
		 this.c = new Cpu();
		 this.m = new Memory();
		 this.ps = new PowerSupply();
	 }
	 
	 
	
}
