package final_algo.boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

/*Silver 4*/
/*31324KB	380ms*/
public class BOJ_11652_카드_hashmap {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		HashMap<Long,Integer> map = new HashMap<>();
		long arr[] = new long[N];
		for (int i = 0; i < N; i++) {
			arr[i]=Long.parseLong(br.readLine()); 
		}
		long max = 0;
		long ans = Integer.MAX_VALUE;
		for (Long num : arr) map.put(num, map.getOrDefault(num, 0) + 1);
		for (Long num : map.keySet()) max = Math.max(max, map.get(num));
		for (Long num : map.keySet()) if(max == map.get(num)) ans = Math.min(ans,num);
		System.out.println(ans);
	}
}
