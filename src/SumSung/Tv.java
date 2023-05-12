package SumSung;

public class Tv extends Appliances {
	double bounsRatio;
	
	public  Tv(int Price, String Model, String color) {
		super.Model = "Tv";
		super.color = "Black";
		super.Price = 1500000;
		this.bounsRatio = 0.15;
	}

	@Override
	public int PayPrice(int Price) {
		PayBackmoney += (Price * bounsRatio);
		
		return Price - (int)(Price * bounsRatio);
	}
}
