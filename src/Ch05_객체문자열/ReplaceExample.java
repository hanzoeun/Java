package Ch05_객체문자열;

public class ReplaceExample {

	public static void main(String[] args) {
		String oldstr = "자바 문자열은 불변입니다. 자바 문자열은 string입니다.";
		String newStr = oldstr.replace("자바","JAVA");
		
		System.out.println(oldstr);
		System.out.println(newStr);
	}
	

}
