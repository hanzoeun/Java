package Customer_project;

public class VIPCustomerOther extends Customer {
	double SaleRatio; // 할인률
	private int agentID; // 상담원 아이디

	public VIPCustomerOther(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		super.CustomerGrade = "vip";
		super.bounsRatio = 0.03;

		this.SaleRatio = 0.2;
		this.agentID = agentID;
	}

	@Override
	public int calcPrice(int Price) {
		// 1. 보너스 포인트가 쌓인다.
		bounsPoint += Price * bounsRatio;

		// 2. 사용자가 지불할 가격을 리턴

		return Price - (int) (Price * SaleRatio);

	}

	// 담당 상담원에 정보를 출력
	@Override
	public String showCustomerInfo() {
		// 고객이름 , 등급 , 현재 보너스 포인트점수, 상담원ID 출력
		return super.showCustomerInfo() + ", 담당 상담원 번호: " + agentID;
	}

	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
}
