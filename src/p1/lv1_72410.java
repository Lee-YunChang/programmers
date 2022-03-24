package p1;

import java.util.Locale;

public class lv1_72410 {

    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.solution("abcdefghijklmn.p"	));
    }

    static class Solution {
        public String solution(String new_id) {

            String answer = null;

            new_id = new_id.toLowerCase(Locale.ROOT);
            new_id = new_id.replaceAll("[^a-z0-9_.-]","");
            new_id = new_id.replaceAll("[.]{2,}",".");

            if(new_id.charAt(0) == '.'){
                new_id = new_id.substring(1);
            }
            if (!new_id.isEmpty()&&new_id.charAt(new_id.length()-1) == '.'){
                new_id = new_id.substring(0,new_id.length()-1);
            }
            if(new_id.isEmpty()){
                new_id += "a";
            }
            if(new_id.length() >= 16){
                new_id = new_id.substring(0,15);
            }
            if (new_id.charAt(new_id.length()-1) == '.'){
                new_id = new_id.substring(0,new_id.length()-1);
            }
            if(new_id.length() <= 2){
                while(new_id.length() < 3){
                    new_id += new_id.substring(new_id.length()-1);
                }
            }
            answer = new_id;

            return answer;
        }
    }

}
