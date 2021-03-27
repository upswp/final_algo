package final_algo.boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_1032_명령프롬프트 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String [] files = new String[T];
		for (int t = 0; t < T; t++) {
			files[t] = br.readLine();
		}
		
		int fileLength = files[0].length();
		for (int i = 0; i < fileLength; i++) {
			boolean flag = true;
			char compare = files[0].charAt(i);
			for (int j = 1; j < T; j++) {
				if(compare != files[j].charAt(i)) {
					flag = false;
					break;
				}
			}
			if(flag)sb.append(compare);
			else sb.append('?');
		}
		System.out.println(sb.toString());
	}

}
