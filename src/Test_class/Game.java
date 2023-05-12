package Test_class;

import java.util.Scanner;

public class Game {
	int hp = 10;
	int monster = 40;
	int ex = 0;
	int monsterex = 150;
	int sk = 10;
	int lv = 1;
	int count = 0;
	
	

	// 몬스터 처치

	void run(int count) { // gameExample 에서 입력받음
		System.out.println("========================");  // Scanner 입력 방식 문구
		System.out.println("1. 공격 || 2. 방어 || 3. 도망");
		System.out.println("========================");
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력 >");
		String strNum = scanner.nextLine();

		
		
		
		while (true) {
			if (strNum.equals("1")) {
				monster-= sk;
				hp--;
				System.out.println("몬스터를 공격합니다");
				System.out.println("현재 남아있는 몬스터체력: " + monster + "현재남아있는체력 : " + hp);
				
				
				if (monster <= 0) {
					System.out.println("전투에서 승리하였습니다.");
					
				}
				
				
				break;
				
				
			}
				
				
			else if  (monster <= 0) {
				
				System.out.println("전투에서 승리하셧습니다");
				
				
			break;
				
			}
			
			 else if (strNum.equals("2")) {
				hp++;
				System.out.println("방어에 성공하셧습니다.");
			} else if (strNum.equals("3")) {
				System.out.println("도망치셧습니다.");
				
				break;
			}  

			ex = monsterex * count;

		}
		
	  // 레벨업
		if (ex > 200) {
			System.out.println("레벨업 하셧습니다.");
			
			sk += 1;
			System.out.println("공격력이 올라갔습니다.");
		
		}
		System.out.println("경험치가 부족합니다.");
		
	
	
	
	}

	
	
	
	void skup() {
		sk++;
	}
	
	void hpup() {
		hp++;
	}
}
