package SumSung;

import java.util.ArrayList;
import java.util.Scanner;

import javax.accessibility.AccessibleExtendedTable;

import Customer_project.Customer;

public class AppliancesExample extends Appliances {
	public static Scanner scanner = new Scanner(System.in);

	private static ArrayList<Appliances> AppliancesList = new ArrayList<>();

	public static void main(String[] args) {
		Appliances Phone1 = new Phone(120000, "핸드폰", "그린");
		Appliances Tv1 = new Tv(150000, "Tv", "블랙");
		Appliances Computer1 = new Computer(180000, "컴퓨터", "흰색");

		AppliancesList.add(Computer1);
		AppliancesList.add(Tv1);
		AppliancesList.add(Phone1);

		boolean run = (true);
		while (run) {
			System.out.println("=====================================");
			System.out.println("제품을 선택해주세요");
			System.out.println("=====================================");
			System.out.println("1. Tv || 2. Phone || 3.Computer || 4.종료");
			System.out.println("> 선택");

			int selectNo = scanner.nextInt();

			switch (selectNo) {
			case 1:
				System.out.println("제품명 : " + Tv1.getModel() );
				showPricePayBack(Tv1, 150000);
				byappl();
				break;
			case 2:
				System.out.println("제품명 : " + Phone1.getModel() );
				showPricePayBack(Phone1, 120000);
				byappl();
				break;
			case 3:
				System.out.println("제품명 : " + Computer1.getModel());
				showPricePayBack(Computer1, 180000);
				byappl();
				break;
			case 4:
				System.out.println("종료합니다.");
				return;
				
		}
			
			

		Appliances appliances = findAppliances("");

		
	}

		
	}
	
	private static void byappl() {
		System.out.println("===============================");
		System.out.println("1. 구매하기 || 2. 이전으로 돌아가기");
		System.out.println("===============================");
		
		int selectNo = scanner.nextInt();
		switch (selectNo) {
		case 1: System.out.println("구매완료");
		
		 return;
		case 2:System.out.println("다시 선택해주세요 ");
		 return;
		}  return;
	}
	protected static void showAllappl() {
		System.out.println("================모든 제품 정보 출력====================");

		for (Appliances appliances : AppliancesList) {
			System.out.println(appliances.ShowAppliancesInfo());
		}

	}

	public static Appliances findAppliances(String Model) {
		Appliances resultAppliances = null;
		for (Appliances appliances : AppliancesList) {

			// 모델이 같으면
			if (appliances.getModel() == Model) {

				resultAppliances = appliances;
				break;
			}
		}
		return resultAppliances;
	}

	public static void showPricePayBack(Appliances appliances, int Price) {
		

		int cost = appliances.PayPrice(Price);
		
		
		System.out.println(appliances.getModel() + "제품명 : " + cost + "원");
		System.out.println("현금 페이백 금액 " + appliances.PayPrice(PayBackmoney) + "원");
		
	}

}
