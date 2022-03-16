package skillCheck;

public class lv2_348930 {

    public static void main(String[] args){

        Solution solution = new Solution();
        System.out.println(solution.solution(8 ,12));
    }

    static class Solution {
        public long  solution(int w, int h) {

            long a = w;
            long b = h;
            long gcd = gcb(a,b);

            long answer = a*b-(a+b-gcd);

            return answer;
        }

        public long gcb(long a, long b){

            long min = (a < b) ? a : b;
            // 참이면 a이고 아니면 b 인거지.
             long gcd = 0;
             for (int i = 1; i <= min; i++) {
                 if (a % i == 0 && b % i == 0) gcd = i;
             }

            return gcd;
        }
    }
}
