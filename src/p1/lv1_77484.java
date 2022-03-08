package p1;

import java.util.Arrays;

public class lv1_77484 {

    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{1,2,3,4,5,6},new int[]{7,8,9,10,11,12}));
    }

    static class Solution {
        public int[]  solution(int[] lottos, int[] win_nums) {

            int[] answer = {7, 7};

            for (int i=0; i < lottos.length; i++) {
                if (lottos[i] == 0) {
                    answer[0] -= 1;
                    continue;
                }


                for (int j = 0; j < win_nums.length; j++) {
                    if (lottos[i] == win_nums[j]) {
                        answer[0] -= 1;
                        answer[1] -= 1;
                        break;
                    }
                }
            }

            if (answer[1]== 7) answer[1]=6;
            if (answer[0]== 7) answer[0]=6;

            return answer;
        }
    }
}
