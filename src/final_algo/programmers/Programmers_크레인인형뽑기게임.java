package final_algo.programmers;

import java.util.Stack;

public class Programmers_크레인인형뽑기게임 {

	class Solution {
	    public int solution(int[][] board, int[] moves) {
	        int answer = 0;
	        
	        Stack<Integer> stack = new Stack();
	        stack.push(0);
	        
	        
	        for (int move : moves) {
				for (int i = 0; i < board.length; i++) {
					if(board[i][move - 1] != 0) {
						//2. 만약 그 인형이 지금 현재 stack에 담겨있는 인형과 같다면 삭제하고 answer 값을 늘린다.
						if(board[i][move -1] ==  stack.peek()) {
							stack.pop();
							answer += 2;
							//1. board를 순회하며 각 위치에 moves index에 해당하는 인형을 stack에 담는다.
						}else {
							stack.push(board[i][move - 1]);
						}
						board[i][move - 1] = 0;
					}
				}
			}
	        
	        return answer;
	    }
	}

}
