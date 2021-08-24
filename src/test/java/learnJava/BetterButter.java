package learnJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BetterButter {


	public static void getFrequency(String str) {

		str = str.trim();
		str = str.replaceAll(" ", "");

		char[] c= str.toCharArray();

		Map<Character, Integer> map = new HashMap<>();

		for (char d : c) {

			if(map.containsKey(d)) {
				map.put(d, map.get(d)+1);
			}else {
				map.put(d, 1);
			}

		}

		System.out.println(map);

		Set<Character> set = map.keySet();
		for (Character e : set) {
			if(map.get(e)>=1) {
				System.out.println(e+" : "+map.get(e));
			}

		}

	}
	public static void main(String[] args) {

		BetterButter.getFrequency("Better Butter");
	}

}
