package final_algo.boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*Silver 2*/
public class BOJ_10819_차이를최대로 {

	static int N , arr[], tmp[], max;
	static boolean visited[];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		arr = new int[N];
		tmp = new int[N];
		visited = new boolean[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		nPr(0);
		System.out.println(max);
	}
	public static void nPr(int cnt) {
		if(cnt == N) {
			int sum = 0;
			for (int i = 0; i < N; i++) {
				if(i+1<N)sum += Math.abs(tmp[i]-tmp[i+1]);
			}
			max = Math.max(max,sum);
		}
		for (int i = 0; i < N; i++) {
			if(!visited[i]) {
				visited[i] = true;
				tmp[cnt] = arr[i];
				nPr(cnt+1);
				visited[i] = false;
			}
		}
	}

}
