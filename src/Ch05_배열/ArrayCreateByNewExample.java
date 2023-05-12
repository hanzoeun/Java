package Ch05_배열;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		
		// 배열 타입, 크기만...
		int[] arr1 = new int[3];
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println("===============================================");
		

		
		double[] arr2 = new double[3];
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr2[i]);
		}
		
		
		System.out.println("===============================================");	

		
		String[] arr3 = new String[3];
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr3[i]);  //page 172
		}
	}
	

}
