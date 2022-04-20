package string;

import java.util.*;

public class Number5 {

	public char[] solution(String str) {
		
		char[] answer = str.toCharArray();
		int lt = 0;
		int rt = str.length()-1;
		
		while(lt < rt) {
			if((answer[lt] >= 65 && answer[lt] <= 122) && (answer[rt] >= 65 && answer[rt] <= 122)) {
				char temp = answer[lt];
				answer[lt] = answer[rt];
				answer[rt] = temp;				
			}
			lt++;
			rt--;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		//5. 특정문자 뒤집기
		
		Number5 n5 = new Number5();
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.print(String.valueOf(n5.solution(str)));
		
	}

}
