package question;

public class IsNumber {
	public static boolean inNumber(String str) {
		if (str == null || str.equals("")) return false;
		
		for(int i=0 ; i<str.length(); i++) {
			char ch = str.charAt(i);
			System.out.print(ch);
			if (ch <'0' || ch> '9') {
				return false;
			}
		}   return true;
	}

	public static void main(String[] args) {
		String str = "123";
		System.out.printf(str + "는 숫자입니까? " + inNumber(str));
		str = "1234o  ";
		System.out.printf(str + "는 숫자입니까? " + inNumber(str));
	}

}
