package string;

import java.util.*;

public class Number10 {

	public String solution(String str, char c) {
		
		int p = 1000;
		int[] arr = new int[str.length()];
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != c) {
				p++;
				arr[i] = p;
			} else {
				p = 0;
			}
		}
		
		p = 1000;
		for(int i = str.length()-1; i >= 0; i--) {
			if(str.charAt(i) != c) {
				p++;
				if(arr[i] > p) {
					arr[i] = p;
				}
			} else {
				p = 0;
			}
		}
		StringBuffer sb = new StringBuffer();
		for(int i = 0 ; i < arr.length; i++) {
			sb.append(arr[i]).append(" ");
		}
		sb.delete(sb.length()-1, sb.length()-1);
		return sb.toString();
	}
	
	public static void main(String[] args) {
		//한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
		//teachermode e
		//1 0 1 2 1 0 1 2 2 1 0
		Number10 n10 = new Number10();
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		char c = scan.next().charAt(0);
		System.out.println(n10.solution(str, c));
	}

}
