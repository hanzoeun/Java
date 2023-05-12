	package ch04_IF함수;

public class IfNestedExample {

	public static void main(String[] args) {
//		double score = Math.random(); //  0.0~ 1.0 사이의 숫자를 만들어 준다. 
//		
//		System.out.println(score);
		
		//공식 int num = ((int) Math.random() * n ) + start; 
		// n : 정수의 갯수, start 시작 숫자 
		
		
		//int score = (int) (Math.random() * 45) + 1 ;
		
		//		 System.out.println(score);
		
		
		//81~부터 20개의 정수를 만든다. => 81~100까지 만든다 
		int score = (int)(Math.random()*20) + 81;
		String grade;
		
		if (score >= 90) {
			if ( score >= 95) grade ="A+";
			else grade = "A";
		} else { 
			if (score >= 85) grade ="B+";
			else grade = "B";
		}
		
		
		
		
	}

}
