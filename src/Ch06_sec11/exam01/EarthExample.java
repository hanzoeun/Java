package Ch06_sec11.exam01;

public class EarthExample {

	public static void main(String[] args) {
		Earth earth1 = new Earth();
		earth1.personCount = 70;
		
		System.out.println(earth1.personCount + "억 지구1");
		
		Earth earth2 = new Earth();
		
		earth2.personCount = 90;
		System.out.println(earth2.personCount + "억 지구2");
		
		
		System.out.println("지구의 반지름: " + Earth.EARTH_RADIUS);
		System.out.println("지구의 포면적: " + Earth.EARTH_SURFACE_AREA);
	}

}
