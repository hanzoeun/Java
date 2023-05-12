package Ch05_Arraycopy;

public class ArrayCopybyforExample {

	public static void main(String[] args) {
		int[] oldIntArray = {1,2,3};
		int[] newInArray = new int[5];
		
		// 배열 복사
		for(int i=0; i<oldIntArray.length; i++) {
			newInArray[i] = oldIntArray[i];
		}
		
		//newInArray값 출력 
		
		for(int i=0; i<newInArray.length; i++) {
			System.out.println(newInArray[i]);
		}
	}

}
