package Ch15.sec05.exam01;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		
		
		//점수 저장 
		scores.add(87);
		scores.add(98);
		scores.add(78);
		scores.add(95);
		scores.add(80);
		
		//모든 데이터 출력하기 => 기본 오름차순 정렬  
		for (Integer s : scores) {
			System.out.println(s);
		}
		
		System.out.println();
		
		System.out.println("가장 낮은 점수: " + scores.first());
		System.out.println("가장 높은 점수: " + scores.last());
		
		System.out.println("95점 아래 점수: " +scores.lower(95));
		System.out.println("95점 위의 점수: " +scores.higher(95));
		
		System.out.println("95점 이거나 바로 아래점수 :" + scores.floor(95));
		System.out.println("87점 이거나 바로 위점수 :" + scores.ceiling(87));
		
		System.out.println();
		
		
		//내림차순 정렬 
		NavigableSet<Integer> descendingScores = scores.descendingSet(); //내림차순 정렬 
		for (Integer s : descendingScores) {
			System.out.println(s);
		}
		
	}
}
