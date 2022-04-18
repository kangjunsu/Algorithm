package string;

import java.util.*;

public class Number3 {

	public String solution(String str) {
		
//		String[] arr = str.split(" ");
//		String answer = arr[0];
//		for(int i = 1; i < arr.length; i++) {
//			if(temp.length() < arr[i].length()) {
//				temp = arr[i];
//			}//if
//		}//for
		
		String answer = "";
		int m = Integer.MIN_VALUE, pos;
		while((pos = str.indexOf(' ')) != -1) {
			String tmp = str.substring(0, pos);
			int len = tmp.length();
			if(len > m) {
				m = len;
				answer = tmp;
			}
			str = str.substring(pos+1);
		}
		
		if(str.length() > m) {
			answer = str;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		//3. 문장 속 단어
		Scanner scan = new Scanner(System.in);
		Number3 n3 = new Number3();
		
		System.out.println(n3.solution(scan.nextLine()));
	}

}
