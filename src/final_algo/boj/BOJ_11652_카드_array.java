package final_algo.boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*Silver 4*/
/*24600KB	268ms*/
public class BOJ_11652_카드_array {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long arr[] = new long[N];
		for (int i = 0; i < N; i++) {
			arr[i]=Long.parseLong(br.readLine()); 
		}
		Arrays.sort(arr);
		int cnt = 1,max = 1;
		long ans = arr[0];
		for (int i = 1; i < N; i++) {
			if(arr[i] == arr[i-1])cnt+=1;
			else cnt = 1;
			if(max < cnt) {
				max = cnt;
				ans = arr[i];
			}
		}
		System.out.println(ans);
	}
}
