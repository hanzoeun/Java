package GradeStudent;

import java.util.ArrayList;

public class MathStudent extends Grade {
	protected ArrayList<MathStudent> mathStudents;
	
	
	public MathStudent(String name , String Studentno, int lang , int math) {
		super(name,Studentno,lang,math);
		
		super.subject = "수학";
		
		mathStudents = new  ArrayList<>();
		
		
	}


	public void  vlewgrade(int math , int lang) {
		for (int i=0; i<lang ; i++) {
			if (95 <= 100) {
				System.out.println(math + "S");
			} else if (90 <= 94 ) {
				System.out.println(math +"A");
			} else if (80 <= 89) {
				System.out.println(math + "B");
			} else if (70 <= 79) {
				System.out.println(math + "C");
			} else if (60 <= 69) {
				System.out.println(math + "D");
			} else {
				System.out.println(math + "F");
			}
			
	}
		for(int i=0 ; i<lang ; i++) {
			if (90 <= 100) {
				System.out.println(lang + "A");
			} else if (80 <= 89 ) {
				System.out.println(lang + "B");
			} else if (70 <= 79) {
				System.out.println(lang + "C");
			} else if (60 <= 69) {
				System.out.println(lang + "D");
			} else {
				System.out.println(lang + "F");
			} 
}
	}}
