package Jave.modeing.ch01.asso;

import java.util.ArrayList;

public class Student {
	
	//필드값 
	private String name;
	
	
	//단방향 관계 => 학생은 자기가 수강하는 과목을 알고있다.
	private ArrayList<Course> course;  
	
	//생성자 
	public Student(String name) {
		this.name = name;
		course = new ArrayList<>();
	}
	
	//메소드 생성 
	
	public void registerCourse() {
		
	}
	
	public void dropCourse() {
		
	}
}	
