package p1;

import java.util.Arrays;

public class lv1_87389 {

    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.solution(999999));
    }

    static class Solution {
        public int solution(int n) {

            int answer = 0;

            for(int i = 2 ; i <= 1000000; i++){
                if(n%i == 1){
                    answer = i;
                    break;
                }
            }
            return answer;
        }
    }
}
