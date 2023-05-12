package Ch05_Arraycopy;



public class ArrayCopy2Example {

	public static void main(String[] args) {
		String[] oldstrArray = {"java", "array", "copy"};
		String[] newstrArray = new String[5];
		
		//system.arraycopy(원본배열, 원본배열 시작 인덱스,
		//새배열, 새배열 붙여넣기 시작인덱스, 복사 항목수);
		System.arraycopy(oldstrArray, 0, newstrArray, 0, oldstrArray.length);
		
		for(int i=0; i<newstrArray.length; i++) {
			System.out.println(newstrArray[i]);
		}
	}

}
