package string;

import java.util.*;

public class Number6 {

	public String solution(String str) {
		
		char[] ch = str.toCharArray();
		ArrayList<Character> arr = new ArrayList<>();
		StringBuffer sb = new StringBuffer();
		for(char x : ch) {
			
			if(!arr.contains(x)) {
				sb.append(x);
				arr.add(x);
			}
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		//중복문자 제거
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		Number6 n6 = new Number6();
		System.out.println(n6.solution(str));
	}

}
