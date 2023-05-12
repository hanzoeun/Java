package Test_class;

public class Game2Example {

	public static void main(String[] args) {
		Game2 mygame2 = new Game2();
		
		mygame2.setcoin(5);
		
		if (mygame2.isLeftcoin()) {
			System.out.println("게임을 시작하겠습니다.");
			while(true) {
				mygame2.run(5);
			} 
		} System.out.println("코인을 넣어주세요");
		System.out.println("남은 코인 갯수" + mygame2.coin);
	}
	
	

}
