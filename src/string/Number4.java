package string;

import java.util.*;

public class Number4 {

	public String[] Solution(String[] s1, int N) {
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			sb.append(s1[i]).reverse();
			s1[i] = sb.toString();
			sb.delete(0, s1[i].length());
		}
		
//		for(String x : s1) {
//			char[] s = x.toCharArray();
//			int lt = 0, rt = x.length()-1;
//			while(lt < rt) {
//				char tmp = s[lt];
//				s[lt] = s[rt];
//				s[rt] = tmp;
//				lt++;
//				rt--;
//			}
//		}
		return s1;
	}
	
	public static void main(String[] args) {
		//단어 뒤집기
		
		Scanner scan = new Scanner(System.in);
		Number4 n4 = new Number4();
		
		int N = scan.nextInt();
		String[] s1 = new String[N];
		for(int i = 0; i < N; i++) {
			s1[i] = scan.next();
		}//for
		s1 = n4.Solution(s1, N);
		for(int i = 0; i < N; i++) {
			System.out.println(s1[i]);
		}
		
	}

}
