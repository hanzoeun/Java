package Jave.modeing.ch01.asso2;

import java.util.ArrayList;

public class Student {
	//필드생성
		private String name;
		
		// private Student student 1:1일 경우에는 ArrayList x
		private ArrayList<Student> student; //양방향 관계=> 서로가 서로의 객체를 필드로 가지고 있다..
		
		
		//생성자 
		public void Course(String name) {
			this.name = name;
			student = new ArrayList<>();
			
		}
		
		
		public String getname() {
			return name;
		}
		
		//메소드 생성
		//수강신청한 학생 추가
		public void addStudent() {
			
			
		}
		
		//수강신청한 학생 제거
		public void removeStudent(Student student) {
			
		}
}
