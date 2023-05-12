package SumSung;

public class Computer extends Appliances{
	double bounsRatio;
	
	

	public  Computer(int Price, String Model, String color) {
		super.Model = "Computer";
		super.color = "White";
		super.Price = 1800000;
		this.bounsRatio = 0.2;
	}

	@Override
	public int PayPrice(int Price) {
		PayBackmoney += (Price * bounsRatio);
		
		return Price - (int)(Price * bounsRatio);
	}
}
