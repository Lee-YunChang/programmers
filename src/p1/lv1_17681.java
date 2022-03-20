package p1;

import java.util.ArrayList;
import java.util.List;

public class lv1_17681 {

    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.solution(6,new int[]{46, 33, 33 ,22, 31, 50},new int[]{27 ,56, 19, 14, 14, 10}));
    }

    static class Solution {
        public String[]  solution(int n, int[] arr1, int[] arr2) {

            String[] answer =  new String[n];


            for(int i = 0 ; i < n ; i++){
                answer[i] = String.format("%0"+n+"d",Long.parseLong(Integer.toBinaryString(arr1[i]|arr2[i]))); // OR 연산의 결과를 2진수화

                // 벽 or 공백 판별
                answer[i] = answer[i].replaceAll("1", "#");
                answer[i] = answer[i].replaceAll("0", " ");

            }

            return answer;
        }
    }
}
