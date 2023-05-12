package GradeStudent;

import java.util.ArrayList;

public class Grade {
	//필드 생성하기
	protected String name; // 학생이름
	protected String grade;  // 학생 등급 
	protected String Studentno; // 학번 
	protected int math; // 수학점수 
	protected int lang; // 국어점수 
	protected String subject;  // 과목 
	
	protected ArrayList<Grade> grades;  
	
	// 생성자 생성
	protected Grade (String name ,String Studentno ,  int lang , int math) {
		this.name = name;
		this.Studentno = Studentno;
		
		
		grades = new ArrayList<>();
		
		
	}
	
	public String showmathstudentInfo() {
		return name + "|" + Studentno + "|" + subject + "  " + " |"  + math + "|";
	}
	
	public String showlangstudentInfo() {
		return name + "|" + Studentno + "|" + subject + "  " + " |"  + lang + "|";
	}
	
	
	protected void StudentSub() {
		subject = "학생";
	}
	
	public void  vlewgrade(int math , int lang) {
		for (int i=0; i<math ; i++) {
			if (90 <= 100) {
				System.out.println(math +  ":" + "A");
			} else if (80 <= 89 ) {
				System.out.println(math +  ":" + "B");
			} else if (70 <= 79) {
				System.out.println(math +  ":" +"C");
			} else if (60 <= 69) {
				System.out.println(math +  ":" +"D");
			} else {
				System.out.println(math +  ":" +"F");
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
		
		}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getStudentno() {
		return Studentno;
	}


	public void setStudentno(String studentno) {
		Studentno = studentno;
	}


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		this.math = math;
	}


	public int getLang() {
		return lang;
	}


	public void setLang(int lang) {
		this.lang = lang;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}
}

