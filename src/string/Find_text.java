package string;

import java.util.*;

public class Find_text {

	public int solution(String s1, String s2) {
		
		char temp = s2.toLowerCase().charAt(0);
		int cnt = 0;
		
		s1 = s1.toLowerCase();
		for(int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) == temp) {
				cnt++;
			}//if
		}//for
		
		return cnt;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Find_text ft = new Find_text();
		Scanner scan = new Scanner(System.in);
		String input1 = scan.next();
		String input2 = scan.next();
		
		int result = ft.solution(input1, input2);
		System.out.println(result);
		
	}

}
