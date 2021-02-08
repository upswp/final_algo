package final_algo.programmers;

public class Programmers_전화번호목록 {

	class Solution {
		public boolean solution(String[] phone_book) {
			boolean answer = true;
			for (int i = 0; i < phone_book.length; i++) {
				for (int j = 0; j < phone_book.length; j++) {
					if (i != j && phone_book[i].startsWith(phone_book[j])) {
						answer = false;
						break;
					}
					if (i != j && phone_book[j].startsWith(phone_book[i])) {
						answer = false;
						break;
					}
				}
			}
			return answer;
		}
	}
}
