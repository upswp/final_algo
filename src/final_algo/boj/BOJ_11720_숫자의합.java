package final_algo.boj;

import java.util.Scanner;

public class BOJ_11720_숫자의합 {

	static int N, sum;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		char arrayN[] = sc.next().toCharArray();
		for (int i = 0; i < arrayN.length; i++) {
			sum += (arrayN[i]-'0');
		}
		System.out.println(sum);
	}
}
