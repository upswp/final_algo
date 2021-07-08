package final_algo.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programmers_모의고사 {
    static class Solution {
        public static int[] solution(int[] answers) {
            int[] A = {1, 2, 3, 4, 5};
            int[] B = {2, 1, 2, 3, 2, 4, 5};
            int[] C = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

            int length = answers.length;
            int countA = 0;
            int countB = 0;
            int countC = 0;
            for (int i = 0; i < length; i++) {
                if (answers[i] == A[i%A.length]) countA++;
                if (answers[i] == B[i%B.length]) countB++;
                if (answers[i] == C[i%C.length]) countC++;
            }
            List<Integer> result = new ArrayList<>();
            int[] countingNum = new int[]{countA, countB, countC};
            Arrays.sort(countingNum);
            if (countingNum[2] == countA) {
                result.add(1);
            }
            if (countingNum[2] == countB) {
                result.add(2);
            }
            if (countingNum[2] == countC) {
                result.add(3);
            }
            int[] answer = new int[result.size()];
            for (int i = 0; i < result.size(); i++) {
                answer[i] = result.get(i);
            }

            Arrays.sort(answer);

            return answer;
        }

        public static void main(String[] args) {
            int[] arr = new int[]{1, 2, 3, 4, 5};
            solution(arr);
        }
    }
}
