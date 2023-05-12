package Customer_project;


//silver등급 고객에 대한 class이면서 기본적인 고객 
public class Customer {
	//필드 생성 
	protected int CustomerID; // 고객 아이디
	protected String CustomerName; // 고객 이름
	protected String CustomerGrade; // 고객 등급
	
	
	int bounsPoint; // 보너스 포인트 적립양
	double bounsRatio; //보너스 비율 
	
	//생성자 
	public Customer() {
		initCustomer();
	}
	
	public Customer(int CustomerID, String CustomerName) {
		this.CustomerID = CustomerID;
		this.CustomerName = CustomerName;
		initCustomer();
	}
	
	
	//메소드 
	//고객등급 초기화 
	private void  initCustomer() {
		CustomerGrade = "SILVER";
		bounsRatio = 0.01;
	}
	
	//보너스 포인트 계산, 가격 리턴 
	public int calcPrice(int Price) {
		//1. 보너스 포인트 적립 
		bounsPoint += (Price * bounsRatio);
		
		
		//2. 사용자가 지불할 가격을 리턴 
		return Price; // silver 등급 고객은 할인률이 없다.
		
	}
	
	
	//고객 정보 출력 메소드 
	public String showCustomerInfo() {
		return CustomerName + "님의 등급: " + CustomerGrade + ", 보너스 포인트: " + bounsPoint + "점";
	}
	
	public int getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getCustomerGrade() {
		return CustomerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		CustomerGrade = customerGrade;
	}

	
}
