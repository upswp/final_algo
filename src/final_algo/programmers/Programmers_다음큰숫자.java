package final_algo.programmers;

public class Programmers_다음큰숫자 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int n) {
                int answer;

                // 조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 입니다.
                // 조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다.
                // n의 2진수를 구한다.
                // n의 2진수의 1의 갯수를 구한다.
                int num = Integer.bitCount(n);
                answer = n + 1;
                // while문을 반복하면서 n보다 크고 1의 갯수가 같은 애들의 숫자를 구한다.
                while (true) {
                    int check = Integer.bitCount(answer);
                    // 조건 3. n의 다음 큰 숫자는 조건 1,2를 만족하는 수 중 가장 작은 수 입니다.
                    if (check == num) {
                        break;
                    }
                answer++;
                }
                // 그 중 가장 작은 숫자를 출력한다.
                return answer;
            }
        }
    }
}
