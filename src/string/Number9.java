package string;

import java.util.*;

public class Number9 {

	public int solution(String str) {
		char[] ch = str.toCharArray();
		int answer = 0;
		StringBuffer sb = new StringBuffer();
		for(char x : ch) {
//			if(48 <= x && x <= 57){
//				answer = answer * 10 + (x-48);
//			}
			if(Character.isDigit(x)) {
				sb.append(x);
			}
		}
		
		return Integer.parseInt(sb.toString());
//		return answer;
	}
	
	public static void main(String[] args) {
		//9. 숫자만 추출
		//문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
		//만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
		//추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
		Number9 n9 = new Number9();
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.println(n9.solution(str));
//		System.out.println(n9.solution(str));
	}

}
