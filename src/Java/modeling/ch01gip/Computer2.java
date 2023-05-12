package Java.modeling.ch01gip;

public class Computer2 {
	//집약 관계 : 전체가 사라져도 부분은 사라지지않는다.
	private MainBoard mb;
	 private Cpu c;
	 private Memory m;
	 private PowerSupply ps;
	 
	 public Computer2(MainBoard mb , Cpu c , Memory m , PowerSupply ps) {
		 //생성자에서 매개변수로 값을 넣어준다. 
		 this.mb = mb;
		 this.c = c;
		 this.m = m;
		 this.ps = ps;
	 }
}
