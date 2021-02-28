package final_algo.boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*Silver 1*/
public class BOJ_9205_맥주마시면서걸어가기_플로이드와샬 {

	class Point {
		int x;
		int y;
		public Point(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
	}
	
	static int T, N;
	static Point point[];
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			N = Integer.parseInt(br.readLine());
			point = new Point[N + 2];
			
		}
	}
}
