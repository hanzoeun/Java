package Ch05_객체문자열;

public class EquailsExample {

	public static void main(String[] args) {
		
//		//  strVar1 과 strVar2 는 같은 주소를 가지고있다.
//		String strVar1 = "홍길동";
//		String strVar2 = "홍길동";
//		
//		
//		// 주소를 비교 	
//		if (strVar
//		1 == strVar2) {
//			System.out.println("strVar1과 strVar2는 같은 주소를 참조");
//		} else {
//			System.out.println("strVar1과 strVar2는 다른 주소를 참조");
//		}
//		
//		//값 자체를 비교하기 위해서는 equals를 사용한다.
//		if (strVar1.equals(strVar2)) {
//			System.out.println("strVar1과 strVar2는 값이 같다");
//			
//		}
		
		//다른 주소를 가지고 있다.
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		
		if (strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 같은 주소를 참조");
		} else {
			System.out.println("strVar3과 strVar4는 다른 주소를 참조");
		}
		
		//값 자체를 비교하기 위해서는 equals를 사용한다.
		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 값이 같다");
			
		}
		
		//빈 문자열도 똑깥이 equals를 사용합니다
		String hobby = "";
		
		if (hobby.equals("")) {
			System.out.println("hobby변수가 참조하는건 빈문자열");}
		}
	}
	


