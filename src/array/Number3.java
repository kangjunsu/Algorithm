package array;

import java.util.*;

public class Number3 {

	public char[] solution(int[] A, int[] B) {
		char[] result = new char[A.length];
		
		for(int i = 0; i < A.length; i++) {
			if(A[i] == B[i]) result[i] = 'D';
			if(A[i] == 1) {
				if(B[i] == 2) result[i] = 'B';
				if(B[i] == 3) result[i] = 'A';
			} else if(A[i] == 2) {
				if(B[i] == 1) result[i] = 'A';
				if(B[i] == 3) result[i] = 'B';
			} else if(A[i] == 3) {
				if(B[i] == 1) result[i] = 'B';
				if(B[i] == 2) result[i] = 'A';
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		//3. 가위 바위 보
		Number3 n3 = new Number3();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int A[] = new int[N];
		int B[] = new int[N];
		
		for(int i = 0; i < N; i++) {
			A[i] = scan.nextInt();
		}
		for(int i = 0; i < N; i++) {
			B[i] = scan.nextInt();
		}
		for(int i = 0; i < N; i++) {
			System.out.println(n3.solution(A, B)[i]);			
		}
	}

}
