package Ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	
	public static void main(String[] args) {
		
		//Map<key의 타입,저장할 값의 타입>을 명시한다. =>뒤에는 생략가능 
		Map<String, Integer> map = new HashMap<>();
		
		
		map.put("신용권", 85);
		map.put("홍깅동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println(map.size()); //map 은 key값이 같은 데이터를 중복 저장할 수 없다. 
		
		//키로 값을 얻기
		String key = "홍길동";
		int value = map.get(key);
		System.out.println(key + ":" + value);
		System.out.println("======================================");
		
		//전체 데이터 출력하는 방법 (1)
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) { //키의 갯수만큼 반복해준다
			String k = keyIterator.next(); //키를 하나씩 가져온다.
			int v = map.get(k);
			System.out.println(k + ":" + v);
		}
	map.remove("홍길동"); // key로 데이터 삭제 
	}
}
