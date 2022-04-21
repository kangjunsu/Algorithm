package array;

import java.util.*;

public class Number2 {

	public int solution(int[] arr) {
		int cnt = 1;
		int max = arr[0];
		
		for(int i = 1; i < arr.length-1; i++) {
			if(max < arr[i]) {
				cnt++;
				max = arr[i];
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		//2. 보이는 학생
		Scanner scan = new Scanner(System.in);
		Number2 n2 = new Number2();
		int N = scan.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.print(n2.solution(arr));
	}

}
