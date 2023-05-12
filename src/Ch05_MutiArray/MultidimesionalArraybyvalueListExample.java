package Ch05_MutiArray;

public class MultidimesionalArraybyvalueListExample {

	public static void main(String[] args) {
		int[][] scores = {
				{80,90,96},
				{76,88}
				};
		//배열의 길이
		
//		System.out.println("1차원 배열 길이(반의 갯수):" + scores.length);
//		System.out.println("2차원 배열 길이(첫번째 반의 학생수):" + scores[0].length + "명");
//		System.out.println("2차원 배열 길이(두번째 반의 학생수):" + scores[1].length + "명");
//		
//		//첫번째 반에서 세번째 학생의 점수 읽기
//		System.out.println(scores[0][2] + "점");
//		
//		//두번째 반에서 두번째 학생의 점수 읽기
//		System.out.println(scores[1][1] + "점");
//		
//		//첫번째 반의 평균 점수 구하기
//		int class1Sum = 0;
//		
//		for (int i=0; i<scores[0].length; i++) {
//			class1Sum += scores[0][i];
//			
//		}
//		
//		System.out.println("첫번째 반의 평균: "+(double)class1Sum / scores[0].length );
//		//두번째 반의 평균 점수 구하기
//			int class2Sum = 0;
//			for (int i=0; i<scores[1].length; i++) {
//				
//				class2Sum += scores[1][i];
//			}
//			
//			System.out.println("두번째 반의 평균: "+(double)class2Sum /scores[1].length);
//			
			
			
			//전체 학생의 평균 점수 구하기
			int totalStudent = 0;
			int totalSum = 0;
			
			for (int i=0; i<scores.length; i++) {
				totalStudent += scores[i].length;
				
				for (int k=0; k<scores[i].length; k++) {
					
					
					System.out.println("scores[" + i + "]" + "[" + k + "] :" +  scores[i][k]);
					
					
					totalSum += scores[i][k];
					
//					System.out.println(totalStudent);
					
//					System.out.println("학생 전체 점수합: " + totalSum);
				}
				
			
				
			}
			System.out.println("전체 학생의 점수 평균:" +(double)totalSum / totalStudent);
			
	}

}
