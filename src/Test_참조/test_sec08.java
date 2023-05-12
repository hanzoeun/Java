package Test_참조;

public class test_sec08 {

	public static void main(String[] args) {
		int[][] array = {
			      {95, 86},
			      {83, 92, 96},
			      {78, 83, 93, 87, 88}
			};
		
		int num1 = 0; // 전체 학생수 
		int num2 = 0; // 전체 점수합
		
		
		for (int i=0; i<array.length; i++) {
			
			num1 += array[i].length;
			
			 System.out.println(num1);
			for (int k=0; k<array[i].length; k++) {
				 
				
				/* System.out.println("array[" + i + "]" + "[" + k + "] :" + array[i][k]); */
				
				num2 += array[i][k];
				
			}
		}
		
		System.out.println("합:" + num2);
		System.out.println("전체 학생의 점수 평균:" +(double)num2 / num1);
	}

}

