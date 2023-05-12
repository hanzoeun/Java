package game;

import java.util.Scanner;

public class Game {
	  int hp = 10;
	  int monster = 40;
	  int ex = 0;
	  int monsterex = 150;
	  int sk = 10;
	  int lv = 1;
	  int count = 0;
	  
	  void run(int count) {
			monster = monster * count;
			Scanner scanner = new Scanner(System.in);
			String strNum = scanner.nextLine();
			
			System.out.println("========================");
			System.out.println("1. 공격 || 2. 방어 || 3. 도망");
			System.out.println("========================");
	  }

}
