package final_algo.programmers;

public class Programmers_하샤드수 {

    public static void main(String[] args) {

        class Solution {
            public boolean solution(int x) {
                int num = x ;
                boolean answer = true;
                // 자리수들의 합을 구하는 방법
                // 각 자리수들의 값을 구한후 자리수의 합을 변수에 저장
                int tmp = 0;
                while(x!=0){
                    tmp += x%10;
                    x /= 10;
                }
                // 합의 값으로 나누어 떨어지면 true 아니면 false
                if(num % tmp != 0){
                    answer = false;
                }
                return answer;
            }
        }
    }
}
