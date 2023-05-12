package GradeStudent;

import java.util.ArrayList;

public class LangStudent extends Grade{
	
	
	protected ArrayList<LangStudent> langStudents;
	
	
	public LangStudent(String name , String Studentno, int lang , int math) {
		super(name,Studentno,lang,math);
		
		super.subject = "국어";
		
		langStudents = new  ArrayList<>();
		
		
	}


	public void  vlewgrade(int lang , int math) {
		for (int i=0; i<lang ; i++) {
			if (95 <= 100) {
				System.out.println(lang + "S");
			} else if (90 <= 94 ) {
				System.out.println(lang +"A");
			} else if (80 <= 89) {
				System.out.println(lang + "B");
			} else if (70 <= 79) {
				System.out.println(lang + "C");
			} else if (60 <= 69) {
				System.out.println(lang + "D");
			} else {
				System.out.println(lang + "F");
			} 
	}
		for (int i=0; i<math ; i++) {
			if (90 <= 100) {
				System.out.println(math + "A");
			} else if (80 <= 89 ) {
				System.out.println(math + "B");
			} else if (70 <= 79) {
				System.out.println(math + "C");
			} else if (60 <= 69) {
				System.out.println(math + "D");
			} else {
				System.out.println(math + "F");
			} 
			
		}
}
}
