package Ch05_sec08;

public class ArrayReferenceobjectExample {

	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "java"; //10번지
		                        // 같은 주소를 가지고있음
		strArray[1] = "java"; //10번지
		strArray[2] = new String("java"); // 다른주소를 가지고있음 
		
		System.out.println(strArray[0] == strArray[1]); // 주소가 같다
		System.out.println(strArray[0] == strArray[2]); // 주소가 다르다
		System.out.println(strArray[0]. equals(strArray[2])); // equals 주소상관없이 값만 비교하기때문에 값을 같음
	}

}
