package final_algo.boj;

import java.util.Scanner;

public class BOJ_1085_직사각형에서탈출 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int answer = Integer.MAX_VALUE;
		
		answer = Math.min(answer,x);
		answer = Math.min(answer,y);
		if(w-x>=0) {
			answer = Math.min(answer, w-x);
		}
		if(h-y>=0) {
			answer = Math.min(answer, h-y);
		}
		System.out.println(answer);
	}
}
