package Customer_project;

import java.util.ArrayList;

public class CustomerApplication {
	
	
	private static ArrayList<Customer> customerList = new ArrayList<>();
	
	
	
	
 public static void main(String[] args) {
	 
	 //실버 등급 (일반)
	Customer customerLee = new Customer(10010, "이순신");
	Customer customerShin = new Customer(10010, "신사임당");
	
	
	//골드 등급(자동타입변환)  == > 다형성
	
	Customer customerhong = new GoldCustomer(10030, "홍길동");
	Customer customerJeong = new GoldCustomer(10040, "정약용");
	
	//VIP 등급(자동타입변환)
	
	Customer customerYul = new VIPCustomer(10050, "이율곡", 12345);
	
	//ArrayList 에 객체를 추가한다. 
	customerList.add(customerLee);
	customerList.add(customerShin);
	customerList.add(customerhong);
	customerList.add(customerJeong);
	customerList.add(customerYul);
	
	//1. 모든 고객 정보를 출력하기
     showAllCustomer();
	
	//2. 상품 구매할때 id로 찾은 고객에 실제 지불금액과, 보너스 포인트 출력 
     
     Customer customer = findCustomer(10050);
     
     //회원을 찾지 못했을때
     if(customer == null) {
    	 System.out.println("존재하지 않는 회원입니다.");
     } else {
    	 //회원을 찾았을때
    	 showPriceBouns(customer, 10000); //10000원 : 상품가격
    	 
     }
 }
	
	//고객 정보 출력
	
	public static void showAllCustomer() {
		System.out.println("================모든 고객 정보 출력====================");

		for(Customer  customer :customerList ) {
			System.out.println(customer.showCustomerInfo());
		}
		
	}
	
	//고객 ID로 고객찾기
	
	public static  Customer findCustomer (int CustomerID) {
		Customer resultCustomer = null;
		for (Customer customer : customerList ) {
			
			//id가 같으면
			if (customer.getCustomerID() == CustomerID) {
				
				//id가 같은 customer 객체 resultCustomer에 넣어준다.
				resultCustomer = customer;
				break;
			}
		}
		return resultCustomer;
	}
	
	//실제 지불금액, 보너스 포인트 출력
	
	public static void showPriceBouns(Customer customer , int Price) {
		System.out.println("============고객 할인율과 보너스 포인트========================");
		//지불 금액
		
		int cost = customer.calcPrice(Price);
		
		System.out.println(customer.getCustomerName() + "님의 지불금액: " + cost + "원");
		System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트: " + customer.bounsPoint + "점");
	}
	
}
