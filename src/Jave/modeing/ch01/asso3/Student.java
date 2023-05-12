package Jave.modeing.ch01.asso3;

import java.util.ArrayList;

public class Student {
	// 필드생성
	private String name;

	private ArrayList<Transcript> transcripts; // 학생 한명은 여러개의 성적을 가지고있기때문에

	// 생성자
	public  Student(String name) {
		this.name = name;
		transcripts = new ArrayList<>();

	}
	
	
	
	// 수강 신청 추가
	public void addTranscript(Transcript transcript) {
		transcripts.add(transcript);
	}

}
