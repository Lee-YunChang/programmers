package p1;

public class lv1_12940 {

    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.solution(2,5));
    }

    static class Solution {
        public int[]  solution(int n, int m) {

            int[] answer = {};

            int min = (n < m) ? n : m;
            // 참이면 a이고 아니면 b 인거지.
            int gcd = 0;
            for (int i = 1; i <= min; i++) {
                if (n % i == 0 && m % i == 0) gcd = i;
            }

            int max = (n > m) ? n : m;
            int lcm  = 0;
            for(int i = n*m; i >= max; i--){
                if(i % n ==0 && i % m == 0) lcm = i;
            }

            answer = new int[]{gcd,lcm};
            return answer;
        }
    }
}
