package final_algo.programmers;

import java.util.Set;
import java.util.TreeSet;

public class Programmers_두개뽑아서더하기_v2 {

	class Solution {
		public int[] solution(int[] numbers) {
			Set<Integer> set = new TreeSet<>();
			for (int i = 0; i < numbers.length; i++) {
				for (int j = i+1; j < numbers.length; j++) {
					set.add(numbers[i]+numbers[j]);
				}
			}
			return set.stream().mapToInt(Integer::intValue).toArray();
		}
	}
}
