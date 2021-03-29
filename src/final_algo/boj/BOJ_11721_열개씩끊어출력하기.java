package final_algo.boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_11721_열개씩끊어출력하기 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = br.readLine();
		
		int last_index = (int)Math.ceil((double)input.length()/(double)10);
		
		for (int i = 0; i < last_index; i++) {
			if(i == last_index-1) {
				sb.append(input.substring(i*10, input.length())).append("\n");
			}
			else {
				sb.append(input.substring(i*10, (i+1)*10)).append("\n");
			}
		}
		System.out.println(sb.toString());
	}
}
