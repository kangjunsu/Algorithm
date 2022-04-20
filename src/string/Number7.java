package string;

import java.util.*;

public class Number7 {

	public String solution(String str) {
		
		str = str.toLowerCase();
		char[] temp = str.toCharArray();
		int lt = 0;
		int rt = str.length()-1;
		
		while(lt < rt) {
			if(temp[lt] != temp[rt]) {
				return "No";
			}
			lt++;
			rt--;
		}
		return "YES";
	}
	
	public static void main(String[] args) {
		//7. 회문 문자열
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		Number7 n7 = new Number7();
		
		System.out.println(n7.solution(str));
	}

}
