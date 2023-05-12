package Test_클래스;

public class IsNumberExample {

	public boolean isNumber(String str) {
		if (str == null || str.equals(""))
			return false;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch < '0' || ch > '9') {
				return false;
			}
		} // for
		return true;
	}

	
	public static void main(String[] args) {
		IsNumberExample  isnumber = new IsNumberExample();
		
		isnumber.isNumber("3");
	}
}



