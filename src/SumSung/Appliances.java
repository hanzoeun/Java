package SumSung;

public class Appliances {
	// 필드 생성하기
	protected int Price;
	protected String Model;
	protected String color;

	static int PayBackmoney = 0;
	double bounsRatio;

	public Appliances() {
		initAppliances();
	}

	public Appliances(int Price , String Model , String color) {
		this.Model = Model;
		this.color = color;
		this.Price = Price;
		initAppliances();
	}

	public void initAppliances() {
		Model = "home Appliances";
		bounsRatio = 10.5;
	}
	
	public int PayPrice (int Price) {
		PayBackmoney += (Price * bounsRatio);
		
		return Price;
	}

	public String ShowAppliancesInfo() {
		return " 제품명 : " + Model + " 색상 : " + color + " 금액 : " + Price;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
