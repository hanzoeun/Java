package Ch05_for문2;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		int sum = 0;
		
		//평균점수 구하기
		
		for (int score : scores) {
			System.out.println(score);
			
			sum += score;
		}
		
		double avg = (double) sum / scores.length;
		System.out.println("평균 :" + avg);
	}

}
