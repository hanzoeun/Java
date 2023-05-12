package test__sec01;

public class Test_sec12 {
	   public static void main(String[] args) {
		      char ch = '3';
		      				// a ~ z 사이의
		      boolean b =  ('a' <= ch && ch <= 'z')  || ('A' <= ch && ch <= 'Z') || ('0' <= ch && ch <= '9');
		      System.out.println(b);
		    }
}
