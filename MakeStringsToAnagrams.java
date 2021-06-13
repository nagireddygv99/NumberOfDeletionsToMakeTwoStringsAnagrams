package code_base_assign_12_06_2021;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MakeStringsToAnagrams {
	public static int getNumberCount(String one, String two) {
		Map<Character, Integer> map = new HashMap<>();
		int c=0;
		for(int i=0;i<one.length();i++) {
			if(map.get(one.charAt(i))==null) {
				map.put(one.charAt(i), 1);
			}
			else {
				int pres = map.get(one.charAt(i));
				map.put(one.charAt(i), pres+1);
			}
		}
		for(int i=0;i<two.length();i++) {
			if(map.containsKey(two.charAt(i))) {
				int pres = map.get(two.charAt(i));
				map.put(two.charAt(i), pres-1);
			}
			else {
				c++;
			}
		}
		for(int i:map.values()) {
			c+=i;
		}
		return c;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String a = sc.next();
		System.out.println("enter another string");
		String b = sc.next();
		System.out.println(getNumberCount(a,b));
	}
}
