package pPck;

import java.util.LinkedHashMap;
import java.util.Map;

public class Demo {
public static Map<Character, Integer> countTheString(String str) {
	
	Map<Character,Integer> charCountMap = new LinkedHashMap<Character, Integer>();
	
	char[] charArray = str.toCharArray();
	
	for (char c : charArray) {
		if (charCountMap.containsKey(c)) {
			charCountMap.put(c, charCountMap.get(c)+1);
		}else {
			charCountMap.put(c, 1);
		}
	}
	return charCountMap;
}
public static void main(String[] args) {
	String str = "Gokul Karthick";
	
	Map<Character, Integer> countTheString = countTheString(str);
	
	for (Character c : countTheString.keySet()) {
		System.out.println("'"+c+"'" +"number of count is "+countTheString.get(c));
		
	}
	
}
}
