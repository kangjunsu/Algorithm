package string;

import java.util.*;

public class Case_Conversion {
	
	public String solution(String s1) {
		StringBuilder sb = new StringBuilder();
		
//		for(int i = 0; i < s1.length(); i++) {
//			
//			if(s1.charAt(i) <= 96) {
//				sb.append((char)(s1.charAt(i) + 32));
//			} else {
//				sb.append((char)(s1.charAt(i) - 32));
//			}
//		}
		
		for(char x : s1.toCharArray()) {
			if(Character.isLowerCase(x)) {
				sb.append(Character.toUpperCase(x));
			} else {
				sb.append(Character.toLowerCase(x));
			}
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Case_Conversion cc = new Case_Conversion();
		Scanner scan = new Scanner(System.in);
		
		//System.out.println((int)'a');
		//System.out.println((int)'A'+ 32);
		
		String s1 = scan.next();
		System.out.println(cc.solution(s1));
		
	}

}
