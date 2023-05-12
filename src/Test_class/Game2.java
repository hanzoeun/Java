package Test_class;

import java.util.Scanner;

public class Game2 {  //필드값
 int dmg = 10;
 int monsterhp = 50;
 int coin = 0;
 int lv = 1;
 
 void setcoin(int coin) { // 코인추가
	 this.coin += coin;
 }
 
 boolean isLeftcoin() { //코인 갯수확인
	 if (coin == 0) {
		 System.out.println("coin이 없습니다.");
		 
		 return false;
	 }
	 
	 System.out.println("게임을 시작하세요");
	 
	 return true;
 }
 
 void dmgup() {  //데미지 업글
	 dmg++;
 }
 
 void run (int coin) {
	 
	 while(true) {
		 System.out.println("캐릭터생성완료");
		 System.out.println("=================================");
		 System.out.println("1. 공격 || 2. 방어 || 3.도망가기");
		 System.out.println("=================================");
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("입력 >");
		 
		 int strNum = scanner.nextInt();
		switch (strNum) {
		case 1 :
			System.out.println("몬스터를 공격합니다");
			monsterhp -= dmg;
			System.out.println("몬스터 체력" + monsterhp + "들어간데미지데미지" + dmg);
			
			if(monsterhp <=0 ) {
				System.out.println("전투에서 승리하셧습니다." +  "레벨업하셧습니다");
				lv ++;
				break;
			}
			
			
		case 2 :
			System.out.println("방어합니다.");
			
			
			break;

		case 3 : 
			System.out.println("도망갑니다.");
		   coin -= 1;
		   System.out.println("현재 남은 코인갯수" + coin);
		   
		  
		   break;
		} return;
		
		
		 }
	 }
 }
 

