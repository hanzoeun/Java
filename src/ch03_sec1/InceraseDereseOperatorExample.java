package ch03_sec1;

public class InceraseDereseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		x++; //11
		++x; //12
		
		System.out.println("x=" + x);
		System.out.println("==========================");
		
		y--; //9
		--y; //8
		
		System.out.println("y=" + y);
		
		
		z = ++x;
		
		
		System.out.println("z=" + z); //12
		System.out.println("x=" + x); //13
		
		z = ++x + y++;
		
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
 		

	}

	
}
