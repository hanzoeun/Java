package Ch12.sec03.exam01;


//동등 비교 : 객체가 달라도 내부의 데이터가 같은지 비교
public class EqualsExample {
String a ="테스트";
String 	b ="테스트";

@Override
public boolean equals(Object obj) {
	if (obj instanceof Member) {
		Member target = (Member)obj;
		if (id.equals(target.id)) {
			
		
			return turn;
		}
	}
	return false;
}



}
