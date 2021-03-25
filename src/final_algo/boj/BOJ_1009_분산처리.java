package final_algo.boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1009_분산처리 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[][] save = {{10}, {1}, { 2, 4, 8, 6 }, { 3, 9, 7, 1 }, { 4, 6 }, { 5 }, { 6 }, { 7, 9, 3, 1 }, { 8, 4, 2, 6 },{ 9, 1 } };
		StringBuilder sb = new StringBuilder();
		for (int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int base = Integer.parseInt(st.nextToken())%10;
			int exp = Integer.parseInt(st.nextToken())-1;
			sb.append(save[base][exp%save[base].length]).append("\n");
		}
		System.out.println(sb.toString());
	}
}
