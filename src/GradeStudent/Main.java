package GradeStudent;

import java.util.ArrayList;

import Customer_project.Customer;

public class Main {
		private static ArrayList<MathStudent> mathstudentlist = new ArrayList<>();
		private static ArrayList<LangStudent> langstudentlist = new ArrayList<>();

		public static void main(String[] args) {
			//국어 수강생
			Grade jeeun = new LangStudent("박지은" , "181213" , 56 , 95);
			Grade hyunok = new LangStudent("이현욱" , "171230" , 100 , 88);
			Grade jeeyeung = new LangStudent("임지연" , "171255" , 89 , 95);
			
			//수학 수강생
			Grade jaehyun = new MathStudent("김재현" , "171590" , 83 , 56);
			Grade ssss = new MathStudent("차슬기" , "181518" , 95 , 98);
			
			
			
			//ArrayList에 객체를 추가
			mathstudentlist.add((MathStudent) jaehyun);
			mathstudentlist.add((MathStudent) ssss);
			
			//ArrayList객체를 추가
			langstudentlist.add((LangStudent) jeeun);
			langstudentlist.add((LangStudent) hyunok);
			langstudentlist.add((LangStudent) jeeyeung);
			
			//모든 학생 정보 출력하기 
			showmathstudentInfo();
			showlangstudentInfo();
		}
		
		public static void showmathstudentInfo() {
			System.out.println("====================================");
			System.out.println("            수학수강생 학점              ");
			System.out.println("이름 | 학번 | 필수과목 | 점수");
			for(Grade  grade :mathstudentlist ) {
				System.out.println(grade.showmathstudentInfo());
				
			}
			
		}
		
		public static void showlangstudentInfo() {
			System.out.println("====================================");
			System.out.println("           국어수강생 학점              ");
			System.out.println("이름 | 학번 | 필수과목 | 점수");
			for(Grade  grade :langstudentlist ) {
				System.out.println(grade.showlangstudentInfo());
				
			}
			
		}
}
