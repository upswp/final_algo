package final_algo.programmers;

import java.util.ArrayList;

public class Programmers_소수만들기 {
    static class Solution {
        static int answer;
        static int[] check = new int[3];
        static ArrayList<Integer> list = new ArrayList<Integer>();
        public int solution(int[] nums) {
            nCr(0, 0, nums.length, nums);
            return answer;
        }

        public void nCr(int cnt, int start, int numLength, int[] nums) {
            int sum = 0;
            if (cnt == 3) {
                boolean flag = false;
                for (int j : check) {
                    sum += j;
                }
                for (int i = 2; i < sum; i++) {
                    if (sum % i == 0) {
                        flag = true;
                        break;
                    }
                }
                if (!flag){
                    answer++;
                }
                return;
            }
            for (int i = start; i < numLength; i++) {
                check[cnt] = nums[i];
                nCr(cnt + 1, i + 1, numLength, nums);
            }
        }
    }
}
