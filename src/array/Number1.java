package array;

import java.util.*;

public class Number1 {
	
	static ArrayList<Integer> list = new ArrayList<>();
	
	public void solution(int[] arr) {
		list.add(arr[0]);
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > arr[i-1]) {
				list.add(arr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
//		N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
//		(첫 번째 수는 무조건 출력한다)
		Scanner scan = new Scanner(System.in);
		Number1 n1 = new Number1();
		
		int N = scan.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}
		n1.solution(arr);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
	}

}
