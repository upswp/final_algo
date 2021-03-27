package final_algo.boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_10809_알파벳찾기 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = br.readLine();
		char[] inputChar = input.toCharArray();
		int[] alphabet = new int[26];
		Arrays.fill(alphabet, -1);
		for (int i = 0; i < inputChar.length; i++) {
			int index = inputChar[i] - 'a';
			if(alphabet[index] == -1) {
				alphabet[index] = i;
			}
		}
		for (int i : alphabet) {
			sb.append(i).append(" ");
		}
		System.out.println(sb.toString());
		
	}
}
