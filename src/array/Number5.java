package array;

import java.util.*;

public class Number5 {

	public int solution(int N) {
		int cnt = 0;
		int[] list = new int[N+1];
		for(int i = 2; i <= N; i++) {
//			for(int j = 1; j <= i/2; j++) {
//				if(j != 1) {
//					if(i % j == 0) {
//						break;
//					}
//				}
//				if(j == i/2) cnt++;
//			}
			if(list[i] != 1) {
				cnt++;
			}
			for(int j = i; j <= N; j = j + i) {
				list[j] = 1;
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		//소수
		Scanner scan = new Scanner(System.in);
		Number5 n5 = new Number5();
		int N = scan.nextInt();
		
		System.out.println(n5.solution(N));
	}

}
