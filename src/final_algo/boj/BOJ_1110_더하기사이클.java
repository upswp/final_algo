package final_algo.boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_1110_더하기사이클 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int next = N;
		int cnt = 0;
		while(true) {
			cnt++;
			
			int next_one = next % 10;
			int next_ten = next / 10;
			
			int sum = next_one + next_ten;
			
			next = next_one * 10 + sum % 10;
			
			if(next == N) {
				break;
			}
		}
		System.out.println(cnt);
	}
}
