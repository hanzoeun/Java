package Jave.modeing.ch01.asso3;

import java.util.ArrayList;

import Jave.modeing.ch01.asso2.Student;

public class Course {
	private String name;
	// private Course course 1:1일 경우에는 ArrayList x
	private ArrayList<Transcript> transcripts; // 양방향 관계 => 서로가 서로의 객체를 필드로 가지고 있다.

	// 생성자
	public Course(String name) {
		this.name = name;
		transcripts = new ArrayList<>();

	}

	// 수강 신청 추가
	public void addTranscript(Transcript transcript) {
		transcripts.add(transcript);
	}

}
