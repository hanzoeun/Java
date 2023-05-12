package ch02_Sec10;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		
		//  <> 문자를 숫자열로 바꾸는 방법
			String  a = "10";
			int value1 = Integer.parseInt("10"); // String => int 
			double value2 = Double.parseDouble(a);
			boolean value3 = Boolean.parseBoolean("true");
			
			
			System.out.println("value1:" +value1);
			System.out.println("value2:" +value2);
			System.out.println("value3:" +value3);
			
			// 숫자를 문자열로 바꾸는 방법
			
			String str1 = String.valueOf(10); // int => string
			String str2 = String.valueOf(3.14); // double => string
			String str3 = String.valueOf("true") ;
			
			System.out.println(str1);
			System.out.println(str2);
			System.out.println(str3);
	}

}
