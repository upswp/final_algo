package final_algo.boj;

import java.util.Scanner;

public class BOJ_10163_색종이 {

	static int N;
	static int[][] map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		map = new int[101][101];
		for (int n = 1; n <= N; n++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int w = sc.nextInt();
			int h = sc.nextInt();
			for (int i = a; i < a + w; i++) {
				for (int j = b; j < b + h; j++) {
					map[i][j] = n;
				}
			}
		}
		int cnt[] = new int[N];
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				if (map[i][j] != 0) {
					cnt[map[i][j] - 1]++;
				}
			}
		}

		for (int i = 0; i < N; i++) {
			System.out.println(cnt[i]);
		}
	}
}
