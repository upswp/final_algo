package final_algo.boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*Silver 5*/
public class BOJ_1476_날짜계산 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int E = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int year = 0;
		while(true) {
			year ++;
			if((year-E)%15==0 && (year-S)%28==0 && (year-M)%19==0)break;
		}
		System.out.println(year);
	}
}
