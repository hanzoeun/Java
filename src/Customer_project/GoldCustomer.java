package Customer_project;

public class GoldCustomer extends Customer {
		double SaleRatio; //할인률
		
		public GoldCustomer(int customerID, String customerName) {
			//부모 클래스에 손님 아이디, 손님 이름 
			super(customerID,customerName);
			
			super.CustomerGrade = "Gold";
			super.bounsRatio = 0.02;
			
			this.SaleRatio = 0.1;
			}
		

		@Override
		public int calcPrice(int Price) {
			//1. 보너스 포인트가 쌓인다.
			bounsPoint += Price * bounsRatio;
			
			//2. 사용자가 지불할 가격을 리턴 
			
			return Price - (int)(Price * SaleRatio);
		}

		
}
