package final_algo.boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10871_X보다작은수 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		int arrayN[] = new int [N];
		st = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < arrayN.length; i++) {
			arrayN[i] = Integer.parseInt(st.nextToken());
			if(arrayN[i]<X) {
				sb.append(arrayN[i]+" ");
			}
		}
		System.out.println(sb.toString());
	}
}
