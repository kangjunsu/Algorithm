package string;

import java.util.*;

public class Number11 {

	public String solution(String str) {
		char[] arr = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		int cnt = 1;
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] == arr[i-1]) {
				cnt++;
				if(i == arr.length-1) {
					sb.append(arr[i]);
					sb.append(cnt);
				}
			} else {
				sb.append(arr[i-1]);
				if(cnt > 1) sb.append(cnt);					
				
				if(i == arr.length-1) sb.append(arr[i]);
				cnt = 1;
			}
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
//		11. 문자열 압축
//		알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
//		문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
//		단 반복횟수가 1인 경우 생략합니다.
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		Number11 n11 = new Number11();
		
		System.out.println(n11.solution(str));

	}

}
