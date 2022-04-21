package array;

import java.util.*;

public class Number4 {

	public int[] solution(int N) {
		int[] arr = new int[N];
		arr[0] = 1;
		arr[1] = 1;
		
		for(int i = 2; i < N; i++) {
			arr[i] = arr[i-2] + arr[i-1];
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		//피보나치 수열
		Scanner scan = new Scanner(System.in);
		Number4 n4 = new Number4();
		int N = scan.nextInt();
		int[] arr = n4.solution(N);
		
		for(int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
