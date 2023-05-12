package SumSung;

public class Phone extends Appliances{
	double bounsRatio;
	
	public  Phone(int Price, String Model, String color) {
		super.Model = "핸드폰";
		super.color = "그린";
		super.Price = 1200000;
		this.bounsRatio = 0.12;
	}

	@Override
	public int PayPrice(int Price) {
		PayBackmoney += (Price * bounsRatio);
		
		return Price - (int)(Price * bounsRatio);
	}
}
