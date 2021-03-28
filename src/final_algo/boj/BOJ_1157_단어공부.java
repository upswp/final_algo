package final_algo.boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_1157_단어공부 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] word = br.readLine().toUpperCase().toCharArray();
		int [] count = new int [26];
		for (int i = 0; i < word.length; i++) {
			count[word[i]-'A']++;
		}
		int max = 0;
		int idx = 0;
		
		for (int i = 0; i < 26; i++) {
			if(max<count[i]) {
				max=count[i];
				idx = i;
			}
		}
		
		int cnt = 0;
		for (int i = 0; i < 26; i++) {
			if(count[i] == max) cnt++;
		}
		System.out.println(cnt>1?"?":(char)(idx+'A'));
		
	}
}
